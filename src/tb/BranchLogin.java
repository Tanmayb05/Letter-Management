package tb;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;


public class BranchLogin extends JFrame implements ActionListener{
    
    private JPanel panel;
    private JLabel Branch;
    private JSeparator sep;
    
    private JComboBox BranchNo;
    
    private JLabel UsernameLabel;
    private ImageIcon usernameIcon = new ImageIcon("C:\\Users\\Lenovo\\Documents\\Dropbox\\Java\\Letter Management\\src\\img-src\\UsernameBranch.png","Username");
    private JTextField UsernameTextField;
    private JLabel PasswordLabel;
    private ImageIcon passwordIcon = new ImageIcon("C:\\Users\\Lenovo\\Documents\\Dropbox\\Java\\Letter Management\\src\\img-src\\PasswordBranch.png","Password");
    private JPasswordField PasswordField;
    ImageIcon ShowPasswordIcon = new ImageIcon("C:\\Users\\Lenovo\\Documents\\Dropbox\\Java\\Letter Management\\src\\img-src\\eye.png","Show Password");
    private JLabel ShowPassword;
    
    private Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    private JButton Login;
    private JButton Signup;
    private JButton ForgotPassword;
            
    
    public BranchLogin() {
        
        setBounds(100, 100, 700, 500);
        
        //        --------------------------------------------------------------
        
        panel = new JPanel();
	panel.setBackground(new Color(232, 246, 239));
	setContentPane(panel);
	panel.setLayout(null);
        
        //        --------------------------------------------------------------
        
        Branch = new JLabel("BRANCH LOGIN");
        Branch.setBounds(225, 50, 250, 32);
        Branch.setFont(new Font("Sans Serif", Font.BOLD, 32));
        Branch.setForeground(new Color(76,76,109));
        panel.add(Branch);
        
        
        sep = new JSeparator();
        sep.setBounds(100,90,500,5);
        panel.add(sep);
        
        //        --------------------------------------------------------------

        BranchNo = new JComboBox();
        BranchNo.setBounds(250,130,250,28);
        String[] BranchTitles = new String[]{"Branch 1","Branch 2",
                                                "Branch 3","Branch 4"};
        BranchNo.setModel(new DefaultComboBoxModel(BranchTitles));
        BranchNo.setFont(new Font("San Serif", Font.PLAIN, 16));
        panel.add(BranchNo);
        
        
        
        //        --------------------------------------------------------------
        
        UsernameLabel = new JLabel(usernameIcon);
        UsernameLabel.setBounds(150,180,58,58);
        UsernameLabel.setBackground(Color.white);
        panel.add(UsernameLabel);
        
        UsernameTextField = new JTextField();
        UsernameTextField.setBounds(250,195,250,28);
        UsernameTextField.setFont(new Font("San Serif", Font.PLAIN, 16));
        panel.add(UsernameTextField);
        
        
        PasswordLabel = new JLabel(passwordIcon);
        PasswordLabel.setBounds(145,260,58,58);
        PasswordLabel.setBackground(Color.white);
        panel.add(PasswordLabel);
        
        PasswordField = new JPasswordField();
        PasswordField.setBounds(250,275,250,28);
        PasswordField.setFont(new Font("San Serif", Font.PLAIN, 16));
        panel.add(PasswordField);
        
        
        ShowPassword = new JLabel("",ShowPasswordIcon,JLabel.CENTER);
        ShowPassword.setBounds(520,275,24,24);
        panel.add(ShowPassword);
        
        ShowPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                PasswordField.setEchoChar((char)0);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                PasswordField.setEchoChar('*');
            }
        });
        

        //        --------------------------------------------------------------
        //      Green - (30, 174, 152)
        //      Blue  - (35, 62, 139)
        Login = new JButton("Login");
        Login.setBounds(100,350,100,40);
        Login.setFont(new Font("Sans Serif", Font.PLAIN, 22));
        Login.setForeground(Color.WHITE);
        Login.setBackground(new Color(35, 62, 139));
        Login.setBorder(raisedbevel);
        panel.add(Login);
        
        Login.addActionListener(this);
        Login.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                Login.setBackground(new Color(30, 174, 152));
                Login.setForeground(new Color(35, 62, 139));
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                Login.setForeground(Color.WHITE);
                Login.setBackground(new Color(35, 62, 139));
            }
        });
        
        //        --------------------------------------------------------------
        
        Signup = new JButton("Signup");
        Signup.setBounds(235,350,125,40);
        Signup.setFont(new Font("Sans Serif", Font.PLAIN, 22));
        Signup.setForeground(Color.WHITE);
        Signup.setBackground(new Color(35, 62, 139));
        Signup.setBorder(raisedbevel);
        panel.add(Signup);
        
        Signup.addActionListener(this);
        Signup.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                Signup.setBackground(new Color(30, 174, 152));
                Signup.setForeground(new Color(35, 62, 139));
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                Signup.setForeground(Color.WHITE);
                Signup.setBackground(new Color(35, 62, 139));
            }
        });
        
        //        --------------------------------------------------------------
        
        ForgotPassword = new JButton("Forgot Password");
        ForgotPassword.setBounds(390,350,210,40);
        ForgotPassword.setFont(new Font("Sans Serif", Font.PLAIN, 22));
        ForgotPassword.setForeground(Color.WHITE);
        ForgotPassword.setBackground(new Color(35, 62, 139));
        ForgotPassword.setBorder(raisedbevel);
        panel.add(ForgotPassword);
        
        ForgotPassword.addActionListener(this);
        ForgotPassword.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                ForgotPassword.setBackground(new Color(30, 174, 152));
                ForgotPassword.setForeground(new Color(35, 62, 139));
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                ForgotPassword.setForeground(Color.WHITE);
                ForgotPassword.setBackground(new Color(35, 62, 139));
            }
        });

        //        --------------------------------------------------------------  

      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //***     ------------------------------------------------------------------
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Login) {
            
            System.out.println("Login Clicked");
            
            try {
                ConnectionEstablish con = new ConnectionEstablish();
                String sql = "SELECT * FROM employee WHERE Branch=? AND Username=? AND Password=?";
                PreparedStatement st = con.c.prepareStatement(sql);
                
                st.setString(1, (String) BranchNo.getSelectedItem());
                st.setString(2, UsernameTextField.getText());
                st.setString(3, PasswordField.getText());
                
                System.out.println("Branch No = "+BranchNo.getSelectedItem());
                System.out.println("Username = "+UsernameTextField.getText());
                System.out.println("Password = "+PasswordField.getText());
                
                ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        
                        String branchArgument = (String)BranchNo.getSelectedItem();
                        String toArgument = rs.getString("Name");
                        create(branchArgument, toArgument);
                        
                        this.setVisible(false);
                        new BranchHome().setVisible(true);
                    } else
			JOptionPane.showMessageDialog(null, "Invalid Login...!.");
                       
		} catch (HeadlessException | SQLException e2) {
                    e2.printStackTrace();
                }
        }
        if(ae.getSource() == Signup){
            System.out.println("Signup Clicked");
            this.setVisible(false);  
            new BranchSignUp().setVisible(true);
        }   
        if(ae.getSource() == ForgotPassword){
            System.out.println("ForgotPassword Clicked");
            this.setVisible(false);  
            new home().setVisible(true);
        }
    }
    
    private void create(String branchArgument, String toArgument){
        try {
            FileWriter myWriter = new FileWriter("login.txt");
            myWriter.write(branchArgument+","+toArgument);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
            
            
            try {
                File myObjRead = new File("filename.txt");
                Scanner myReader = new Scanner(myObjRead);
                while (myReader.hasNextLine()) {
                  String data = myReader.nextLine();
                  System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }
            
    
    public static void main(String args[]) {
        new BranchLogin().setVisible(true);
    }
}
