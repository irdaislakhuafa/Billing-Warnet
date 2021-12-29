package billing.utils;

import javax.swing.JLabel;

public class BillingWarnetUtils extends Thread {

    private JLabel label;
    private int jam;

    public BillingWarnetUtils(JLabel label, int jam) {
        this.label = label;
        this.jam = jam;
    }

    @Override
    public void run() {
        try {
            String textTimer;
            jam = (jam * 60 * 60);
            for (int i = jam; i >= 0; i--) {
                textTimer = String.valueOf(
                        (i / 60 / 60) + " JAM "
                        + (i / 60 % 60) + " MENIT "
                        + (i % 60) + " DETIK"
                );
                label.setText(textTimer);
                wait(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void wait(int time) {
        try {
            Thread.sleep(Long.valueOf(time * 1000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
