package Giris.EBOBEKOK;

import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, gcd = 1, lcm;

        System.out.print("İlk sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

        int i = 1;
        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }

        lcm = (num1 * num2) / gcd;

        System.out.println("Girilen sayıların EBOB'u: " + gcd);
        System.out.println("Girilen sayıların EKOK'u: " + lcm);
    }
}
