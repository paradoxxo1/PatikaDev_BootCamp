import java.util.Scanner;

public class KDVHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen tutarı girin: ");
        double tutar = input.nextDouble();

        double kdvOrani;
        if (tutar > 0 && tutar <= 1000) {
            kdvOrani = 0.18; // KDV oranı %18
        } else if (tutar > 1000) {
            kdvOrani = 0.08; // KDV oranı %8
        } else {
            System.out.println("Hatalı tutar girdiniz!");
            return;
        }

        double kdvTutari = tutar * kdvOrani;
        double kdvlifiyat = tutar + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV'li Fiyat: " + kdvlifiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);
    }
}
