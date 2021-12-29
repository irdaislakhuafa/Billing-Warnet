
import billing.utils.BillingWarnetUtils;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class AplikasiBillingWarnet extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiBillingWarnet
     */
    private BillingWarnetUtils threadTimer;
    private Boolean isPaused = false;

    public AplikasiBillingWarnet() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        NOMOR_KOMPUTER = new javax.swing.JLabel();
        BIAYA_PER_JAM = new javax.swing.JLabel();
        LAMA_PENGGUNAAN = new javax.swing.JLabel();
        SNACK = new javax.swing.JLabel();
        TOTAL_HARGA = new javax.swing.JLabel();
        BAYAR = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        biaya = new javax.swing.JTextField();
        snack = new javax.swing.JTextField();
        total_harga = new javax.swing.JTextField();
        bayar = new javax.swing.JTextField();
        jenis_komputer = new javax.swing.JComboBox<>();
        penggunaan = new javax.swing.JComboBox<>();
        estimateTime = new javax.swing.JLabel();
        timerValue = new javax.swing.JLabel();
        btnTimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("BILLING WARNET ADIT NET");

        NOMOR_KOMPUTER.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NOMOR_KOMPUTER.setText("NOMOR KOMPUTER");

        BIAYA_PER_JAM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BIAYA_PER_JAM.setText("BIAYA PER JAM");

        LAMA_PENGGUNAAN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LAMA_PENGGUNAAN.setText("LAMA PENGGUNAAN");

        SNACK.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SNACK.setText("SNACK");

        TOTAL_HARGA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TOTAL_HARGA.setText("TOTAL HARGA");

        BAYAR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BAYAR.setText("BAYAR");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("TRANSAKSI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("BATAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("KELUAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        biaya.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        snack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        snack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                snackKeyReleased(evt);
            }
        });

        total_harga.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        bayar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jenis_komputer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jenis_komputer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH KOMPUTER", "KOMPUTER 1", "KOMPUTER 2", "KOMPUTER 3" }));
        jenis_komputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenis_komputerActionPerformed(evt);
            }
        });

        penggunaan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        penggunaan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH WAKTU", "1 jam", "2 jam", "3 jam", "4 jam", "5 jam" }));
        penggunaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penggunaanActionPerformed(evt);
            }
        });

        estimateTime.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        estimateTime.setText("Estimasi Waktu");

        timerValue.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        timerValue.setText("00 JAM 00 MENIT 00 DETIK");

        btnTimer.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        btnTimer.setText("Start");
        btnTimer.setMaximumSize(new java.awt.Dimension(104, 33));
        btnTimer.setPreferredSize(new java.awt.Dimension(104, 33));
        btnTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NOMOR_KOMPUTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LAMA_PENGGUNAAN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BIAYA_PER_JAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SNACK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TOTAL_HARGA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BAYAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bayar)
                            .addComponent(total_harga)
                            .addComponent(snack)
                            .addComponent(biaya)
                            .addComponent(jenis_komputer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(penggunaan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estimateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jenis_komputer)
                        .addComponent(estimateTime))
                    .addComponent(NOMOR_KOMPUTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LAMA_PENGGUNAAN)
                    .addComponent(penggunaan))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BIAYA_PER_JAM)
                    .addComponent(biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timerValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SNACK)
                    .addComponent(snack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TOTAL_HARGA)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAYAR)
                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    button pause
    private void btnTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimerActionPerformed
        // TODO add your handling code here:
        isPaused = !isPaused;

        if (!isPaused) {
            btnTimer.setText("Pause");
            threadTimer.resume();
        } else {
            btnTimer.setText("Resume");
            threadTimer.suspend();
        }
    }//GEN-LAST:event_btnTimerActionPerformed

    // button transaksi
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        int Bayar = Integer.parseInt(bayar.getText());
        int Biaya = Integer.parseInt(biaya.getText());
        int Kembalian = Bayar - Biaya;
        String Kembali = Integer.toString(Kembalian);
        JOptionPane.showMessageDialog(null, "Kembalian Anda : " + Kembali);

        jenis_komputer.setSelectedItem("pilih");
        biaya.setText(" ");
        snack.setText(" ");
        total_harga.setText(" ");
        bayar.setText(" ");

        String selectedTime = penggunaan.getSelectedItem().toString();
        System.out.println(selectedTime.charAt(0));

        threadTimer = new BillingWarnetUtils(
                timerValue, (int) Integer.valueOf(Character.toString(selectedTime.charAt(0)))
        );
        threadTimer.start();
        btnTimer.setText("Pause");
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        jenis_komputer.setSelectedItem("pilih");
        biaya.setText(" ");
        snack.setText(" ");
        total_harga.setText(" ");
        bayar.setText(" ");
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jenis_komputerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jenis_komputerActionPerformed

    }// GEN-LAST:event_jenis_komputerActionPerformed

    private void penggunaanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_penggunaanActionPerformed
        if (penggunaan.getSelectedItem().toString().equalsIgnoreCase("1 jam")) {
            biaya.setText("3000");
        } else if (penggunaan.getSelectedItem().toString().equalsIgnoreCase("2 jam")) {
            biaya.setText("5000");
        } else if (penggunaan.getSelectedItem().toString().equalsIgnoreCase("3 jam")) {
            biaya.setText("8000");
        } else if (penggunaan.getSelectedItem().toString().equalsIgnoreCase("4 jam")) {
            biaya.setText("12000");
        } else if (penggunaan.getSelectedItem().toString().equalsIgnoreCase("5 jam")) {
            biaya.setText("15000");
        } else {
            biaya.setText("20000");
        }
    }// GEN-LAST:event_penggunaanActionPerformed

    private void snackKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_snackKeyReleased
        int Biaya = Integer.parseInt(biaya.getText());
        int Snack = Integer.parseInt(snack.getText());
        int ttlharga = Biaya + Snack;
        String Total = Integer.toString(ttlharga);
        total_harga.setText(Total);
    }// GEN-LAST:event_snackKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiBillingWarnet.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiBillingWarnet.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiBillingWarnet.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiBillingWarnet.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiBillingWarnet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BAYAR;
    private javax.swing.JLabel BIAYA_PER_JAM;
    private javax.swing.JLabel LAMA_PENGGUNAAN;
    private javax.swing.JLabel NOMOR_KOMPUTER;
    private javax.swing.JLabel SNACK;
    private javax.swing.JLabel TOTAL_HARGA;
    private javax.swing.JTextField bayar;
    private javax.swing.JTextField biaya;
    private javax.swing.JButton btnTimer;
    private javax.swing.JLabel estimateTime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jenis_komputer;
    private java.awt.Label label1;
    private javax.swing.JComboBox<String> penggunaan;
    private javax.swing.JTextField snack;
    private static javax.swing.JLabel timerValue;
    private javax.swing.JTextField total_harga;
    // End of variables declaration//GEN-END:variables

    // class utility
//    public static class BillingWarnetUtils {
//        private void wait(int time) {
//            try {
//                Thread.sleep(Long.valueOf(time * 1000));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
    private static void setTimer(int jam) {
        String textTimer;
        jam = (jam * 60 * 60);
        for (int i = jam; i >= 0; i--) {
            textTimer = String.valueOf(
                    (i / 60 / 60) + " JAM "
                    + (i / 60) + " MENIT "
                    + (i % 60) + " DETIK"
            );
            timerValue.setText(textTimer);
        }
    }
}
