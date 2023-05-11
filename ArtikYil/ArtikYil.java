package Giris.ArtikYil;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Yıl Giriniz: ");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " Bir artık yıldır !");
        } else {
            System.out.println(year + " Bir artık yıl değildir !");
        }
    }
}

