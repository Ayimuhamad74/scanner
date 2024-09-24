package Scanner;

import javax.swing.JOptionPane;

public class trapesium3 {
    public static void main(String[] args) {

        String inputSisiAtas = JOptionPane.showInputDialog("Masukkan panjang sisi atas (a) trapesium: ");

        String inputSisiBawah = JOptionPane.showInputDialog("Masukkan panjang sisi bawah (b) trapesium: ");

        String inputTinggi = JOptionPane.showInputDialog("Masukkan tinggi (h) trapesium: ");

        try {

            double sisiAtas = Double.parseDouble(inputSisiAtas);
            double sisiBawah = Double.parseDouble(inputSisiBawah);
            double tinggi = Double.parseDouble(inputTinggi);

            double luas = 0.5 * (sisiAtas + sisiBawah) * tinggi;

            JOptionPane.showMessageDialog(null, "Luas trapesium adalah: " + luas);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Masukkan harus berupa angka!");
        }
    }

}
