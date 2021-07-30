package tb;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ClerkEmployeeStats extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeStats
     */
    public ClerkEmployeeStats() {
        setFrame();
        initComponents();
        initBranchComboBox();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        EmployeeStatsLabel = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        BranchComboBox = new javax.swing.JComboBox<>();
        NameComboBox = new javax.swing.JComboBox<>();
        ShowButton = new javax.swing.JButton();
        ClerkEmployeeStatsTableScrollPane = new javax.swing.JScrollPane();
        ClerkEmployeeStatsTable = new javax.swing.JTable();
        LetterTableScrollPane = new javax.swing.JScrollPane();
        LetterTable = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setSize(new java.awt.Dimension(1000, 550));

        HeaderPanel.setBackground(new java.awt.Color(232, 246, 239));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        EmployeeStatsLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        EmployeeStatsLabel.setText("Employee Stats");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EmployeeStatsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(EmployeeStatsLabel)
                .addContainerGap())
        );

        BodyPanel.setBackground(new java.awt.Color(232, 246, 239));
        BodyPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BranchComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BranchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Branch" }));
        BranchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchComboBoxActionPerformed(evt);
            }
        });

        NameComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Name" }));
        NameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameComboBoxActionPerformed(evt);
            }
        });

        ShowButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ShowButton.setText("Show");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });

        ClerkEmployeeStatsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Subject", "From", "Received", "Completed", "Progress", "Feedback", "Days"
            }
        ));
        ClerkEmployeeStatsTableScrollPane.setViewportView(ClerkEmployeeStatsTable);

        LetterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Letters", "Completed", "Pending"
            }
        ));
        LetterTableScrollPane.setViewportView(LetterTable);

        BackButton.setBackground(new java.awt.Color(204, 204, 204));
        BackButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img-src/back-arrow.png"))); // NOI18N
        BackButton.setToolTipText("मागे जा ");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addComponent(BranchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(NameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(BodyPanelLayout.createSequentialGroup()
                            .addComponent(BackButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LetterTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(ClerkEmployeeStatsTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BranchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ClerkEmployeeStatsTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LetterTableScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BranchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchComboBoxActionPerformed
        // TODO add your handling code here:
        initNameComboBox();

    }//GEN-LAST:event_BranchComboBoxActionPerformed

    private void NameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameComboBoxActionPerformed

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed
        // TODO add your handling code here:
        Display();
        DisplayTask();
    }//GEN-LAST:event_ShowButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClerkHome().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    private void setFrame(){
        
        URL iconURL = getClass().getResource("/img-src/logo.png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        setTitle("Water Resources Department, Government of Maharashtra, India");
        setBounds(300, 150, 1000, 550);
    }
    
    
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
    
    
    private void initNameComboBox() {
        
        NameComboBox.removeAllItems();
        NameComboBox.addItem("Select Name");
        
        ConnectionEstablish con = new ConnectionEstablish();
        PreparedStatement p = null;
        ResultSet rs = null;
        
        // Try bock to catch exception/s
        try {

            // SQL command data stored in String datatype
            String sql = "select * from employee WHERE Branch=?";
            p = con.c.prepareStatement(sql);
            p.setString(1,(String) BranchComboBox.getSelectedItem());
            rs = p.executeQuery();
            

            // Condiion check
            while (rs.next()) {
                String name = rs.getString("Name");                
                NameComboBox.addItem(name);
            }
            
        }   catch (SQLException e) {
            // Print exception pop-up on screen
            System.out.println(e);
            }
    }
    
    
     private void Display() {
        
        DefaultTableModel ClerkEmployeeStatsTableModel  = new DefaultTableModel();
        ClerkEmployeeStatsTable.setModel(ClerkEmployeeStatsTableModel);
        ClerkEmployeeStatsTableModel.addColumn("ID");
        ClerkEmployeeStatsTableModel.addColumn("From");
        ClerkEmployeeStatsTableModel.addColumn("Subject");
        ClerkEmployeeStatsTableModel.addColumn("Received");
        ClerkEmployeeStatsTableModel.addColumn("Completed");
        ClerkEmployeeStatsTableModel.addColumn("Progress");
        ClerkEmployeeStatsTableModel.addColumn("Feedback");
        ClerkEmployeeStatsTableModel.addColumn("Days");
        
        ClerkEmployeeStatsTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        ClerkEmployeeStatsTable.getColumnModel().getColumn(3).setPreferredWidth(50);
        ClerkEmployeeStatsTable.getColumnModel().getColumn(4).setPreferredWidth(50);
        ClerkEmployeeStatsTable.getColumnModel().getColumn(7).setPreferredWidth(10);
//        ClerkEmployeeStatsTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        
        
        try {
            
            String branch = (String) BranchComboBox.getSelectedItem();
            String name = (String) NameComboBox.getSelectedItem();
            
            ConnectionEstablish con = new ConnectionEstablish();    
            String sql = "SELECT * FROM inwardregister WHERE  "
                    + "branch='"+branch+"' AND ToEmployee='"+name+"'";         
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String LetterID = rs.getString("LetterID");
                String From = rs.getString("Fr");
                String Subject = rs.getString("Subject");
                String Received = rs.getString("eDateReceived");
                String Completed  = rs.getString("eDateCompleted");
                String Progress = rs.getString("Progress");
                String Feedback  = rs.getString("Feedback");
                String CompletedInDays = String.valueOf(rs.getInt("CompletedInDays"));
                
                String tableData[] = {LetterID, From, Subject, Received, Completed, Progress, Feedback, CompletedInDays};
            
                ClerkEmployeeStatsTableModel.addRow(tableData);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
     
    private void DisplayTask() {
        
        DefaultTableModel LetterTableModel  = new DefaultTableModel();
        LetterTable.setModel(LetterTableModel);
        LetterTableModel.addColumn("Total Letters");
        LetterTableModel.addColumn("Completed Letters");
        LetterTableModel.addColumn("Pending Letters");
        
        String EmpID = getEmployeeID();
        try {
            
            String branch = (String) BranchComboBox.getSelectedItem();
            String name = (String) NameComboBox.getSelectedItem();
            
            ConnectionEstablish con = new ConnectionEstablish();
            String sql = "SELECT PendingTasks, CompletedTasks FROM employee "
                    + "WHERE Branch='"+branch+"' AND Name='"+name+"'";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()) {
                String PendingTasks = rs.getString("PendingTasks");
                int pt = Integer.parseInt(PendingTasks);
                String CompletedTasks = rs.getString("CompletedTasks");
                int ct = Integer.parseInt(CompletedTasks);
                
                int total = pt+ct;
                String TotalTasks = Integer.toString(total);
                
                String tableData[] = {TotalTasks, CompletedTasks, PendingTasks};
            
                LetterTableModel.addRow(tableData);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    private String getEmployeeID(){
        
        String branch = (String) BranchComboBox.getSelectedItem();
        String name = (String) NameComboBox.getSelectedItem();
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
            java.util.logging.Logger.getLogger(ClerkEmployeeStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClerkEmployeeStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClerkEmployeeStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClerkEmployeeStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClerkEmployeeStats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JComboBox<String> BranchComboBox;
    private javax.swing.JTable ClerkEmployeeStatsTable;
    private javax.swing.JScrollPane ClerkEmployeeStatsTableScrollPane;
    private javax.swing.JLabel EmployeeStatsLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JTable LetterTable;
    private javax.swing.JScrollPane LetterTableScrollPane;
    private javax.swing.JComboBox<String> NameComboBox;
    private javax.swing.JButton ShowButton;
    // End of variables declaration//GEN-END:variables
}
