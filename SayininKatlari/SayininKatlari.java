package Giris.SayininKatlari;

import java.util.Scanner;

public class SayininKatlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int num = input.nextInt();

        int power4 = 1, power5 = 1;
        while (power4 <= num || power5 <= num) {
            if (power4 <= num) {
                System.out.println(power4);
                power4 *= 4;
            }
            if (power5 <= num) {
                System.out.println(power5);
                power5 *= 5;
            }
        }
    }
}
