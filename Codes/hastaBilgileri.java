/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deniyorum;

/**
 *
 * @author Taha
 */

import database.NewJFrame;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class hastaBilgileri extends javax.swing.JFrame {
    Connection sqlConn;

    private static final String username = "root";
    private static final String password = "YOUR PASSWORD IS HERE";
    private static final String dataConn = "jdbc:mysql://localhost:3306/myconnection";

    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteItem;

    public hastaBilgileri() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jtxtID = new javax.swing.JTextField();
        jtxtName = new javax.swing.JTextField();
        jtxtSurname = new javax.swing.JTextField();
        jtxtHastaCinsiyet = new javax.swing.JTextField();
        jtxtHastaKanGrubu = new javax.swing.JTextField();
        jtxtHastaBirim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4", "title5", "title 6"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Güncelle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Arama");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<--Geri");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jtxtID.setText("Hasta ID");
        jtxtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtIDFocusGained(evt);
            }
        });

        jtxtName.setText("Hasta Adı");
        jtxtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNameFocusGained(evt);
            }
        });

        jtxtSurname.setText("Hasta Soyadı");
        jtxtSurname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtSurnameFocusGained(evt);
            }
        });

        jtxtHastaCinsiyet.setEditable(false);
        jtxtHastaCinsiyet.setText("Hasta Cinsiyet");

        jtxtHastaKanGrubu.setEditable(false);
        jtxtHastaKanGrubu.setText("Hasta Kan Grubu");

        jtxtHastaBirim.setEditable(false);
        jtxtHastaBirim.setText("Hasta Birim");
        jtxtHastaBirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtHastaBirimActionPerformed(evt);
            }
        });

        jLabel1.setText("Hasta Cinsiyeti:");

        jLabel2.setText("Hasta Kan Grubu:");

        jLabel3.setText("İlgili Hasta Birimi:");

        jLabel4.setText("Hasta Kimlik:");

        jLabel5.setText("İsim:");

        jLabel6.setText("Soyisim:");

        jButton4.setText("Sil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtxtHastaKanGrubu,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 241,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jtxtHastaBirim,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 241,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jtxtHastaCinsiyet,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 241,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jSeparator1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 241,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jtxtSurname,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 241,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jButton4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                113,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jButton2,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        238,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jtxtID,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                241,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                83,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(113, Short.MAX_VALUE)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6)
                                                .addGap(4, 4, 4)
                                                .addComponent(jtxtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtxtHastaCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2)
                                                .addGap(5, 5, 5)
                                                .addComponent(jtxtHastaKanGrubu, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3)
                                                .addGap(1, 1, 1)
                                                .addComponent(jtxtHastaBirim, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                48, Short.MAX_VALUE))
                                                .addGap(101, 101, 101)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(23, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        try {
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement("select * from patients");
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new String[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6) });
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement("select * from patients where patientID=? and Name=? and Surname=? ");

            pst.setString(1, jtxtID.getText());
            pst.setString(2, jtxtName.getText());
            pst.setString(3, jtxtSurname.getText());
            rs = pst.executeQuery();

            if (rs.next() == false) {
                JOptionPane.showMessageDialog(this, "Aradığınız bilgilerde bir hasta bulunamadı");
                jtxtID.setText("");
                jtxtName.setText("");
                jtxtSurname.setText("");
                System.out.print("bulamadık");
            } else {
                jtxtID.setText(rs.getString("patientID"));
                jtxtName.setText(rs.getString("Name"));
                jtxtSurname.setText(rs.getString("Surname"));
                jtxtHastaKanGrubu.setText(rs.getString("kanGrubu"));
                jtxtHastaCinsiyet.setText(rs.getString("Gender"));
                jtxtHastaBirim.setText(rs.getString("Birim"));
                System.out.print("bulduk");
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        girisEkranı grsekrn = new girisEkranı();
        grsekrn.setVisible(true);
        dispose();

    }// GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();

        jtxtID.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        jtxtName.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        jtxtSurname.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        jtxtHastaCinsiyet.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        jtxtHastaKanGrubu.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
        jtxtHastaBirim.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
    }// GEN-LAST:event_jTable1MouseClicked

    private void jtxtIDFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jtxtIDFocusGained
        if (jtxtID.getText().equals("Hasta ID")) {
            jtxtID.setText("");
            jtxtID.setForeground(new Color(0, 0, 0));
        }
    }// GEN-LAST:event_jtxtIDFocusGained

    private void jtxtHastaBirimActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jtxtHastaBirimActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jtxtHastaBirimActionPerformed

    private void jtxtNameFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jtxtNameFocusGained
        if (jtxtName.getText().equals("Hasta Adı")) {
            jtxtName.setText("");
            jtxtName.setForeground(new Color(0, 0, 0));
        }
    }// GEN-LAST:event_jtxtNameFocusGained

    private void jtxtSurnameFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jtxtSurnameFocusGained
        if (jtxtSurname.getText().equals("Hasta Soyadı")) {
            jtxtSurname.setText("");
            jtxtSurname.setForeground(new Color(0, 0, 0));
        }
    }// GEN-LAST:event_jtxtSurnameFocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();

        try {
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you are sure to delete patient", "Warning",
                    JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION) {

                Class.forName("com.mysql.jdbc.Driver");
                sqlConn = DriverManager.getConnection(dataConn, username, password);
                pst = sqlConn.prepareStatement("delete from patients where id=?");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Patient Deleted");

                jtxtID.setText("");
                jtxtName.setText("");
                jtxtSurname.setText("");
                jtxtHastaCinsiyet.setText("");
                jtxtHastaBirim.setText("");
                jtxtHastaKanGrubu.setText("");
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hastaBilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hastaBilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hastaBilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hastaBilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hastaBilgileri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxtHastaBirim;
    private javax.swing.JTextField jtxtHastaCinsiyet;
    private javax.swing.JTextField jtxtHastaKanGrubu;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtSurname;
    // End of variables declaration//GEN-END:variables
}
