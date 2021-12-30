package com.billing.utils;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BillingWarnetUtils extends Thread {

    private JLabel label;
    private int jam;
    private int timer;
    private JButton btnStart;
    private String longTime;

    public BillingWarnetUtils(JLabel label, int jam, JButton btnStart) {
        this.label = label;
        this.jam = jam;
        this.btnStart = btnStart;
    }
    
    public BillingWarnetUtils(JLabel label, int jam, JButton btnStart, String longTime) {
        this(label, jam, btnStart);
        this.longTime = longTime;
    }

    @Override
    public void run() {
        try {
            String textTimer;
            jam = (jam * 60 * 60);
            for (timer = jam; timer >= 0; timer--) {
                textTimer = String.valueOf(
                        (timer / 60 / 60) + " JAM "
                        + (timer / 60 % 60) + " MENIT "
                        + (timer % 60) + " DETIK"
                );
                label.setText(textTimer);
                wait(1);
            }

            this.addNotifTimerDone(longTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reset() {
        this.stop();
        this.addNotifTimerDone(longTime);
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
        JOptionPane.showConfirmDialog(null, "Waktu penyewaan " + value.toUpperCase() + " sudah habis!", "Info", JOptionPane.OK_OPTION);
    }
}
