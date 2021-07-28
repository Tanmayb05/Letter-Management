package tb;

import java.net.URL;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import static java.util.Date.from;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ClerkViewDirectory extends javax.swing.JFrame {

    /**
     * Creates new form ViewDatabase
     */
    public ClerkViewDirectory() {
        
        initComponents();
        Display();
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
        InwardRegisterLabel = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        ClerkViewDirectoryTableScrollPane = new javax.swing.JScrollPane();
        ClerkViewDirectoryTable = new javax.swing.JTable();
        FooterPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 1000, 700));
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setName("ViewDirectory"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setSize(new java.awt.Dimension(1000, 700));

        HeaderPanel.setBackground(new java.awt.Color(232, 246, 239));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        InwardRegisterLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        InwardRegisterLabel.setText("INWARD REGISTER");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InwardRegisterLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(InwardRegisterLabel)
                .addGap(10, 10, 10))
        );

        BodyPanel.setBackground(new java.awt.Color(232, 246, 239));
        BodyPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BodyPanel.setMaximumSize(new java.awt.Dimension(800, 434));
        BodyPanel.setMinimumSize(new java.awt.Dimension(800, 434));
        BodyPanel.setPreferredSize(new java.awt.Dimension(800, 434));

        ClerkViewDirectoryTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ClerkViewDirectoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Letter ID", "From", "Subject", "Branch", "To", "Recieved", "Sent", "Completed", "Pending"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ClerkViewDirectoryTable.setEnabled(false);
        ClerkViewDirectoryTableScrollPane.setViewportView(ClerkViewDirectoryTable);
        if (ClerkViewDirectoryTable.getColumnModel().getColumnCount() > 0) {
            ClerkViewDirectoryTable.getColumnModel().getColumn(8).setMinWidth(30);
            ClerkViewDirectoryTable.getColumnModel().getColumn(8).setMaxWidth(35);
        }

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(ClerkViewDirectoryTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ClerkViewDirectoryTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        FooterPanel.setBackground(new java.awt.Color(232, 246, 239));
        FooterPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BackButton.setBackground(new java.awt.Color(35, 62, 139));
        BackButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FooterPanelLayout = new javax.swing.GroupLayout(FooterPanel);
        FooterPanel.setLayout(FooterPanelLayout);
        FooterPanelLayout.setHorizontalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FooterPanelLayout.setVerticalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(FooterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FooterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Display() {
        
        DefaultTableModel ClerkViewDatabaseTableModel  = new DefaultTableModel();
        ClerkViewDirectoryTable.setModel(ClerkViewDatabaseTableModel);
        ClerkViewDatabaseTableModel.addColumn("LetterID");
        ClerkViewDatabaseTableModel.addColumn("From");
        ClerkViewDatabaseTableModel.addColumn("Subject");
        ClerkViewDatabaseTableModel.addColumn("Branch");
        ClerkViewDatabaseTableModel.addColumn("To");
        ClerkViewDatabaseTableModel.addColumn("Received");
        ClerkViewDatabaseTableModel.addColumn("Sent");
        ClerkViewDatabaseTableModel.addColumn("Received By Branch");
        ClerkViewDatabaseTableModel.addColumn("Completed");
        ClerkViewDatabaseTableModel.addColumn("Pending");
        
        try {
            
            ConnectionEstablish con = new ConnectionEstablish();            
            String sql = "SELECT * FROM inwardregister ORDER BY cDateReceived";            
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String LetterID = String.valueOf(rs.getInt("LetterID"));
                String From = rs.getString("Fr");
                String Subject = rs.getString("Subject");
                String Branch = rs.getString("Branch");                
                String To = rs.getString("ToEmployee");
                String cReceived = rs.getString("cDateReceived");
                String cSent = rs.getString("cDateSent");
                String eReceived  = rs.getString("eDateReceived");
                String eCompleted  = rs.getString("eDateCompleted");
                String Pending = rs.getString("Progress");
                
                String tableData[] = {LetterID, From, Subject, Branch, To, cReceived, cSent, eReceived, eCompleted, Pending};
            
                ClerkViewDatabaseTableModel.addRow(tableData);
                
            }
        } catch (SQLException ex) {
            
        }
        
    }
    
    
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
        setBounds(100, 100, 1000, 700);
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
                java.util.logging.Logger.getLogger(ClerkViewDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(ClerkViewDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(ClerkViewDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(ClerkViewDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            new ClerkViewDirectory().setVisible(true);
      
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JTable ClerkViewDirectoryTable;
    private javax.swing.JScrollPane ClerkViewDirectoryTableScrollPane;
    private javax.swing.JPanel FooterPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel InwardRegisterLabel;
    // End of variables declaration//GEN-END:variables
}
