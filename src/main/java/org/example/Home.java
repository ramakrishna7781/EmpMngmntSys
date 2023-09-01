package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

    JButton add,view,update,remove;
    Home(){
        setLayout(null);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(620,20,400,40);
        heading.setFont((new Font("",Font.BOLD,25)));
        add(heading);

        add = new JButton("Add Employee");
        add.setBounds(650,80,150,40);
        add(add);
        add.addActionListener(this);

        view = new JButton("View Employee");
        view.setBounds(820,80,150,40);
        add(view);
        view.addActionListener(this);

        update = new JButton("Update Employee");
        update.setBounds(650,140,150,40);
        add(update);
        update.addActionListener(this);

        remove = new JButton("Remove Employee");
        remove.setBounds(820,140,150,40);
        add(remove);
        remove.addActionListener(this);

        setSize(1120,630);
        setLocation(250,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == add){
            setVisible(false);
            new AddEmp();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmp();
        }else if (ae.getSource() == update){
            setVisible(false);
            new ViewEmp();
        }else {
            setVisible(false);
            new RemoveEmp();
        }
    }
    public static void main(String[]args){
        new Home();
    }
}
