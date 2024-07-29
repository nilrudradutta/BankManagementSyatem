
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField panTextField, adhaarTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;  
    JComboBox religion, catagory, Income, Edu, Occ;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FROM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details ");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[] =  {"Hindu", "Muslim", "Sikh", "Christian", "Others"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        String valCatagory[] =  {"General", "OBC", "SC", "ST", "Others"};
        catagory = new JComboBox(valCatagory);
        catagory.setBounds(300, 190, 400, 30);
        catagory.setBackground(Color.WHITE);
        add(catagory);
        
        
        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        String valIncome[] =  {"Null", "<1.5lakh", "<2.5lakh", "<5lakh", "upto 10lakh"};
        Income = new JComboBox(valIncome);
        Income.setBounds(300, 240, 400, 30);
        Income.setBackground(Color.WHITE);
        add(Income);
        
        
        JLabel gender = new JLabel("Educational: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 314, 200, 30);
        add(email);
        
        String valEdu[] = {"10th pass", "12th pass", "Bachalors", "Masters", "Doctrate"};
        Edu = new JComboBox(valEdu);
        Edu.setBounds(300, 315, 400, 30);
        Edu.setBackground(Color.WHITE);
        add(Edu);
        
        
        JLabel marital = new JLabel("Ocupation:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        String valOcc[] = {"Salaried", "Self-Employed", "Bussiness-man", "Student", "Retaried"};
        Occ = new JComboBox(valOcc);
        Occ.setBounds(300, 390, 400, 30);
        Occ.setBackground(Color.WHITE);
        add(Occ);
        
        
        JLabel address = new JLabel("Pan No.: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        JLabel city = new JLabel("Adhaar No. : ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        adhaarTextField = new JTextField();
        adhaarTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        adhaarTextField.setBounds(300, 490, 400, 30);
        add(adhaarTextField);
        
        JLabel state = new JLabel("Senior Citizen: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.white);
        add(sno);
       
        ButtonGroup sc = new ButtonGroup();
        sc.add(syes);
        sc.add(sno);
        
        
        JLabel pincode = new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.white);
        add(eno);
       
        ButtonGroup ec = new ButtonGroup();
        ec.add(eyes);
        ec.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    
    public void actionPerformed (ActionEvent ae) {
    String sr = (String) religion.getSelectedItem();
    String sc = (String) catagory.getSelectedItem();
    String si = (String) Income.getSelectedItem();
    String se = (String) Edu.getSelectedItem();
    String so = (String) Occ.getSelectedItem();
    String sp = panTextField.getText();
    String sa = adhaarTextField.getText();

    String s_citizen = null;
    if(syes.isSelected()){
        s_citizen = "Yes";
    } else if (sno.isSelected()){
        s_citizen = "No";
    }

    String e_acc = null;
    if(eyes.isSelected()){
        e_acc = "Yes";
    } else if (eno.isSelected()){
        e_acc = "No";
    }

    try {
        Conn c = new Conn();
        System.out.println("Form No: " + formno);
        System.out.println("Religion: " + sr);
        System.out.println("Category: " + sc);
        System.out.println("Income: " + si);
        System.out.println("Education: " + se);
        System.out.println("Occupation: " + so);
        System.out.println("Pan No: " + sp);
        System.out.println("Adhaar No: " + sa);
        System.out.println("Senior Citizen: " + s_citizen);
        System.out.println("Existing Account: " + e_acc);
        
        String query = "INSERT INTO signtwo VALUES('" + formno + "', '" + sr + "', '" + sc + "', '" + si + "', '" + se + "', '" + so + "', '" + sp + "', '" + sa + "', '" + s_citizen + "', '" + e_acc + "')";
        c.s.executeUpdate(query);
        System.out.println("Data inserted successfully");
        
        setVisible(false);
        new SignupThree(formno).setVisible(true);
        
        
    } catch (Exception e) {
        System.out.println(e);
    }
}

    
    
    public static void main(String args[]) {
        new SignupTwo("");
    }
    
}
