package Giris.UsluSayilar;

import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini girin: ");
        int taban = input.nextInt();

        System.out.print("Üs değerini girin: ");
        int us = input.nextInt();

        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + " üzeri " + us + " = " + sonuc);
    }
}
