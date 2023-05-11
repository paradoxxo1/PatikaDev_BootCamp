package Giris.UcakBilet;

import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 -> Tek Yön, 2 -> Gidiş-Dönüş): ");
        int yolculukTipi = input.nextInt();

        double birimFiyat = 0.10;
        double normalTutar = mesafe * birimFiyat;

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double indirimOrani = 0;

            if (yas < 12) {
                indirimOrani = 0.5;
            } else if (yas >= 12 && yas <= 24) {
                indirimOrani = 0.1;
            } else if (yas >= 65) {
                indirimOrani = 0.3;
            }

            double yasIndirimi = normalTutar * indirimOrani;
            double indirimliTutar = normalTutar - yasIndirimi;

            if (yolculukTipi == 2) {
                indirimliTutar *= 0.8;
            }

            System.out.println("Toplam Tutar: " + ((int) (indirimliTutar * yolculukTipi * 100) / 100.0) + " TL");
        }
    }
}
