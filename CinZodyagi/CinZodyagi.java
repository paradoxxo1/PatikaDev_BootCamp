package Giris.CinZodyagi;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        // Kullanıcıdan doğum yılını alma
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = input.nextInt();

        // Çin Zodyağı hesaplaması
        String[] hayvanlar = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        int hesap = dogumYili % 12;
        //Girilen Yılın Kalanını burada görmek için bu kod eklenmiştir. İstenmemesi durumunda çıkartılabilir.
        System.out.println(hesap);
        String burc = hayvanlar[hesap];

        // Sonucun yazdırılması
        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
}


