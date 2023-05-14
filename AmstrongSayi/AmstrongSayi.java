package Giris.AmstrongSayi;

import java.util.Scanner;

public class AmstrongSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();

        // Basamak sayısını bulma
        int digitCount = String.valueOf(number).length();

        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digitCount);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " bir Armstrong sayısıdır.");
            // Basamakları toplama
            int digitSum = 0;
            temp = number;
            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }
            System.out.println("Basamaklarının toplamı: " + digitSum);
        } else {
            System.out.println(number + " bir Armstrong sayısı değildir.");
        }
    }
}
