/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letter.management.system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        initComponents();
    }
    public static void GetDetails(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Branchselect = new javax.swing.JComboBox<>();
        Nameselect = new javax.swing.JComboBox<>();
        Showbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Summary = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 246, 239));

        Branchselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branch 1", "Branch 2", "Branch 3", "Branch 4" }));
        Branchselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchselectActionPerformed(evt);
            }
        });

        Nameselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name" }));
        Nameselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameselectActionPerformed(evt);
            }
        });

        Showbutton.setText("Show");
        Showbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowbuttonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Letterid", "Subject", "From", "Date Recieved", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Summary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Letters", "Completed", "Pending"
            }
        ));
        jScrollPane2.setViewportView(Summary);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Branchselect, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(Nameselect, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Showbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Showbutton)
                    .addComponent(Nameselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Branchselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BranchselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchselectActionPerformed
        // TODO add your handling code here:
         try {
            conn con = new conn();
            
            if(Branchselect.getSelectedItem().equals("Branch 1")){
                
                String sql = "SELECT * FROM branchmembers WHERE Branchid = 1";
                 PreparedStatement st = con.c.prepareStatement(sql);
                 
                 ResultSet rs = st.executeQuery();
                 
                 Nameselect.removeAllItems();
                 while(rs.next()){
                     String name = (String) rs.getString("Name");
                      Nameselect.addItem(name);
                 }
                 
            }
            
            else if(Branchselect.getSelectedItem().equals("Branch 2")){
                
                 String sql = "SELECT * FROM branchmembers WHERE Branchid = 2";
                 PreparedStatement st = con.c.prepareStatement(sql);
                 
                 ResultSet rs = st.executeQuery();
                 Nameselect.removeAllItems();
                 while(rs.next()){
                     String name = (String) rs.getString("Name");
                      Nameselect.addItem(name);
                 }
                 
                              
            }
            else if(Branchselect.getSelectedItem().equals("Branch 3")){
                
                 String sql = "SELECT * FROM branchmembers WHERE Branchid = 3";
                 PreparedStatement st = con.c.prepareStatement(sql);
                 
                 ResultSet rs = st.executeQuery();
                 Nameselect.removeAllItems();
                 while(rs.next()){
                     String name = (String) rs.getString("Name");
                      Nameselect.addItem(name);
                 }
                             
            }
            else if(Branchselect.getSelectedItem().equals("Branch 4")){
                
                 String sql = "SELECT * FROM branchmembers WHERE Branchid = 4";
                 PreparedStatement st = con.c.prepareStatement(sql);
                 
                 ResultSet rs = st.executeQuery();
                 Nameselect.removeAllItems();
                 while(rs.next()){
                     String name = (String) rs.getString("Name");
                      Nameselect.addItem(name);
                 }
                 
                              
            }
            
            
                    
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(ClerkAddLetter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BranchselectActionPerformed

    private void NameselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameselectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameselectActionPerformed

    private void ShowbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowbuttonActionPerformed
        // TODO add your handling code here:
        
        try {
           
            DefaultTableModel tblModel1  = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel tblModel2  = (DefaultTableModel) Summary.getModel();
            tblModel1.setRowCount(0);
            tblModel2.setRowCount(0);
            int comp = 0;
            
            conn con = new conn();
//            String sql1 = "DELETE FROM inwardregister WHERE Letterid = NULL";
//            PreparedStatement st1 = con.c.prepareStatement(sql1);
//            
//           System.out.println("1");
//            int i = st1.executeUpdate();
//            if(i>0){
//                System.out.println("Done");
//            }
            
            String selected = (String) Nameselect.getSelectedItem();
            String sql = "SELECT * FROM inwardregister WHERE too = '"+selected+"'";
            
            
            
            PreparedStatement st = con.c.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("Letterid"));
                String subj = rs.getString("Subject");
                String from = rs.getString("fr");
//                String to = rs.getString("too");
//                String rec = rs.getString("daterecieved");
                String sent = rs.getString("datesent");
                
                String pend;
                
                int pending = rs.getInt("Complete/incomplete");
                if(pending == 0){
                     pend = "Pending";
                     
                }
                else{
                     pend = "Complete";
                     comp++;
                }
                
                
//                String rec = String.getValue(rs.getDate("daterecieved"));
//                Date sent = rs.getDate("datesent");
                
                String tbdata[] = {id, subj, from, sent, pend};
            
                
                tblModel1.addRow(tbdata);
            }
            
            int pend = jTable1.getRowCount() - comp;
            String TotalLetters = String.valueOf(jTable1.getRowCount());
            String comp1 = String.valueOf(comp);
            String pend1 = String.valueOf(pend);
            
            
            String tbdata[] = {TotalLetters, comp1, pend1};
            tblModel2.addRow(tbdata);
            
            
            
            
            
            
            
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
//                    new ClerkViewDatabase().setVisible(true);
                }
            });
        } catch (SQLException ex) {
            Logger.getLogger(ClerkViewDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ShowbuttonActionPerformed

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
    private javax.swing.JComboBox<String> Branchselect;
    private javax.swing.JComboBox<String> Nameselect;
    private javax.swing.JButton Showbutton;
    private javax.swing.JTable Summary;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
