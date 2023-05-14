package Giris.TersUcgen;

import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
