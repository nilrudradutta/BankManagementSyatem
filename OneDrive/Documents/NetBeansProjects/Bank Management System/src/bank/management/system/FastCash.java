
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton deposit, withdrawl, fastcash, ministatement, pinchange, balanceenquiey, exit;
    String pinnumber;
    
    FastCash (String pinnumber){
        
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel Text = new JLabel("Select WITHDRAWL amount");
        Text.setBounds(215, 300, 700, 35);
        Text.setForeground(Color.white);
        Text.setFont(new Font("System", Font.BOLD, 16));
        image.add(Text);
        
        deposit = new JButton("Rs 100");
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        add(deposit);
        
        withdrawl = new JButton("Rs 500");
        withdrawl.setBounds(355, 415, 150, 30);
        withdrawl.addActionListener(this);
        add(withdrawl);
        
        fastcash = new JButton("Rs 1000");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.addActionListener(this);
        add(fastcash);
        
        ministatement = new JButton("Rs 2000");
        ministatement.setBounds(355, 450, 150, 30);
        ministatement.addActionListener(this);
        add(ministatement);
        
        pinchange = new JButton("Rs 5000");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        add(pinchange);
        
        balanceenquiey = new JButton("Rs 10000");
        balanceenquiey.setBounds(355, 485, 150, 30);
        balanceenquiey.addActionListener(this);
        add(balanceenquiey);
        
        exit = new JButton("BACK");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        add(exit);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            setVisible(false);
            new Transcations(pinnumber). setVisible(true);
        } else{
            String amount = ((JButton)ae.getSource()).getText().substring(3); // Rs 500;
            Conn c = new Conn();
            try{
                ResultSet rs = c.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next()){
                    if (rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else  {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if (ae.getSource() != exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Not enough balance in the Account");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"','"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+ amount + "Debited Successfully");
                
                setVisible(false);
                new Transcations(pinnumber).setVisible(true);
            }catch (Exception e){
                System.out.println(e);        
            }
        }
    }
    
    public static void main(String args[]){
        new FastCash("");
    }
}
