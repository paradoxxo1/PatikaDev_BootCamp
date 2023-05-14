package Giris.CiftKatlari;

import java.util.Scanner;

public class CiftKatlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0;

        do {
            System.out.print("Bir sayı girin: ");
            num = input.nextInt();

            if (num % 2 == 0 && num % 4 == 0) {
                sum += num;
            }
        } while (num != 1);

        System.out.println("Girilen çift ve 4'ün katı sayıların toplamı: " + sum);
    }
}
