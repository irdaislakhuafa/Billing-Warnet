package com.billing.utils;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BillingWarnetUtils extends Thread {

    private JLabel label;
    private int jam;
    private int timer;
    private JButton btnStart;

    public BillingWarnetUtils(JLabel label, int jam, JButton btnStart) {
        this.label = label;
        this.jam = jam;
        this.btnStart = btnStart;
    }

    @Override
    public void run() {
        try {
            String textTimer;
//            jam = (jam * 60 * 60);
            jam = 3;
            for (timer = jam; timer >= 0; timer--) {
                textTimer = String.valueOf(
                        (timer / 60 / 60) + " JAM "
                        + (timer / 60 % 60) + " MENIT "
                        + (timer % 60) + " DETIK"
                );
                label.setText(textTimer);
                wait(1);
            }

            this.addNotifTimerDone(String.valueOf(jam / 60 / 60));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reset() {
        this.stop();
        this.addNotifTimerDone(String.valueOf(jam / 60 / 60));
        label.setText("00 JAM 00 MENIT 00 DETIK");
    }

    private static void wait(int time) {
        try {
            Thread.sleep(Long.valueOf(time * 1000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addNotifTimerDone(String value) {
        btnStart.setText("Mulai");
        btnStart.setEnabled(false);
        JOptionPane.showConfirmDialog(null, "Waktu penyewaan " + value + " sudah habis!", "Info", JOptionPane.OK_OPTION);
    }
}
