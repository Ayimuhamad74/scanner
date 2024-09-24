package Scanner;

import javax.swing.JOptionPane;

public class lingkaran3 {

    public static void main(String[] args) {

        String inputJariJari = JOptionPane.showInputDialog("Masukkan jari-jari lingkaran: ");

        try {

            double jariJari = Double.parseDouble(inputJariJari);

            double luas = Math.PI * jariJari * jariJari;

            JOptionPane.showMessageDialog(null, "Luas lingkaran adalah: " + luas);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Masukkan harus berupa angka!");
        }
    }

}
