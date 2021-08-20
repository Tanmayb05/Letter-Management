package Letter.Management;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import static javax.swing.BorderFactory.createEtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import java.sql.PreparedStatement;
import java.sql.ResultSet;import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import tb.ClerkHome;

/**
 *
 * @author Lenovo
 */
public class BranchLogin extends javax.swing.JFrame {

    /**
     * Creates new form ClerkLogin
     */
    public static ResourceBundle resourceBundle;
    public BranchLogin() {
        initComponents();
        init();
        initBranchComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BodyPanel = new javax.swing.JPanel();
        PasswordPanel = new javax.swing.JPanel();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        ShowPasswordToggle = new javax.swing.JToggleButton();
        BranchComboBox = new javax.swing.JComboBox<>();
        LoginButtonPanel = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 525, 425));
        setMinimumSize(new java.awt.Dimension(525, 425));
        setName("ClerkLogin"); // NOI18N
        setSize(new java.awt.Dimension(525, 425));

        BodyPanel.setBackground(new java.awt.Color(204, 204, 255));
        BodyPanel.setMaximumSize(new java.awt.Dimension(500, 400));
        BodyPanel.setMinimumSize(new java.awt.Dimension(500, 400));
        BodyPanel.setPreferredSize(new java.awt.Dimension(500, 400));

        PasswordPanel.setBackground(new java.awt.Color(204, 204, 255));
        PasswordPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "लॉगिन", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 36))); // NOI18N

        PasswordLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        PasswordLabel.setText("पासवर्ड:");

        PasswordField.setText("password");
        PasswordField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PasswordField.setNextFocusableComponent(LoginButton);
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
        });

        ShowPasswordToggle.setBackground(new java.awt.Color(229, 251, 184));
        ShowPasswordToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img-src/eye.png"))); // NOI18N
        ShowPasswordToggle.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ShowPasswordToggleStateChanged(evt);
            }
        });

        BranchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Branch" }));

        javax.swing.GroupLayout PasswordPanelLayout = new javax.swing.GroupLayout(PasswordPanel);
        PasswordPanel.setLayout(PasswordPanelLayout);
        PasswordPanelLayout.setHorizontalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(PasswordLabel)
                .addGap(18, 47, Short.MAX_VALUE)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ShowPasswordToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BranchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PasswordPanelLayout.setVerticalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BranchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ShowPasswordToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        LoginButtonPanel.setBackground(new java.awt.Color(204, 204, 255));

        LoginButton.setBackground(new java.awt.Color(254, 152, 152));
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img-src/login.png"))); // NOI18N
        LoginButton.setNextFocusableComponent(ShowPasswordToggle);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginButtonPanelLayout = new javax.swing.GroupLayout(LoginButtonPanel);
        LoginButtonPanel.setLayout(LoginButtonPanelLayout);
        LoginButtonPanelLayout.setHorizontalGroup(
            LoginButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginButtonPanelLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginButtonPanelLayout.setVerticalGroup(
            LoginButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PasswordPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(PasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(LoginButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        // TODO add your handling code here:
        if(PasswordField.getText().equals("password") == true) {
            PasswordField.setText("");
        }
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void ShowPasswordToggleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ShowPasswordToggleStateChanged
        // TODO add your handling code here:
        if (ShowPasswordToggle.isSelected()) {
            PasswordField.setEchoChar((char)0);
            ShowPasswordToggle.setBackground(new Color(51,255,51));
        }
        else {
            PasswordField.setEchoChar('*');
            ShowPasswordToggle.setBackground(new Color(229,251,184));
        }
    }//GEN-LAST:event_ShowPasswordToggleStateChanged

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        int flag = 0;
        
        try {
            
            String password = (String) PasswordField.getText();
            String branch = BranchComboBox.getSelectedItem().toString();
            ConnectionEstablish con = new ConnectionEstablish();
            String sql = "SELECT * from letteremployee "
                    + "WHERE Password = '"+password+"'"
                    + "AND Branch = '"+branch+"'";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                flag = 1;
                
                String tobranch = rs.getString("Branch");
                String toname = rs.getString("Name");
                create(tobranch,toname);
                
                JOptionPane.showMessageDialog(null,"स्वागत आहे");
                this.setVisible(false);
                new BranchWorksheet().setVisible(true);
            }
            
            if (flag == 0)
                JOptionPane.showMessageDialog(null,"चुकिचा पासवर्ड");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void create(String branchArgument, String toArgument){
        try {
            FileWriter myWriter = new FileWriter("login.txt");
            myWriter.write(branchArgument+","+toArgument);
            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
//            System.out.println("An error occurred.");
            e.printStackTrace();
        }
            
            /*
            try {
                File myObjRead = new File("login.txt");
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
            */
    }
    
    
    private void init() {
//        setExtendedState(MAXIMIZED_BOTH);
        setUIFont (new javax.swing.plaf.FontUIResource("SansSerif",Font.PLAIN,12));
        
        URL iconURL = getClass().getResource("/img-src/logo.png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        setTitle("जलसंपदा विभाग, महाराष्ट्र शासन, भारत");
                
    }
    
    private void initBranchComboBox() {
        
        BranchComboBox.removeAllItems();
        BranchComboBox.addItem("शाखा निवडा");
        
        try {

            
            
            // SQL command data stored in String datatype
            ConnectionEstablish con = new ConnectionEstablish();
            String sql = "select DISTINCT Branch from letteremployee ORDER BY Branch";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            // Condition check
            while (rs.next()) {
                BranchComboBox.addItem(rs.getString("Branch"));
            }
            
        }   catch (SQLException e) {
            // Print exception pop-up on screen
            System.out.println(e);
            }
    }
    
    public static void setUIFont (javax.swing.plaf.FontUIResource f){
    java.util.Enumeration keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
      Object key = keys.nextElement();
      Object value = UIManager.get (key);
      if (value instanceof javax.swing.plaf.FontUIResource)
        UIManager.put (key, f);
      }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BranchLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BranchLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BranchLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BranchLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BranchLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JComboBox<String> BranchComboBox;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginButtonPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel PasswordPanel;
    private javax.swing.JToggleButton ShowPasswordToggle;
    // End of variables declaration//GEN-END:variables
}
