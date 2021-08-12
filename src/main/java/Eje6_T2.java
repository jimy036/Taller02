/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Eje6_T2 extends JPanel implements ActionListener {
    
    private JRadioButton rb1,rb2,rb3,rb4,rb5;
    
    static String aString="Ave";
    static String gString="Gato";
    static String pString="Perro";
    static String cString="Conejo";
    static String oString="Osito";
    static JFrame frame;
    JLabel picture;
    
    
    public Eje6_T2 (){
        picture=new JLabel();
        
        
        rb1 = new javax.swing.JRadioButton("Ave");
        rb2 = new javax.swing.JRadioButton("Gato");
        rb3 = new javax.swing.JRadioButton("Perro");
        rb4 = new javax.swing.JRadioButton("Conejo");
        rb5 = new javax.swing.JRadioButton("Osito");
       
        
        ButtonGroup GroupPets = new ButtonGroup();
        GroupPets.add(rb1);
        GroupPets.add(rb2);
        GroupPets.add(rb3);
        GroupPets.add(rb4);
        GroupPets.add(rb5);
        
        rb1.setBounds(10, 15, 60, 20);
        rb1.setMnemonic(KeyEvent.VK_A);
        rb1.setActionCommand(aString); //aún no sé qué hace
        add(rb1);
        
        rb2.setBounds(10, 41, 60, 20);
        rb2.setMnemonic(KeyEvent.VK_G);
        rb2.setActionCommand(gString); //aún no sé qué hace
        add(rb2);
        
        rb3.setBounds(10, 67, 60, 20);
        rb3.setMnemonic(KeyEvent.VK_P);
        rb3.setActionCommand(pString); //aún no sé qué hace
        add(rb3);
        
        
        rb4.setBounds(10, 93, 70, 20);
        rb4.setMnemonic(KeyEvent.VK_C);
        rb4.setActionCommand(cString); //aún no sé qué hace
        add(rb4);
        
        rb5.setBounds(10, 119, 60, 20);
        rb5.setMnemonic(KeyEvent.VK_O);
        rb5.setActionCommand(oString); //aún no sé qué hace
        add(rb5);
        
        picture.setBounds(100,10,200,140);
        //picture.setBackground(Color.red);
        //picture.setOpaque(true);
        add(picture);
        
        RadioListener myListener = new RadioListener();
        rb1.addActionListener(myListener);
        rb2.addActionListener(myListener);
        rb3.addActionListener(myListener);
        rb4.addActionListener(myListener);
        rb5.addActionListener(myListener);
        
        
    JPanel rbutton = new JPanel();    
    setLayout(new BorderLayout());
    setSize(340,200);
    add(rbutton);
    }
    
    
    public static void main (String[]args){
         frame = new JFrame("Select Animals");
         frame.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {System.exit(0);}
         });
 
         frame.getContentPane().add(new Eje6_T2(), BorderLayout.CENTER);
         frame.pack();
         frame.setVisible(true);
         frame.setResizable(false);
         frame.setSize(340,200);
         
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
    }

     class RadioListener implements ActionListener { 
        public void actionPerformed(ActionEvent e) {
        picture.setIcon(new ImageIcon("ImgPets/" 
                                     + e.getActionCommand() 
                                     + ".png"));

       
    
        }

        
    }
    
}
