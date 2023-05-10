package Giris.SayiSirala;

import java.util.Scanner;

public class SayiSirala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.print("Lütfen üçüncü sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        int enKucuk = Math.min(sayi1, Math.min(sayi2, sayi3));
        int enBuyuk = Math.max(sayi1, Math.max(sayi2, sayi3));
        int ortanca = (sayi1 + sayi2 + sayi3) - (enKucuk + enBuyuk);

        System.out.println(enKucuk + " <= " + ortanca + " <= " + enBuyuk);
    }
}
