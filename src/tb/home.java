/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

        
public class home extends JFrame implements ActionListener{

    // Variables declaration - do not modify                     
    private JPanel panel;
    private JLabel LetterManagement;
    private JSeparator sep;
    private JButton Clerk;
    private JButton Branch;
    // End of variables declaration
    
    public home() {
        
        setBackground(new Color(5, 55, 56));	
        setBounds(100, 100, 500, 500);
        
        
        panel = new JPanel();
	panel.setBackground(new Color(5, 55, 56));
	setContentPane(panel);
	panel.setLayout(null);
        
        
        LetterManagement = new JLabel("Inward Register");
        LetterManagement.setBounds(145, 50, 265, 32);
        LetterManagement.setFont(new Font("Calibri", Font.BOLD, 32));
        LetterManagement.setForeground(new Color(255, 255, 255));
        panel.add(LetterManagement);
        
        
        sep = new JSeparator();
        sep.setBounds(97, 87, 305, 3);
        panel.add(sep);
        
        
        Clerk = new JButton("Clerk");
        Clerk.setBounds(175, 200, 150, 50);
        
        /*
        |         ___________        ___________         |    200
        |         |  Clerk  |        | Branch  |         |     |
        |         |---------|        |---------|         |    30
        |<- 147 ->|<- 100 ->|<- 84 ->|<- 122 ->|<- 147 ->|
        */
        
	Clerk.addActionListener(this);
        Clerk.setFont(new Font("Sans Serif", Font.BOLD, 30));
        Clerk.setForeground(new Color(248, 237, 227));
	Clerk.setBackground(new Color(162, 178, 159));
        panel.add(Clerk);
        Clerk.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                Clerk.setBackground(new Color(248, 237, 227));
                Clerk.setForeground(new Color(162, 178, 159));
                }
            @Override
            public void mouseExited(MouseEvent evt) {
                Clerk.setForeground(new Color(248, 237, 227));
                Clerk.setBackground(new Color(162, 178, 159));
                }
        });
        
              
        Branch = new JButton("Branch");
        Branch.setBounds(175, 280, 150, 50);
        
        /*
        |         ___________        ___________         |    200
        |         |  Clerk  |        | Branch  |         |     |
        |         |---------|        |---------|         |    30
        |<- 147 ->|<- 100 ->|<- 84 ->|<- 122 ->|<- 147 ->|
        */
        
	Branch.addActionListener(this);
        Branch.setFont(new Font("Sans Serif", Font.BOLD, 30));
        Branch.setForeground(new Color(248, 237, 227));
	Branch.setBackground(new Color(162, 178, 159));
        panel.add(Branch);
        Branch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Branch.setBackground(new Color(248, 237, 227));
                Branch.setForeground(new Color(162, 178, 159));
                }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Branch.setForeground(new Color(248, 237, 227));
                Branch.setBackground(new Color(162, 178, 159));
                }
        });
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }                    

    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Clerk) {
            setVisible(false);
            ClerkLogin LC = new ClerkLogin();
            LC.setVisible(true);
        }
        if (ae.getSource() == Branch) {
            setVisible(false);
            BranchLogin LB = new BranchLogin();
            LB.setVisible(true);
        }
    }
    
    
    public static void main(String args[]) {
        new home().setVisible(true);
    }

    
}
