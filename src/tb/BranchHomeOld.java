package tb;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;

public class BranchHomeOld extends JFrame implements ActionListener{
    
    // Variables declaration - do not modify                     
    private JPanel panel;
    private JLabel Welcome;
    private JSeparator sep;
    private JButton NewLetterButton;
    private JButton UpdateLetterButton;
    private JButton ViewLetterButton;
    private JButton SignOutButton;
    private Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    // End of variables declaration
    
    public BranchHomeOld() {
        
        setBounds(100, 100, 500, 500);
        
        // 1. Create Instance.
        // 2. Set Bounds.
        // 3. Set Font.
        // 4. Set Foreground.
        // 5. Set Background.
        // 6. Add to Panel.
        // 7. Set Action Listener.
        // 8. Set Mouse Listener. 
        
    //        ------------------------------------------------------------------        
        
        panel = new JPanel();
	panel.setBackground(new Color(232, 246, 239));
	setContentPane(panel);
	panel.setLayout(null);
        
        Welcome = new JLabel("Welcome");
        Welcome.setBounds(200, 50, 100, 24);
        Welcome.setFont(new Font("Calibri", Font.BOLD, 24));
        Welcome.setForeground(new Color(76,76,109));
        panel.add(Welcome);
        
        sep = new JSeparator();
        sep.setBounds(50,90,400,5);
        panel.add(sep);
        
    //        ------------------------------------------------------------------
    
        NewLetterButton = new JButton("New Letter");
        NewLetterButton.setBounds(175,120,150,50);
        NewLetterButton.setFont(new Font("Sans Serif", Font.PLAIN, 18));
        NewLetterButton.setForeground(Color.WHITE);
        NewLetterButton.setBackground(new Color(35, 62, 139));
        NewLetterButton.setBorder(raisedbevel);
        panel.add(NewLetterButton);
        
        NewLetterButton.addActionListener(this);
        NewLetterButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                NewLetterButton.setBackground(new Color(30, 174, 152));
                NewLetterButton.setForeground(new Color(35, 62, 139));
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                //System.out.println("SignupButton Hover");
                NewLetterButton.setForeground(Color.WHITE);
                NewLetterButton.setBackground(new Color(35, 62, 139));
            }
        });
        
        // --
        
        UpdateLetterButton = new JButton("Update Letter");
        UpdateLetterButton.setBounds(175,190,150,50);
        UpdateLetterButton.setFont(new Font("Sans Serif", Font.PLAIN, 18));
        UpdateLetterButton.setForeground(Color.WHITE);
        UpdateLetterButton.setBackground(new Color(35, 62, 139));
        UpdateLetterButton.setBorder(raisedbevel);
        panel.add(UpdateLetterButton);
        
        UpdateLetterButton.addActionListener(this);
        UpdateLetterButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                UpdateLetterButton.setBackground(new Color(30, 174, 152));
                UpdateLetterButton.setForeground(new Color(35, 62, 139));
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                //System.out.println("SignupButton Hover");
                UpdateLetterButton.setForeground(Color.WHITE);
                UpdateLetterButton.setBackground(new Color(35, 62, 139));
            }
        });
        
        // --
        
        ViewLetterButton = new JButton("View Letter");
        ViewLetterButton.setBounds(175,260,150,50);
        ViewLetterButton.setFont(new Font("Sans Serif", Font.PLAIN, 18));
        ViewLetterButton.setForeground(Color.WHITE);
        ViewLetterButton.setBackground(new Color(35, 62, 139));
        ViewLetterButton.setBorder(raisedbevel);
        panel.add(ViewLetterButton);
        
        ViewLetterButton.addActionListener(this);
        ViewLetterButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                ViewLetterButton.setBackground(new Color(30, 174, 152));
                ViewLetterButton.setForeground(new Color(35, 62, 139));
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                //System.out.println("SignupButton Hover");
                ViewLetterButton.setForeground(Color.WHITE);
                ViewLetterButton.setBackground(new Color(35, 62, 139));
            }
        });
        
        // --
        
        SignOutButton = new JButton("Sign Out");
        SignOutButton.setBounds(175,330,150,50);
        SignOutButton.setFont(new Font("Sans Serif", Font.PLAIN, 18));
        SignOutButton.setForeground(Color.WHITE);
        SignOutButton.setBackground(new Color(35, 62, 139));
        SignOutButton.setBorder(raisedbevel);
        panel.add(SignOutButton);
        
        SignOutButton.addActionListener(this);
        SignOutButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                SignOutButton.setBackground(new Color(30, 174, 152));
                SignOutButton.setForeground(new Color(35, 62, 139));
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                //System.out.println("SignupButton Hover");
                SignOutButton.setForeground(Color.WHITE);
                SignOutButton.setBackground(new Color(35, 62, 139));
            }
        });
   
        
    //        ------------------------------------------------------------------
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        try{            
            // -- NEW LETTER BUTTON --
            if(ae.getSource() == NewLetterButton){
                System.out.println("New Letter Button Clicked");
                this.setVisible(false);
                new BranchAcknowledgement().setVisible(true);
            }
            
            // -- UPDATE LETTER BUTTON -- //
            if(ae.getSource() == UpdateLetterButton){
                System.out.println("Update Letter Button Clicked");
                this.setVisible(false);
                new BranchUpdate().setVisible(true);
            }
            
            // -- VIEW LETTER BUTTON -- //
            if(ae.getSource() == ViewLetterButton){
                System.out.println("View Letter Button Clicked");
                this.setVisible(false);
                new BranchViewLetter().setVisible(true);
            }
            
            // -- SIGN OUT BUTTON -- //
            if(ae.getSource() == SignOutButton){
                System.out.println("Sign Out Button Clicked");
                
                int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
                if(a==JOptionPane.YES_OPTION){  
                    this.setVisible(false);
                    new BranchLogin().setVisible(true); 
                }  
                
            }
               
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    

    
    public static void main(String args[]) {
        new BranchHomeOld().setVisible(true);
    }
}
