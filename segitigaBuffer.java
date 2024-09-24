package Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class segitigaBuffer {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Masukkan panjang alas segitiga: ");
            String inputAlas = reader.readLine();
            double alas = Double.parseDouble(inputAlas);

            System.out.print("Masukkan tinggi segitiga: ");
            String inputTinggi = reader.readLine();
            double tinggi = Double.parseDouble(inputTinggi);

            double luas = 0.5 * alas * tinggi;

            System.out.println("Luas segitiga adalah " + luas);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat membaca input.");
        } catch (NumberFormatException e) {
            System.err.println("Masukan tidak valid. Pastikan Anda memasukkan angka.");
        }
    }

}
