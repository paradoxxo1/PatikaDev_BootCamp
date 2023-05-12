package Giris.SayiGir;

import java.util.Scanner;

public class SayiGir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int adet = 0;

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        double ortalama = (double) toplam / adet;
        System.out.println("Ortalama: " + ortalama);
    }
}







