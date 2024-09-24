package Scanner;

import javax.swing.JOptionPane;

public class input3 {
    public static void main(String[] args) {
        String nama = " ";
        nama = JOptionPane.showInputDialog("Masukan nama");
        String msg = "Selamat belajar " + nama;
        JOptionPane.showMessageDialog(null, msg);
    }
}
