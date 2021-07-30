package tb;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Lenovo
 */
import net.proteanit.sql.DbUtils;
public class BranchViewLetter extends javax.swing.JFrame {

    /**
     * Creates new form SearchBranchLetter
     */
    public BranchViewLetter() {
        setFrame();
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
        BranchViewLetterTableScrollPane = new javax.swing.JScrollPane();
        BranchViewLetterTable = new javax.swing.JTable();
        FooterPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(232, 246, 239));
        setBounds(new java.awt.Rectangle(300, 125, 900, 700));
        setMaximumSize(new java.awt.Dimension(900, 650));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 650));
        setSize(new java.awt.Dimension(900, 650));

        HeaderPanel.setBackground(new java.awt.Color(232, 246, 239));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        InwardRegisterLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        InwardRegisterLabel.setText("INWARD REGISTER");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InwardRegisterLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(InwardRegisterLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BodyPanel.setBackground(new java.awt.Color(232, 246, 239));
        BodyPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BranchViewLetterTable.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        BranchViewLetterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "From", "Subject", "Received", "Completed", "Progress", "Feedback", "Days"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BranchViewLetterTable.setEnabled(false);
        BranchViewLetterTable.setGridColor(new java.awt.Color(102, 255, 255));
        BranchViewLetterTableScrollPane.setViewportView(BranchViewLetterTable);
        if (BranchViewLetterTable.getColumnModel().getColumnCount() > 0) {
            BranchViewLetterTable.getColumnModel().getColumn(0).setMaxWidth(25);
        }

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BranchViewLetterTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addContainerGap())
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BranchViewLetterTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FooterPanelLayout.setVerticalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterPanelLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FooterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FooterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);  
        new BranchHome().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void Display() {
        
        DefaultTableModel BranchViewLetterTableModel  = new DefaultTableModel();
        BranchViewLetterTable.setModel(BranchViewLetterTableModel);
        BranchViewLetterTableModel.addColumn("ID");
        BranchViewLetterTableModel.addColumn("From");
        BranchViewLetterTableModel.addColumn("Subject");
        BranchViewLetterTableModel.addColumn("Received");
        BranchViewLetterTableModel.addColumn("Completed");
        BranchViewLetterTableModel.addColumn("Progress");
        BranchViewLetterTableModel.addColumn("Feedback");
        BranchViewLetterTableModel.addColumn("Days");
        
        BranchViewLetterTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        BranchViewLetterTable.getColumnModel().getColumn(3).setPreferredWidth(50);
        BranchViewLetterTable.getColumnModel().getColumn(4).setPreferredWidth(50);
        BranchViewLetterTable.getColumnModel().getColumn(5).setPreferredWidth(50);
        BranchViewLetterTable.getColumnModel().getColumn(7).setPreferredWidth(10);
        
        try {
           
//          >>  READING THE BRANCH AND STORING IT IN BRANCH AND TOEMPLOYEE VARIABLES  
            BufferedReader br = new BufferedReader(new FileReader("login.txt"));
            String text = br.readLine();
//  branch:          
            String branch = text.split(",")[0];
//  toEmployee:          
            String toEmployee = text.split(",")[1];     
            System.out.println(toEmployee);
            
            ConnectionEstablish con = new ConnectionEstablish();            
            String sql = "SELECT * FROM inwardregister WHERE "
                    + "Branch = '"+branch+"' AND ToEmployee='"+toEmployee+"'"
                    + "ORDER BY eDateCompleted DESC";            
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);            
            
            while(rs.next()){
                String LetterID = rs.getString("LetterID");
                String From = rs.getString("Fr");
                String Subject = rs.getString("Subject");
                String Received = rs.getString("eDateReceived");
                String Completed = rs.getString("eDateCompleted");
                String Progress = rs.getString("Progress");
                String Feedback = rs.getString("Feedback");
                String Days = rs.getString("CompletedInDays");
                
                String tbdata[] = {LetterID, From, Subject, Received, Completed, Progress, Feedback, Days};
            
                BranchViewLetterTableModel.addRow(tbdata);
                
            }
        } catch (IOException | SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    
     private void setFrame(){
        
        URL iconURL = getClass().getResource("/img-src/logo.png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        setTitle("Water Resources Department, Government of Maharashtra, India");
        setBounds(300, 125, 900, 600);
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
            java.util.logging.Logger.getLogger(BranchViewLetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BranchViewLetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BranchViewLetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BranchViewLetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BranchViewLetter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JTable BranchViewLetterTable;
    private javax.swing.JScrollPane BranchViewLetterTableScrollPane;
    private javax.swing.JPanel FooterPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel InwardRegisterLabel;
    // End of variables declaration//GEN-END:variables
}
