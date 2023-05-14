package Giris.kombinasyon;

import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N değerini girin: ");
        int n = input.nextInt();
        System.out.print("R değerini girin: ");
        int r = input.nextInt();

        int nFaktoriyel = 1;
        int rFaktoriyel = 1;
        int nMinusRFaktoriyel = 1;

        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFaktoriyel *= i;
        }

        for (int i = 1; i <= n - r; i++) {
            nMinusRFaktoriyel *= i;
        }

        int kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }
}
