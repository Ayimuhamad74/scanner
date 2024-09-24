package Scanner;

import java.util.Scanner;

public class prismasegitigaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang alas segitiga: ");
        double panjangAlasSegitiga = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = input.nextDouble();
        System.out.print("Masukkan tinggi prisma segitiga: ");
        double tinggiPrismaSegitiga = input.nextDouble();
        double luasSegitiga = 0.5 * panjangAlasSegitiga * tinggiSegitiga;
        double luasPrismaSegitiga = luasSegitiga * tinggiPrismaSegitiga;
        System.out.println("Luas prisma segitiga: " + luasPrismaSegitiga);
    }
}
