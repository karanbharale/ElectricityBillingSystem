package System;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CustomerDetails extends JFrame implements ActionListener{

    Choice meternumber, cmonth;
    JTable table;
    JButton search, print;
    
    CustomerDetails(){
        super("Customer Details");
        
        setSize(1200, 650);
        setLocation(200, 150);
//-------------------------------------------------------------------------------------------------------------------
        
        table = new JTable();
        
      //My-SQl code is here
        
//-------------------------------------------------------------------------------------------------------------------
        JScrollPane sp = new JScrollPane(table);
        add(sp);
        
        print = new JButton("Print");
        print.addActionListener(this);
        add(print, "South");
        
        
        setVisible(true);
    }
//-------------------------------------------------------------------------------------------------------------------
    public void actionPerformed(ActionEvent ae) {
    	
    	//My-SQl code is here
    	
    }
//-------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        new CustomerDetails();
    }
}
