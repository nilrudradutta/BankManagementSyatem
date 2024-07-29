
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transcations extends JFrame implements ActionListener{
    
    JButton deposit, withdrawl, fastcash, ministatement, pinchange, balanceenquiey, exit;
    String pinnumber;
    
    Transcations(String pinnumber){
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel Text = new JLabel("Please select your Transction");
        Text.setBounds(215, 300, 700, 35);
        Text.setForeground(Color.white);
        Text.setFont(new Font("System", Font.BOLD, 16));
        image.add(Text);
        
        deposit = new JButton("Deposite");
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(355, 415, 150, 30);
        withdrawl.addActionListener(this);
        add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.addActionListener(this);
        add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355, 450, 150, 30);
        ministatement.addActionListener(this);
        add(ministatement);
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        add(pinchange);
        
        balanceenquiey = new JButton("Balance Enquiry");
        balanceenquiey.setBounds(355, 485, 150, 30);
        balanceenquiey.addActionListener(this);
        add(balanceenquiey);
        
        exit = new JButton("Exit");
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
            System.exit(0);
        } else if (ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if (ae.getSource() == withdrawl){
            setVisible(false);
            new withdrawl(pinnumber).setVisible(true);
        }else if (ae.getSource() == fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if (ae.getSource() == pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if (ae.getSource() == balanceenquiey){
            setVisible(false);
            new BalanceEnquyry(pinnumber).setVisible(true);
        }else if (ae.getSource() == ministatement){
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Transcations("");
    }
}
