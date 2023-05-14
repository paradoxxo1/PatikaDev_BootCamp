package Giris.HarmonikSeri;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = input.nextInt();

        double harmonikSerisi = 0;

        for (double i = 1; i <= n; i++) {
            harmonikSerisi += 1 / i;
        }

        System.out.println(n + " sayısının harmonik serisi = " + harmonikSerisi);
    }
}
