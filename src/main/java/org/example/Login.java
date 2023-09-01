package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField tfusername,tfpwd;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,20,100,30);
        add(lblusername);
        tfusername = new JTextField();
        tfusername.setBounds(150,20,150,30);
        add(tfusername);

        JLabel lblpwd = new JLabel("Password");
        lblpwd.setBounds(40,70,100,30);
        add(lblpwd);
        tfpwd = new JTextField();
        tfpwd.setBounds(150,70,150,30);
        add(tfpwd);

        JButton login = new JButton("Login");
        login.setBounds(200,180,150,70);
        add(login);
        login.addActionListener(this);

        setSize(600,300);
        setVisible(true);
        setLocation(450,200);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            String username = tfusername.getText();
            String pwd = tfpwd.getText();

            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"' and pwd = '"+pwd+"'";

            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()){
                setVisible(false);
                new Home();
            }
            else {
                JOptionPane.showMessageDialog(null,"Invalid Username or Password.");
                setVisible(true);
                tfusername.setText("");
                tfpwd.setText("");
                tfusername.requestFocus();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        new Login();
    }
}
