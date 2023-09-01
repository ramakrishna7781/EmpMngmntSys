package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame implements ActionListener {
    Splash(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(90,50,1500,90);
        heading.setFont((new Font("",Font.BOLD,70)));
        add(heading);
        setSize(1170,650);
        setLocation(200,50);
        setVisible(true);

        JButton login = new JButton("Login");
        login.setBounds(400,400,300,70);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[]args){
        new Splash();
    }
}