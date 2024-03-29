package tb;

import java.net.URL;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Arrays;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
//import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class ClerkAddToDirectory extends javax.swing.JFrame {

    /**
     * Creates new form ClerkAddToDirectory
     */
    public ClerkAddToDirectory() {
        setFrame();
        initComponents();
        initBranchComboBox();
//        AutoCompleteDecorator.decorate(BranchComboBox);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        AddToDirectoryLabel = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        LetterIDLabel = new javax.swing.JLabel();
        FromLabel = new javax.swing.JLabel();
        LetterSubjectLabel = new javax.swing.JLabel();
        ToLabel = new javax.swing.JLabel();
        BranchComboBox = new javax.swing.JComboBox<>();
        ToEmployeeComboBox = new javax.swing.JComboBox<>();
        DateReceivedLabel = new javax.swing.JLabel();
        DateSentLabel = new javax.swing.JLabel();
        LetterIDField = new javax.swing.JTextField();
        FromField = new javax.swing.JTextField();
        SubjectField = new javax.swing.JTextField();
        DateReceivedField = new javax.swing.JTextField();
        DateSentField = new javax.swing.JTextField();
        DateReceivedShowTodayButton = new javax.swing.JButton();
        DateSentShowTodayButton = new javax.swing.JButton();
        FooterPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Water Resources Department, Government of Maharashtra, India");
        setBounds(new java.awt.Rectangle(300, 125, 900, 600));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setName("Add To Diectory"); // NOI18N
        setSize(new java.awt.Dimension(900, 600));

        HeaderPanel.setBackground(new java.awt.Color(232, 246, 239));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        AddToDirectoryLabel.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        AddToDirectoryLabel.setText("ADD TO DIRECTORY");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddToDirectoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AddToDirectoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        BodyPanel.setBackground(new java.awt.Color(232, 246, 239));
        BodyPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BodyPanel.setMaximumSize(new java.awt.Dimension(700, 300));
        BodyPanel.setMinimumSize(new java.awt.Dimension(700, 300));
        BodyPanel.setPreferredSize(new java.awt.Dimension(700, 300));

        LetterIDLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LetterIDLabel.setText("Letter ID");

        FromLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        FromLabel.setText("From:");

        LetterSubjectLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LetterSubjectLabel.setText("Letter Subject:");

        ToLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ToLabel.setText("To:");

        BranchComboBox.setBackground(new java.awt.Color(0, 102, 153));
        BranchComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BranchComboBox.setForeground(new java.awt.Color(255, 255, 255));
        BranchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Branch" }));
        BranchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchComboBoxActionPerformed(evt);
            }
        });

        ToEmployeeComboBox.setBackground(new java.awt.Color(0, 102, 153));
        ToEmployeeComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ToEmployeeComboBox.setForeground(new java.awt.Color(255, 255, 255));
        ToEmployeeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select To" }));

        DateReceivedLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DateReceivedLabel.setText("Date Received:");

        DateSentLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DateSentLabel.setText("Date Sent:");

        LetterIDField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LetterIDField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        FromField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        FromField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SubjectField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SubjectField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DateReceivedField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        DateReceivedField.setText("dd-MM-yyyy");
        DateReceivedField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DateReceivedField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DateReceivedFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DateReceivedFieldFocusLost(evt);
            }
        });

        DateSentField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        DateSentField.setText("dd-MM-yyyy");
        DateSentField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DateSentField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DateSentFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DateSentFieldFocusLost(evt);
            }
        });
        DateSentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateSentFieldActionPerformed(evt);
            }
        });

        DateReceivedShowTodayButton.setBackground(new java.awt.Color(0, 102, 153));
        DateReceivedShowTodayButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        DateReceivedShowTodayButton.setForeground(new java.awt.Color(255, 255, 255));
        DateReceivedShowTodayButton.setText("Show Today");
        DateReceivedShowTodayButton.setBorder(null);
        DateReceivedShowTodayButton.setMaximumSize(new java.awt.Dimension(95, 27));
        DateReceivedShowTodayButton.setMinimumSize(new java.awt.Dimension(95, 27));
        DateReceivedShowTodayButton.setPreferredSize(new java.awt.Dimension(95, 27));
        DateReceivedShowTodayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateReceivedShowTodayButtonActionPerformed(evt);
            }
        });

        DateSentShowTodayButton.setBackground(new java.awt.Color(0, 102, 153));
        DateSentShowTodayButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        DateSentShowTodayButton.setForeground(new java.awt.Color(255, 255, 255));
        DateSentShowTodayButton.setText("Show Today");
        DateSentShowTodayButton.setBorder(null);
        DateSentShowTodayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateSentShowTodayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(BodyPanelLayout.createSequentialGroup()
                                .addComponent(DateSentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DateSentField))
                            .addGroup(BodyPanelLayout.createSequentialGroup()
                                .addComponent(DateReceivedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DateReceivedField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateReceivedShowTodayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateSentShowTodayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addComponent(ToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(BranchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(ToEmployeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LetterIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetterSubjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(FromField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(LetterIDField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubjectField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LetterIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetterIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FromField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LetterSubjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubjectField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BranchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToEmployeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DateReceivedField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateReceivedShowTodayButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateReceivedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateSentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateSentField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateSentShowTodayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        FooterPanel.setBackground(new java.awt.Color(232, 246, 239));
        FooterPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BackButton.setBackground(new java.awt.Color(0, 102, 153));
        BackButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.setBorder(null);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(0, 102, 153));
        AddButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add");
        AddButton.setBorder(null);
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FooterPanelLayout = new javax.swing.GroupLayout(FooterPanel);
        FooterPanel.setLayout(FooterPanelLayout);
        FooterPanelLayout.setHorizontalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FooterPanelLayout.setVerticalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FooterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FooterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BodyPanel.getAccessibleContext().setAccessibleName("Add To Directory");

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void setFrame(){
        
        URL iconURL = getClass().getResource("/img-src/logo.png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        setTitle("Water Resources Department, Government of Maharashtra, India");
        setBounds(300, 125, 900, 600);
    }
    
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);  
        new ClerkHome().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:\
        String EmpID = getEmployeeID();
        try {
            ConnectionEstablish con = new ConnectionEstablish();
            String sql = "INSERT INTO inwardregister"
                        + "(LetterID, Fr, Subject, Branch, ToEmployee, EmployeeID, "
                        + "cDateReceived, cDateSent, Acknowledgement, Progress) "
                        + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement st = con.c.prepareStatement(sql);
                        
                        st.setString(1, LetterIDField.getText());
                        st.setString(2, FromField.getText());
                        st.setString(3, SubjectField.getText());
                        st.setString(4, (String) BranchComboBox.getSelectedItem());
                        st.setString(5, (String) ToEmployeeComboBox.getSelectedItem());
                        st.setString(6, EmpID);
                        st.setString(7, DateReceivedField.getText());
                        st.setString(8, DateSentField.getText());
                        st.setString(9, "0");
                        st.setString(10, "Added To Database");
                        
                        int i = st.executeUpdate();
                        if (i > 0){
                            JOptionPane.showMessageDialog(null, "Successfully Created");
                        }
            
                        
            String sqlPending= "UPDATE letter.employee "
                        + "SET PendingTasks = PendingTasks + 1 WHERE EmpID='"+EmpID+"'";
                        PreparedStatement stPending = con.c.prepareStatement(sqlPending);
                        int j = stPending.executeUpdate();

            this.setVisible(false);
            new ClerkAddToDirectory().setVisible(true);
                        
        } catch(SQLException esql){
            esql.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please Enter Inward Register Number.");
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DateSentShowTodayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateSentShowTodayButtonActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = LocalDate.now().format(formatter);
        
        DateSentField.setText(date);   
        
        DateSentCheck();
        
    }//GEN-LAST:event_DateSentShowTodayButtonActionPerformed

    private void DateReceivedShowTodayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateReceivedShowTodayButtonActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = LocalDate.now().format(formatter);
        
        DateReceivedField.setText(date);
        
        DateReceivedCheck();
    }//GEN-LAST:event_DateReceivedShowTodayButtonActionPerformed

    private void BranchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchComboBoxActionPerformed
        // TODO add your handling code here:
        initToComboBox();
    }//GEN-LAST:event_BranchComboBoxActionPerformed

    private void DateReceivedFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DateReceivedFieldFocusGained
        // TODO add your handling code here:
        if (DateReceivedField.getText().equals("dd-MM-yyyy") == true) {
            DateReceivedField.setText("");
        }
    }//GEN-LAST:event_DateReceivedFieldFocusGained

    private void DateReceivedFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DateReceivedFieldFocusLost
        // TODO add your handling code here:
        DateReceivedCheck();
    }//GEN-LAST:event_DateReceivedFieldFocusLost

    private void DateSentFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DateSentFieldFocusGained
        // TODO add your handling code here:
        if (DateSentField.getText().equals("dd-MM-yyyy") == true) {
            DateSentField.setText("");
        }
    }//GEN-LAST:event_DateSentFieldFocusGained

    private void DateSentFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DateSentFieldFocusLost
        // TODO add your handling code here:
        DateSentCheck();
    }//GEN-LAST:event_DateSentFieldFocusLost

    private void DateSentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateSentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateSentFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void initBranchComboBox() {
        
        ConnectionEstablish con = new ConnectionEstablish();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try {

            // SQL command data stored in String datatype
            String sql = "select DISTINCT Branch from employee ORDER BY Branch";
            st = con.c.prepareStatement(sql);
            rs = st.executeQuery();

            // Condiion check
            while (rs.next()) {
                String Branch = rs.getString("Branch");
                BranchComboBox.addItem(Branch);
            }
            
        }   catch (SQLException e) {
            // Print exception pop-up on screen
            System.out.println(e);
            }
    }
    
    
    private void initToComboBox() {
        
        ToEmployeeComboBox.removeAllItems();
        ToEmployeeComboBox.addItem("Select To");
        
        try {

            ConnectionEstablish con = new ConnectionEstablish();
            // SQL command data stored in String datatype
            String sql = "select * from employee WHERE Branch=? ORDER BY Name";
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1,(String) BranchComboBox.getSelectedItem());
            ResultSet rs = st.executeQuery();
            

            // Condiion check
            while (rs.next()) {
                String name = rs.getString("Name");                
                ToEmployeeComboBox.addItem(name);
            }
            
        }   catch (SQLException e) {
            // Print exception pop-up on screen
            System.out.println(e);
            }
    }
    
    
     private void DateSentCheck() {
        if (DateSentField.getText().equals("") == true) {
            DateSentField.setText("dd-MM-yyyy");
        }
        else if (Pattern.compile("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(20[0-9][0-9])$").matcher(DateSentField.getText()).matches()) {
            String[] DateReceivedFieldArray = DateReceivedField.getText().split("-");
            int[] drfa = Arrays.stream(DateReceivedFieldArray).mapToInt(Integer::parseInt).toArray();
            String[] DateCompletedFieldArray = DateSentField.getText().split("-");
            int[] dcfa = Arrays.stream(DateCompletedFieldArray).mapToInt(Integer::parseInt).toArray();

            if (drfa[2]==dcfa[2]){
                if (drfa[1]==dcfa[1]) {
                    if (drfa[0]<=dcfa[0]) {}
                    else {
                        JOptionPane.showMessageDialog(null, "Please Enter Correct Date.","Alert",JOptionPane.WARNING_MESSAGE);
                    }                   
                }    
                else if(drfa[1]<dcfa[1]) {}
                else {
                    JOptionPane.showMessageDialog(null, "Please Enter Correct Date.","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
            else if(drfa[0]<dcfa[0]) {}
            else {
                JOptionPane.showMessageDialog(null, "Please Enter Correct Date.","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please Enter Correct Date.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void DateReceivedCheck() {
        if (DateReceivedField.getText().equals("") == true) {
            DateReceivedField.setText("dd-MM-yyyy");
        }
        else if (Pattern.compile("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(20[0-9][0-9])$").matcher(DateReceivedField.getText()).matches()) {
        }
        else {
            JOptionPane.showMessageDialog(null, "Please Enter Correct Date.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    private void clearInputs() {
        LetterIDField.setText("");
        FromField.setText("");
        SubjectField.setText("");
        BranchComboBox.setSelectedItem("Select Branch");
        ToEmployeeComboBox.setSelectedItem("Select To");
        DateReceivedField.setText("dd-MM-yyyy");
        DateSentField.setText("dd-MM-yyyy");
    }
    
    private String getEmployeeID(){
        
        String branch = (String) BranchComboBox.getSelectedItem();
        String name = (String) ToEmployeeComboBox.getSelectedItem();
        try{
            ConnectionEstablish con = new ConnectionEstablish();
            String sql = "SELECT EmpID FROM employee WHERE "
                        + "Branch='"+branch+"' AND Name='"+name+"';";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            // Condiion check
            while (rs.next()) {
                String EmpID = rs.getString("EmpID");
                return EmpID;
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return "null";
    }
    
    
   
    
    
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
            java.util.logging.Logger.getLogger(ClerkAddToDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClerkAddToDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClerkAddToDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClerkAddToDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClerkAddToDirectory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AddToDirectoryLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JComboBox<String> BranchComboBox;
    private javax.swing.JTextField DateReceivedField;
    private javax.swing.JLabel DateReceivedLabel;
    private javax.swing.JButton DateReceivedShowTodayButton;
    private javax.swing.JTextField DateSentField;
    private javax.swing.JLabel DateSentLabel;
    private javax.swing.JButton DateSentShowTodayButton;
    private javax.swing.JPanel FooterPanel;
    private javax.swing.JTextField FromField;
    private javax.swing.JLabel FromLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JTextField LetterIDField;
    private javax.swing.JLabel LetterIDLabel;
    private javax.swing.JLabel LetterSubjectLabel;
    private javax.swing.JTextField SubjectField;
    private javax.swing.JComboBox<String> ToEmployeeComboBox;
    private javax.swing.JLabel ToLabel;
    // End of variables declaration//GEN-END:variables
}
