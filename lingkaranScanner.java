package Scanner;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class lingkaranScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan jari- jari lingkaran : ");
        double jarijari = input.nextDouble();
        double luasLingkaran = Math.PI * jarijari * jarijari;
        System.out.println("Luas lingkaran : " + luasLingkaran);
    }
}
