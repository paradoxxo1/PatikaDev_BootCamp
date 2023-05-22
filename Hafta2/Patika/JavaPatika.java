package Hafta2;

import java.util.Scanner;

public class JavaPatika {

    static int readNumber(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        return scan.nextInt();
    }

    static void plus() {
        int counter = readNumber("Kaç tane değer girilecek: ");
        int result = 0;

        for (int i = 1; i <= counter; i++) {
            result += readNumber(i + ". sayı: ");
        }

        System.out.println("Cevap: " + result);
    }

    static void minus() {
        int numCount = readNumber("Kaç sayı gireceksiniz? ");
        int[] nums = new int[numCount];

        for (int i = 0; i < numCount; i++) {
            nums[i] = readNumber((i + 1) + ". sayıyı girin: ");
        }

        int result = nums[0];
        for (int i = 1; i < numCount; i++) {
            result -= nums[i];
        }

        System.out.println("Cevap = " + result);
    }

    static void times() {
        int counter = readNumber("Kaç adet sayı girilecek: ");
        int result = 1;

        for (int i = 1; i <= counter; i++) {
            result *= readNumber(i + ". sayı: ");
        }

        System.out.println("Cevap = " + result);
    }

    static void divided() {
        int counter = readNumber("Kaç adet sayı girilecek: ");
        double result = 0.0;

        for (int i = 1; i <= counter; i++) {
            double number = readNumber(i + ". sayı: ");

            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }

            if (i == 1) {
                result = number;
            } else {
                result /= number;
            }
        }

        System.out.println("Cevap = " + result);
    }

    static void power() {
        int base = readNumber("Taban değeri: ");
        int exponent = readNumber("Üs değeri girin: ");
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Cevap = " + result);
    }

    static void factorial() {
        int number = readNumber("Sayı giriniz: ");

        if (number < 0) {
            System.out.println("Negatif sayının faktoriyeli hesaplanamaz.");
            return;
        }

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println(number + " Faktoriyel = " + result);
    }

    static void mod() {
        int num1 = readNumber("İlk sayıyı giriniz: ");
        int num2 = readNumber("İkinci sayıyı giriniz: ");
        int result = num1 % num2;

        System.out.println("Cevap: " + result);
    }

    static void rectangle() {
        int a = readNumber("Uzun kenarı giriniz: ");
        int b = readNumber("Kısa kenarı giriniz: ");

        if (a == 0 || b == 0) {
            System.out.println("Uzunluk değeri 0 olamaz.");
            rectangle();
        } else {
            int cevre = 2 * (a + b);
            int alan = a * b;

            System.out.println("Çevresi = " + cevre);
            System.out.println("Alanı = " + alan);
        }
    }

    public static void main(String[] args) {
        int select;
        String menu = "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-"
                + "\n1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış yap"
                + "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            Scanner scan = new Scanner(System.in);
            select = scan.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
            }
        } while (select != 0);
    }
}
