
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;
    String pinnumber;
    
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280,40,400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 150, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 180, 250, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220, 150, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 220, 250, 20);
        add(r4);
        
        ButtonGroup acc = new ButtonGroup();
        acc.add(r1);
        acc.add(r2);        
        acc.add(r3);        
        acc.add(r4);
        
        
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);
        
        JLabel num = new JLabel("XXXX-XXXX-XXXX-4145");
        num.setFont(new Font("Raleway", Font.BOLD, 22));
        num.setBounds(330, 300, 300, 20);
        add(num);
        
        JLabel carddetils = new JLabel("Your 16 Digit Card Number");
        carddetils.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetils.setBounds(100, 330, 200, 20);
        add(carddetils);
        
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);
        
        JLabel pnum = new JLabel("XXXX");
        pnum.setFont(new Font("Raleway", Font.BOLD, 22));
        pnum.setBounds(330, 370, 200, 30);
        add(pnum);
        
        JLabel pindetils = new JLabel("Your 4 PIN Number");
        pindetils.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetils.setBounds(100, 400, 300, 20);
        add(pindetils);
        
        JLabel services = new JLabel("Services Requried:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 400, 30);
        add(services);
        
        c1= new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        c1.setBackground(Color.white);
        add(c1);
        
        c2= new JCheckBox("Interet Banking");
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        c2.setBackground(Color.white);
        add(c2);
        
        c3= new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        c3.setBackground(Color.white);
        add(c3);
        
        c4= new JCheckBox("Email & SMS Alert");
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 550, 200, 30);
        c4.setBackground(Color.white);
        add(c4);
        
        c5= new JCheckBox("Cheque Box");
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        c5.setBackground(Color.white);
        add(c5);
        
        c6= new JCheckBox("E-statement");
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 600, 200, 30);
        c6.setBackground(Color.white);
        add(c6);
        
        c7= new JCheckBox("I hereby declares that the above entered details are correct to the best of my Knowledge");
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 680, 600, 30);
        c7.setBackground(Color.white);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }else if(r2.isSelected()){
                accountType = "Fixed Deposite Account";
            }else if(r3.isSelected()){
                accountType = "Current Account";
            }else if(r4.isSelected()){
                accountType = "Recurring Deposite Account";
            }
            
            Random random = new Random();
            String cardnumber = "" +Math.abs((random.nextLong() % 90000000L)+ 5040936000000000L);
            
            String pin = "" + Math.abs((random.nextLong() % 9000L)+ 1000L);
            
            String facility = "";
            if(c1.isSelected()){
                facility = facility + "ATM Card";
            }else if (c2.isSelected()){
                facility = facility + "Internet Banking";
            }else if (c3.isSelected()){
                facility = facility + "Mobile banking";
            }else if (c4.isSelected()){
                facility = facility + "EMAIL & SMS Alerts";
            }else if (c5.isSelected()){
                facility = facility + "Cheque Book";
            }else if (c6.isSelected()){
                facility = facility + "E-Statement";
            }
            
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "AccountType is Requried");
                }else {
                    Conn conn = new Conn();
                    String query1 = "insert into signthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pin+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pin+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeLargeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n PIN Nunber: " + pin );
                    
                    
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                }
            }catch(Exception e){
                System.out.println(e);
            }

            
        }else if (ae.getSource() ==  cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new SignupThree("");
    }   
}
