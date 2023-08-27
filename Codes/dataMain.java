
package deniyorum;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Taha
 */
public class girisEkranı extends javax.swing.JFrame {

    /**
     * Creates new form girisEkranı
     */
    public girisEkranı() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jtxthastaBilgiGrntleme = new javax.swing.JButton();
        jtxthastaEkleSil = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxthastaBilgiGrntleme.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxthastaBilgiGrntleme.setText("Hasta Bilgisi Görüntüleme - Hasta Arama - Hasta Silme");
        jtxthastaBilgiGrntleme.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxthastaBilgiGrntleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxthastaBilgiGrntlemeActionPerformed(evt);
            }
        });

        jtxthastaEkleSil.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxthastaEkleSil.setText("Hasta Kayıt");
        jtxthastaEkleSil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxthastaEkleSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxthastaEkleSilActionPerformed(evt);
            }
        });

        jButton1.setText("Çıkış");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(140, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtxthastaEkleSil, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        744, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jtxthastaBilgiGrntleme,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 744,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(116, 116, 116)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(425, 425, 425)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jtxthastaBilgiGrntleme, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jtxthastaEkleSil, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(282, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxthastaBilgiGrntlemeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jtxthastaBilgiGrntlemeActionPerformed
        hastaBilgileri hstblg = new hastaBilgileri();
        hstblg.setVisible(true);
        dispose();
    }// GEN-LAST:event_jtxthastaBilgiGrntlemeActionPerformed

    private JFrame frame;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "MySQLConnector",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }// GEN-LAST:event_jButton1ActionPerformed

    private void jtxthastaEkleSilActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jtxthastaEkleSilActionPerformed
        hastaEkleme hsteklm = new hastaEkleme();
        hsteklm.setVisible(true);
        dispose();
    }// GEN-LAST:event_jtxthastaEkleSilActionPerformed

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
            java.util.logging.Logger.getLogger(girisEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(girisEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(girisEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(girisEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new girisEkranı().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jtxthastaBilgiGrntleme;
    private javax.swing.JButton jtxthastaEkleSil;
}
