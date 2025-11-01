/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package littlebagshop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale.Category;
import javax.swing.JOptionPane;



public class Maddnewdetails extends javax.swing.JFrame {

    private static final String username ="root"; 
    private static final String password = "";
    private static final String dataConn ="jdbc:mysql://localhost:3306/bagshop";//varibles create for connect to the database
    
    
    Connection sqlConn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
    public Maddnewdetails() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        bagcolour = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bagid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Bbrand = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Bcategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(51, 255, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.setActionCommand("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, -1, -1));

        bagcolour.setBackground(new java.awt.Color(153, 255, 153));
        bagcolour.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bagcolour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "White", "Blue", "Red", "Green ", "Yellow", "Black" }));
        getContentPane().add(bagcolour, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 430, 120, 30));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setText("Previous");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Enter Bag Colour");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        bagid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagidActionPerformed(evt);
            }
        });
        getContentPane().add(bagid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Enter Bag ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        Bbrand.setBackground(new java.awt.Color(153, 255, 153));
        Bbrand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Bbrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gucci", "Fendi", "CHARLES & KEITH" }));
        Bbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbrandActionPerformed(evt);
            }
        });
        getContentPane().add(Bbrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 120, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Select Bag Brand");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        Bcategory.setBackground(new java.awt.Color(153, 255, 153));
        Bcategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Bcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Satchel.", "Briefcase.", "Tote Bag.", " " }));
        Bcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcategoryActionPerformed(evt);
            }
        });
        getContentPane().add(Bcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 172, 120, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Select Bag Category");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Bag Details To  Add New Bags To Shop");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ADD NEW DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\my\\Downloads\\image.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BcategoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
        // Use the correct driver class name
        Class.forName("com.mysql.jdbc.Driver");
        
        // Establish a connection to the database
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        
        // Correct the SQL query to use backticks for column names with spaces
        String sql = "INSERT INTO viewdeatails (`BagID`, `Color`, `Brand`, `Category`) VALUES (?, ?, ?, ?)";
        pst = sqlConn.prepareStatement(sql);

        // Ensure the parameters are set in the correct order matching your SQL statement
        pst.setString(1, bagid.getText()); // Bag ID
        pst.setString(2, (String) bagcolour.getSelectedItem()); // Colour
        pst.setString(3, (String) Bbrand.getSelectedItem()); // Brand
        pst.setString(4, (String) Bcategory.getSelectedItem()); // Category
        
        // Execute the prepared statement
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Record Added Successfully");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, ex);
    } finally {
        // Optional: Close the database resources to avoid leaks
        try {
            if (pst != null) pst.close();
            if (sqlConn != null) sqlConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void bagidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bagidActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     Mmenu1  app2 = new Mmenu1 ();
     this.hide();
     app2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BbrandActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Maddnewdeatils.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maddnewdeatils.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maddnewdeatils.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maddnewdeatils.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maddnewdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Bbrand;
    private javax.swing.JComboBox<String> Bcategory;
    private javax.swing.JComboBox<String> bagcolour;
    private javax.swing.JTextField bagid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
