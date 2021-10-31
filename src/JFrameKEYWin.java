
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author namxg
 */
public class JFrameKEYWin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameKEYWin
     */
    public JFrameKEYWin() {
        initComponents();
    }
    private String Key;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Code by: Nam Hoài Nguyễn");

        jLabel2.setText("Số Lượng:");

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnStart)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSL)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnCancel))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean valtdateFrom() {
        return !txtSL.getText().isEmpty();
    }

    private void creatKeyWin() {
        if (valtdateFrom()) {
            String[] d = {"B", "C", "D", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "T", "V", "W", "X", "Y", "2", "3", "4", "6", "7", "8", "9"};
            try {
                int sl = Integer.parseInt(txtSL.getText());
                try {
                    ArrayList<String> string = new ArrayList<String>();
                    try ( FileWriter fw = new FileWriter("comboKEY.txt")) {
                        for (int i = 0; i < d.length; i++) {
                            string.add(d[i]);
                        }
                        for (int i = 0; i < sl; i++) {
                            String key1 = "";
                            String key2 = "";
                            String key3 = "";
                            String key4 = "";
                            String key5 = "";
                            for (int j = 0; j < 5; j++) {
                                List list = new ArrayList(string);
                                Collections.shuffle(list);
                                key1 += (String) list.get(j);
                            }
                            for (int j = 0; j < 5; j++) {
                                List list = new ArrayList(string);
                                Collections.shuffle(list);
                                key2 += (String) list.get(j);
                            }
                            for (int j = 0; j < 5; j++) {
                                List list = new ArrayList(string);
                                Collections.shuffle(list);
                                key3 += (String) list.get(j);
                            }
                            for (int j = 0; j < 5; j++) {
                                List list = new ArrayList(string);
                                Collections.shuffle(list);
                                key4 += (String) list.get(j);
                            }
                            for (int j = 0; j < 5; j++) {
                                List list = new ArrayList(string);
                                Collections.shuffle(list);
                                key5 += (String) list.get(j);
                            }
                            fw.write(key1 + "-" + key2 + "-" + key3 + "-" + key4 + "-" + key5 + "\n");
                        }
                        fw.close();
                    }
                } catch (IOException ignored) {
                }
                JOptionPane.showMessageDialog(this, "Thành công");

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, e + "\nBạn Phải nhập ký tự số", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "bạn chưa nhập số lượng", "lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        this.creatKeyWin();
    }//GEN-LAST:event_btnStartActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameKEYWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameKEYWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameKEYWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameKEYWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameKEYWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtSL;
    // End of variables declaration//GEN-END:variables
}
