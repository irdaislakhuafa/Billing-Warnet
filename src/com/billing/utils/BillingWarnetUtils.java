package com.billing.utils;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BillingWarnetUtils extends Thread { // class ini harus menjadi turunan dari class java.lang.Thread agar bisa multithreading

    private JLabel label;
    private int jam;
    private int timer;
    private JButton btnStart;
    private String longTime;
    
    // constructor pertama 
    public BillingWarnetUtils(JLabel label, int jam, JButton btnStart) {
        this.label = label;
        this.jam = jam;
        this.btnStart = btnStart;
    }
    
    // constructor kedua (overloading constructor)
    public BillingWarnetUtils(JLabel label, int jam, JButton btnStart, String longTime) {
        this(label, jam, btnStart);
        this.longTime = longTime;
    }

    @Override
    public void run() { // menimpa / override fungsi run() dari class Thread
        try {
            String textTimer; // untuk menyimpan text untuk ditampilkan di timer
            jam = (jam * 60 * 60); // memformat int jam yg mulanya (misal 1) menjadi (1 jam)
            for (timer = jam; timer >= 0; timer--) { // int timer (global variable) sama dengan jam, jika timer lebih besar atau sama dengan 0 maka timer akan dikurangi 1 (menghitung mundur)
                textTimer = String.valueOf(
                        (timer / 60 / 60) + " JAM " // rumus untuk menghitung jam (nilai / 60 / 60) karena 1 jam 60 menit dan 1 menit 60 detik
                        + (timer / 60 % 60) + " MENIT " // rumus untuk menghitung menit (nilai / 60 % 60) karena 1 menit sama dengan 60 detik 
                        + (timer % 60) + " DETIK" // rumus untuk menghitung detik (nilai % 60) karena 60 detik
                );
                label.setText(textTimer); // label (timerValue) text nya di ubah sesuai nilai variable textTimer
                wait(1); // setiap perulangan di tunda 1 detik
            }
	    // jika waktu/perulangan sudah habis maka akan muncul notifikasi dari fungsi addNotifTimerDone() yang menandakan waktu sudah habis
            this.addNotifTimerDone(longTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // fungsi untuk mereset timer ke 0
    public void reset() {
        this.stop(); // menghentikan timer
        this.addNotifTimerDone(longTime); // menampilkan notifikasi waktu sudah berakhir / habis
        label.setText("00 JAM 00 MENIT 00 DETIK"); // mengatur timerValue ke 0
    }

    // fungsi untuk menunda beberapa detik sesuai parameter yang dimasukan saat dipanggil
    private static void wait(int time) {
        try {
            Thread.sleep(Long.valueOf(time * 1000)); // 1000 milidetik = 1 detik, jadi jika int time adalah angka 1 maka itu 1 detik
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // fungsi untuk menampilkan notifikasi waktu sudah habis
    public void addNotifTimerDone(String value) { // fungsi ini membutuhkan 1 parameter yaitu waktu yg habis adalah yg berapa jam?
        btnStart.setText("Mulai"); // jika waktu sudah habis maka text pada tombol (mulai, tunda, lanjutkan) akan mejadi "Mulai"
        btnStart.setEnabled(false); // dan tombol (mulai, tunda, lanjutkan) akan di disable
        JOptionPane.showConfirmDialog(null, "Waktu penyewaan " + value.toUpperCase() + " sudah habis!", "Info", JOptionPane.OK_OPTION); // menampilkan notifikasi waktu sudah habis
    }
}
