package Giris.HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int num1, num2, secim;
        double sonuc;
        Scanner giris = new Scanner(System.in);
        System.out.print("1.Sayıyı Giriniz: ");
        num1 = giris.nextInt();
        System.out.print("2.Sayıyı Giriniz: ");
        num2 = giris.nextInt();

        System.out.println("1-Toplama \n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        secim = giris.nextInt();

        switch (secim) {
            case 1:
                sonuc = num1 + num2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc = num1 - num2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc = num1 * num2;
                System.out.println(sonuc);
                break;
            case 4:
                sonuc = (double) num1 / num2;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
        }

    }
}
