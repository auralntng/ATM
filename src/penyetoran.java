
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aura Lintang
 */
public class penyetoran extends javax.swing.JFrame {

    /**
     * Creates new form penyetoran
     */
    public penyetoran() {
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

        jLabel1 = new javax.swing.JLabel();
        setor = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        setorr = new javax.swing.JTextField();
        btnsetor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Masukkan Jumlah Penyetoran :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));
        getContentPane().add(setor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, -1));

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        getContentPane().add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 90, -1));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 90, -1));

        jLabel2.setText("Tabungan :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 20));

        setorr.setEditable(false);
        setorr.setText("500000");
        getContentPane().add(setorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, -1));

        btnsetor.setText("Setor");
        btnsetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsetorActionPerformed(evt);
            }
        });
        getContentPane().add(btnsetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel3.setText("Saldo :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        saldo.setEditable(false);
        saldo.setText("500000");
        getContentPane().add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 140, -1));

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        infoSaldo ip;
        ip = new infoSaldo();
        ip.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        transaksiLain ip;
        ip = new transaksiLain();
        ip.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnsetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsetorActionPerformed
        String trk = setor.getText();
 String sld = saldo.getText();
        boolean huruf = false;
        int t = 0;
        int s = 0;
        float num1;
        
        try {
            num1 = Float.parseFloat(trk);
        }
        catch (NumberFormatException e) {
            huruf = true;
        }
        
        if (huruf) {
            JOptionPane.showMessageDialog(null, "Data diisi dengan Angka");
            t = Integer.parseInt(trk);
            s = Integer.parseInt(sld);
        }
        
     
        if (setor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data Harus Diisi");
        } else if (t > s){
                      JOptionPane.showMessageDialog(null, "Saldo Anda tidak mencukupi");
        }
        


else{
        
        int h1 = Integer.parseInt(setor.getText());
        int q2 = Integer.parseInt(saldo.getText());
        int x = h1+q2;   
        
        setorr.setText(String.valueOf(x));
        }
    }//GEN-LAST:event_btnsetorActionPerformed

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
            java.util.logging.Logger.getLogger(penyetoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penyetoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penyetoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penyetoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penyetoran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnsetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField saldo;
    private javax.swing.JTextField setor;
    private javax.swing.JTextField setorr;
    // End of variables declaration//GEN-END:variables
}
