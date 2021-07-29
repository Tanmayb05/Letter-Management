package tb;

import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class combine extends javax.swing.JFrame {

    /**
     * Creates new form combine
     */
    public combine() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClerkHomePanel = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        ClerkHomeSeparator = new javax.swing.JSeparator();
        AddToDirectoryButton = new javax.swing.JButton();
        ViewDirectoryButton = new javax.swing.JButton();
        ViewEmployeeButton = new javax.swing.JButton();
        SignOutButton = new javax.swing.JButton();
        Tab = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ClerkLoginLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        UsernameIcon = new javax.swing.JLabel();
        PasswordIcon = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        ShowPasswordIcon = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        SignupButton = new javax.swing.JButton();
        ForgotPasswordButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        ClerkHomePanel1 = new javax.swing.JPanel();
        AddToDirectoryButton1 = new javax.swing.JButton();
        ViewDirectoryButton1 = new javax.swing.JButton();
        ViewEmployeeButton1 = new javax.swing.JButton();
        SignOutButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        WelcomeLabel1 = new javax.swing.JLabel();

        ClerkHomePanel.setBackground(new java.awt.Color(232, 246, 239));
        ClerkHomePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        WelcomeLabel.setBackground(new java.awt.Color(204, 204, 204));
        WelcomeLabel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        WelcomeLabel.setForeground(new java.awt.Color(0, 102, 153));
        WelcomeLabel.setText("WELCOME");
        WelcomeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ClerkHomeSeparator.setForeground(new java.awt.Color(0, 153, 153));
        ClerkHomeSeparator.setToolTipText("");

        AddToDirectoryButton.setBackground(new java.awt.Color(0, 102, 153));
        AddToDirectoryButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddToDirectoryButton.setForeground(new java.awt.Color(255, 255, 255));
        AddToDirectoryButton.setText("Add To Directory");
        AddToDirectoryButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddToDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToDirectoryButtonAddToDirectoryActionPerformed(evt);
            }
        });

        ViewDirectoryButton.setBackground(new java.awt.Color(0, 102, 153));
        ViewDirectoryButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ViewDirectoryButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewDirectoryButton.setText("View Directory");
        ViewDirectoryButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ViewDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDirectoryButtonActionPerformed(evt);
            }
        });

        ViewEmployeeButton.setBackground(new java.awt.Color(0, 102, 153));
        ViewEmployeeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ViewEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewEmployeeButton.setText("View Employees");
        ViewEmployeeButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ViewEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEmployeeButtonActionPerformed(evt);
            }
        });

        SignOutButton.setBackground(new java.awt.Color(255, 51, 51));
        SignOutButton.setForeground(new java.awt.Color(255, 255, 255));
        SignOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img-src/logo-white.png"))); // NOI18N
        SignOutButton.setToolTipText("बाहेर पडावे ");
        SignOutButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClerkHomePanelLayout = new javax.swing.GroupLayout(ClerkHomePanel);
        ClerkHomePanel.setLayout(ClerkHomePanelLayout);
        ClerkHomePanelLayout.setHorizontalGroup(
            ClerkHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClerkHomePanelLayout.createSequentialGroup()
                .addGroup(ClerkHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClerkHomePanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(SignOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClerkHomePanelLayout.createSequentialGroup()
                        .addContainerGap(122, Short.MAX_VALUE)
                        .addComponent(ClerkHomeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(ClerkHomePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ClerkHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ViewEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewDirectoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddToDirectoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClerkHomePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(WelcomeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClerkHomePanelLayout.setVerticalGroup(
            ClerkHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClerkHomePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(WelcomeLabel)
                .addGap(18, 18, 18)
                .addComponent(ClerkHomeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(AddToDirectoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(ViewDirectoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(ViewEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(SignOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 246, 239));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ClerkLoginLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        ClerkLoginLabel.setText("CLERK LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClerkLoginLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(ClerkLoginLabel)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(232, 246, 239));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        UsernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img-src/UsernameClerk.png"))); // NOI18N

        PasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img-src/PasswordClerk.png"))); // NOI18N

        UsernameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UsernameField.setToolTipText("Username");
        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });

        ShowPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img-src/eye.png"))); // NOI18N
        ShowPasswordIcon.setToolTipText("Hover to show Password");
        ShowPasswordIcon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ShowPasswordIconFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ShowPasswordIconFocusLost(evt);
            }
        });
        ShowPasswordIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ShowPasswordIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ShowPasswordIconMouseExited(evt);
            }
        });

        PasswordField.setToolTipText("Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(UsernameIcon)
                        .addGap(18, 18, 18)
                        .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PasswordIcon)
                        .addGap(18, 18, 18)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ShowPasswordIcon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UsernameIcon)
                            .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(PasswordIcon))
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowPasswordIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(232, 246, 239));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        SignupButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SignupButton.setText("SIGNUP");
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });

        ForgotPasswordButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ForgotPasswordButton.setText("FORGOT PASSWORD");
        ForgotPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotPasswordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(ForgotPasswordButton)
                .addGap(18, 18, 18)
                .addComponent(SignupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ForgotPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Tab.addTab("Signin", jPanel5);

        ClerkHomePanel1.setBackground(new java.awt.Color(232, 246, 239));
        ClerkHomePanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        AddToDirectoryButton1.setBackground(new java.awt.Color(0, 102, 153));
        AddToDirectoryButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddToDirectoryButton1.setForeground(new java.awt.Color(255, 255, 255));
        AddToDirectoryButton1.setText("Add To Directory");
        AddToDirectoryButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddToDirectoryButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToDirectoryButton1AddToDirectoryActionPerformed(evt);
            }
        });

        ViewDirectoryButton1.setBackground(new java.awt.Color(0, 102, 153));
        ViewDirectoryButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ViewDirectoryButton1.setForeground(new java.awt.Color(255, 255, 255));
        ViewDirectoryButton1.setText("View Directory");
        ViewDirectoryButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ViewDirectoryButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDirectoryButton1ActionPerformed(evt);
            }
        });

        ViewEmployeeButton1.setBackground(new java.awt.Color(0, 102, 153));
        ViewEmployeeButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ViewEmployeeButton1.setForeground(new java.awt.Color(255, 255, 255));
        ViewEmployeeButton1.setText("View Employees");
        ViewEmployeeButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ViewEmployeeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEmployeeButton1ActionPerformed(evt);
            }
        });

        SignOutButton1.setBackground(new java.awt.Color(255, 51, 51));
        SignOutButton1.setForeground(new java.awt.Color(255, 255, 255));
        SignOutButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img-src/logo-white.png"))); // NOI18N
        SignOutButton1.setToolTipText("बाहेर पडावे ");
        SignOutButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SignOutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClerkHomePanel1Layout = new javax.swing.GroupLayout(ClerkHomePanel1);
        ClerkHomePanel1.setLayout(ClerkHomePanel1Layout);
        ClerkHomePanel1Layout.setHorizontalGroup(
            ClerkHomePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClerkHomePanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(ClerkHomePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SignOutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ClerkHomePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ViewEmployeeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ViewDirectoryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddToDirectoryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        ClerkHomePanel1Layout.setVerticalGroup(
            ClerkHomePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClerkHomePanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AddToDirectoryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ViewDirectoryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ViewEmployeeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SignOutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(232, 246, 239));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        WelcomeLabel1.setBackground(new java.awt.Color(204, 204, 204));
        WelcomeLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        WelcomeLabel1.setForeground(new java.awt.Color(0, 102, 153));
        WelcomeLabel1.setText("WELCOME");
        WelcomeLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(WelcomeLabel1)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(WelcomeLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ClerkHomePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ClerkHomePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        Tab.addTab("Home", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tab)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void ShowPasswordIconFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ShowPasswordIconFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_ShowPasswordIconFocusGained

    private void ShowPasswordIconFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ShowPasswordIconFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowPasswordIconFocusLost

    private void ShowPasswordIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPasswordIconMouseEntered
        // TODO add your handling code here:
        PasswordField.setEchoChar((char)0);
    }//GEN-LAST:event_ShowPasswordIconMouseEntered

    private void ShowPasswordIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPasswordIconMouseExited
        // TODO add your handling code here:
        PasswordField.setEchoChar('*');
    }//GEN-LAST:event_ShowPasswordIconMouseExited

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:

        try {

            String username = (String) UsernameField.getText();
            String password = (String) PasswordField.getText();
            System.out.println(username);

            ConnectionEstablish con = new ConnectionEstablish();
            String sql = "SELECT * FROM clerk "
            + "WHERE Username = '"+username+"' AND "
            + "Password = '"+password+"'";
            System.out.println(password);
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if(rs.next()) {
                JOptionPane.showMessageDialog(null,"Welcome "+rs.getString("Name"));
                create(username, password);
                this.setVisible(false);
                new ClerkHome().setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Login...!.");
            }

        } catch (HeadlessException | SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void create(String branchArgument, String toArgument){
        try {
            FileWriter myWriter = new FileWriter("clerk.txt");
            myWriter.write(branchArgument+","+toArgument);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClerkSignup().setVisible(true);
    }//GEN-LAST:event_SignupButtonActionPerformed

    private void ForgotPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotPasswordButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ForgotPasswordButtonActionPerformed

    private void AddToDirectoryButtonAddToDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToDirectoryButtonAddToDirectoryActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClerkAddToDirectory().setVisible(true);
    }//GEN-LAST:event_AddToDirectoryButtonAddToDirectoryActionPerformed

    private void ViewDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDirectoryButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClerkViewDirectory().setVisible(true);
    }//GEN-LAST:event_ViewDirectoryButtonActionPerformed

    private void ViewEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewEmployeeButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClerkEmployeeStats().setVisible(true);
    }//GEN-LAST:event_ViewEmployeeButtonActionPerformed

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClerkLogin().setVisible(true);
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void AddToDirectoryButton1AddToDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToDirectoryButton1AddToDirectoryActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClerkAddToDirectory().setVisible(true);
    }//GEN-LAST:event_AddToDirectoryButton1AddToDirectoryActionPerformed

    private void ViewDirectoryButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDirectoryButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClerkViewDirectory().setVisible(true);
    }//GEN-LAST:event_ViewDirectoryButton1ActionPerformed

    private void ViewEmployeeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewEmployeeButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClerkEmployeeStats().setVisible(true);
    }//GEN-LAST:event_ViewEmployeeButton1ActionPerformed

    private void SignOutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClerkLogin().setVisible(true);
    }//GEN-LAST:event_SignOutButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(combine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(combine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(combine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(combine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new combine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToDirectoryButton;
    private javax.swing.JButton AddToDirectoryButton1;
    private javax.swing.JPanel ClerkHomePanel;
    private javax.swing.JPanel ClerkHomePanel1;
    private javax.swing.JSeparator ClerkHomeSeparator;
    private javax.swing.JLabel ClerkLoginLabel;
    private javax.swing.JButton ForgotPasswordButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordIcon;
    private javax.swing.JLabel ShowPasswordIcon;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JButton SignOutButton1;
    private javax.swing.JButton SignupButton;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameIcon;
    private javax.swing.JButton ViewDirectoryButton;
    private javax.swing.JButton ViewDirectoryButton1;
    private javax.swing.JButton ViewEmployeeButton;
    private javax.swing.JButton ViewEmployeeButton1;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel WelcomeLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
