/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb;

import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.util.regex.*;

public class BranchSignUp extends JFrame implements ActionListener{
    
    private JPanel panel;
    private JLabel SignupLabel;
    private JSeparator sep;
    
    private JLabel EmpID;
    private JTextField EmpIDField;
    private JLabel FirstName;
    private JTextField FirstNameField;
    private JLabel LastName;
    private JTextField LastNameField;
    private JLabel Branch;
    private JComboBox BranchField;
    
    private JLabel Username;
    private JTextField UsernameField;
    private JLabel Password;
    private JPasswordField PasswordField;
    private JCheckBox PasswordCheckBox;
    private JLabel emailID;
    private JTextField emailIDField;
    
    private JButton SignupButton;
    private JButton BackButton;
    private Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    
    
    public BranchSignUp() {
        
        setBounds(100, 100, 700, 500);
        
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
        
        SignupLabel = new JLabel("Signup Form");
        SignupLabel.setBounds(280, 50, 125, 24);
        SignupLabel.setFont(new Font("Calibri", Font.BOLD, 24));
        SignupLabel.setForeground(new Color(76,76,109));
        panel.add(SignupLabel);
        
        sep = new JSeparator();
        sep.setBounds(100,90,500,5);
        panel.add(sep);
        
    //        ------------------------------------------------------------------
    
        EmpID = new JLabel("Employee ID:");
        EmpID.setBounds(150,120,120,24);
        EmpID.setFont(new Font("Sans Serif", Font.BOLD, 18));
        EmpID.setForeground(new Color(76,76,109));
        panel.add(EmpID);
        
        EmpIDField = new JTextField();
        EmpIDField.setBounds(290,120,250,24);
        EmpIDField.setFont(new Font("San Serif", Font.PLAIN, 16));
        panel.add(EmpIDField);
        
        // --        
        
        FirstName = new JLabel("First Name:");
        FirstName.setBounds(150,150,120,24);
        FirstName.setFont(new Font("Sans Serif", Font.BOLD, 18));
        FirstName.setForeground(new Color(76,76,109));
        panel.add(FirstName);
        
        FirstNameField = new JTextField();
        FirstNameField.setBounds(290,150,250,24);
        FirstNameField.setFont(new Font("San Serif", Font.PLAIN, 16));
        panel.add(FirstNameField);
        
        // --        
        
        LastName = new JLabel("Last Name:");
        LastName.setBounds(150,180,120,24);
        LastName.setFont(new Font("Sans Serif", Font.BOLD, 18));
        LastName.setForeground(new Color(76,76,109));
        panel.add(LastName);
        
        LastNameField = new JTextField();
        LastNameField.setBounds(290,180,250,24);
        LastNameField.setFont(new Font("San Serif", Font.PLAIN, 16));
        panel.add(LastNameField);
        
        // --        
        
        Branch = new JLabel("Branch:");
        Branch.setBounds(150,210,120,24);
        Branch.setFont(new Font("Sans Serif", Font.BOLD, 18));
        Branch.setForeground(new Color(76,76,109));
        panel.add(Branch);
        
        BranchField = new JComboBox();
        BranchField.setBounds(290,210,120,24);
        String[] BranchTitles = new String[]{"Branch 1","Branch 2",
                                                "Branch 3","Branch 4"};
        BranchField.setModel(new DefaultComboBoxModel(BranchTitles));
        BranchField.setFont(new Font("San Serif", Font.PLAIN, 16));
        panel.add(BranchField);
        
        // --        
        
        Username = new JLabel("Username:");
        Username.setBounds(150,240,120,24);
        Username.setFont(new Font("Sans Serif", Font.BOLD, 18));
        Username.setForeground(new Color(76,76,109));
        panel.add(Username);
        
        UsernameField = new JTextField();
        UsernameField.setBounds(290,240,250,24);
        UsernameField.setFont(new Font("San Serif", Font.PLAIN, 16));
        panel.add(UsernameField);
        
        // -- 
        
        Password = new JLabel("Password:");
        Password.setBounds(150,270,120,24);
        Password.setFont(new Font("Sans Serif", Font.BOLD, 18));
        Password.setForeground(new Color(76,76,109));
        panel.add(Password);
        
        PasswordField = new JPasswordField();
        PasswordField.setBounds(290,270,250,24);
        PasswordField.setFont(new Font("San Serif", Font.PLAIN, 16));
        panel.add(PasswordField);
        
        PasswordCheckBox = new JCheckBox("Show/Hide");
        PasswordCheckBox.setBounds(550, 270, 85, 20);
        PasswordCheckBox.setFont(new Font("Sans Serif", Font.PLAIN, 12));
        panel.add(PasswordCheckBox);
        PasswordCheckBox.addActionListener(this);
        
        
        // -- 
        
        emailID = new JLabel("Email ID:");
        emailID.setBounds(150,300,120,24);
        emailID.setFont(new Font("Sans Serif", Font.BOLD, 18));
        emailID.setForeground(new Color(76,76,109));
        panel.add(emailID);
        
        emailIDField = new JTextField();
        emailIDField.setBounds(290,300,250,24);
        emailIDField.setFont(new Font("San Serif", Font.PLAIN, 16));
        panel.add(emailIDField);
        
    //        ------------------------------------------------------------------
        
        SignupButton = new JButton("Sign Up");
        SignupButton.setBounds(350,350,100,40);
        SignupButton.setFont(new Font("Sans Serif", Font.PLAIN, 22));
        SignupButton.setForeground(Color.WHITE);
        SignupButton.setBackground(new Color(35, 62, 139));
        SignupButton.setBorder(raisedbevel);
        panel.add(SignupButton);
        
        SignupButton.addActionListener(this);
        SignupButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                SignupButton.setBackground(new Color(30, 174, 152));
                SignupButton.setForeground(new Color(35, 62, 139));
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                //System.out.println("SignupButton Hover");
                SignupButton.setForeground(Color.WHITE);
                SignupButton.setBackground(new Color(35, 62, 139));
            }
        });
        
        // --
        
        BackButton = new JButton("Back");
        BackButton.setBounds(200,350,100,40);
        BackButton.setFont(new Font("Sans Serif", Font.PLAIN, 22));
        BackButton.setForeground(Color.WHITE);
        BackButton.setBackground(new Color(35, 62, 139));
        BackButton.setBorder(raisedbevel);
        panel.add(BackButton);
        
        BackButton.addActionListener(this);
        BackButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                BackButton.setBackground(new Color(30, 174, 152));
                BackButton.setForeground(new Color(35, 62, 139));
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                //System.out.println("BackButton Hover");
                BackButton.setForeground(Color.WHITE);
                BackButton.setBackground(new Color(35, 62, 139));
            }
        });
        
    //        ------------------------------------------------------------------
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        try{
            ConnectionEstablish con = new ConnectionEstablish();
            
            // -- SIGNUP BUTTON --
            if(ae.getSource() == SignupButton){
                System.out.println("Signup Button Clicked");
                
                
                if(isValidPassword(PasswordField.getText()) != true) {
                    System.out.println("Invalid Password");
                    JOptionPane.showMessageDialog(null, "Invalid Password");
                }
                else {
                    String sql = "INSERT INTO employee(EmpID, FirstName, LastName, Branch, Username, Password, emailID) "
                                    + "values(?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, EmpIDField.getText());
                    st.setString(2, FirstNameField.getText());
                    st.setString(3, LastNameField.getText());
                    st.setString(4, (String) BranchField.getSelectedItem());
                    st.setString(5, UsernameField.getText());
                    st.setString(6, PasswordField.getText()); 
                    st.setString(7, emailIDField.getText());


                    int i = st.executeUpdate();
                    if (i > 0){
                        JOptionPane.showMessageDialog(null, "Successfully Created");
                    }

                    EmpIDField.setText("");
                    FirstNameField.setText("");
                    LastNameField.setText("");
                    UsernameField.setText("");
                    PasswordField.setText("");
                    emailIDField.setText("");
                }
            }
            
            // -- BACK BUTTON --
            if(ae.getSource() == BackButton){
                System.out.println("Back Button Clicked");
                this.setVisible(false);
                new BranchLogin().setVisible(true);
            }
            
            // -- PASSWORD CHECK BOX --
            if(PasswordCheckBox.isSelected()) {
                System.out.println("Show Password Enabled");
                PasswordField.setEchoChar((char)0);
            }
            else {
                System.out.println("Show Password Disabled");
                PasswordField.setEchoChar('*');
            }    
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public static boolean isValidPassword(String password)
    {
  
        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);
  
        // Return if the password
        // matched the ReGex
        return m.matches();
    }
    
    
    public static void main(String args[]) {
        new BranchSignUp().setVisible(true);
    }
}
