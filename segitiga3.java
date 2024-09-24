package Scanner;

import javax.swing.JOptionPane;

public class segitiga3 {
    public static void main(String[] args) {

        String inputPanjangAlas = JOptionPane.showInputDialog("Masukkan panjang alas segitiga: ");

        String inputTinggiSegitiga = JOptionPane.showInputDialog("Masukkan tinggi segitiga: ");

        String inputTinggiPrisma = JOptionPane.showInputDialog("Masukkan tinggi prisma: ");

        try {

            double panjangAlas = Double.parseDouble(inputPanjangAlas);
            double tinggiSegitiga = Double.parseDouble(inputTinggiSegitiga);
            double tinggiPrisma = Double.parseDouble(inputTinggiPrisma);

            double luas = (panjangAlas * tinggiSegitiga) + 2 * (panjangAlas * tinggiPrisma);

            JOptionPane.showMessageDialog(null, "Luas prisma segitiga adalah: " + luas);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Masukkan harus berupa angka!");
        }
    }

}
