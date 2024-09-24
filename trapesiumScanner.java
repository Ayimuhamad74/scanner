package Scanner;

import java.util.Scanner;

public class trapesiumScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan panjang sisi atas trapesium : ");
        double sisiAtas = input.nextDouble();
        System.out.println("Masukan panjang sisi bawah trapesium : ");
        double sisiBawah = input.nextDouble();
        System.out.println("Masukan tinggi trapesium : ");
        double tinggiTrapesium = input.nextDouble();
        double luasTrapesium = 0.5 * (sisiAtas + sisiBawah) * tinggiTrapesium;
        System.out.println("Luas trapesium : " + luasTrapesium);
    }
}
