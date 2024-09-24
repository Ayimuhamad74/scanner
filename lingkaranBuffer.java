package Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lingkaranBuffer {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Masukkan jari-jari lingkaran: ");
            String input = reader.readLine();

            double jariJari = Double.parseDouble(input);

            double luas = Math.PI * jariJari * jariJari;

            System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah " + luas);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat membaca input.");
        } catch (NumberFormatException e) {
            System.err.println("Masukan tidak valid. Pastikan Anda memasukkan angka.");
        }
    }

}
