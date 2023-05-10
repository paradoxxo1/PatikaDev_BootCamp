package Giris.BurcBul;

import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int day, month;
        System.out.print("Lütfen Doğduğunuz Günü Seçin:");
        day = input.nextInt();
        System.out.print("Lütfen Doğduğunuz Ayı seçiniz (Sayı olarak): ");
        month = input.nextInt();

        if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
            System.out.println(" Sizin Burcunuz Kova (Aquarius)");
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            System.out.println("Sizin Burcunuz Balık (Pisces)");
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            System.out.println("Sizin Burcunuz Koç (Aries)");
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            System.out.println("Sizin Burcunuz Boğa (Taurus)");
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            System.out.println("Sizin Burcunuz İkizler (Gemini)");
        } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            System.out.println("Sizin Burcunuz Yengeç (Cancer)");
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            System.out.println("Sizin Burcunuz Aslan (Leo)");
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            System.out.println("Sizin Burcunuz Başak (Virgo)");
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            System.out.println("Sizin Burcunuz Terazi (Libra)");
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            System.out.println("Sizin Burcunuz Akrep (Scorpio)");
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            System.out.println("Sizin Burcunuz Yay (Sagittarius)");
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            System.out.println("Sizin Burcunuz Oğlak (Capricorn)");
        } else {
            System.out.println("Hatalı Giriş Yaptınız");
        }
    }
}
