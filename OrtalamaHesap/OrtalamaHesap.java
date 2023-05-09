import java.util.Scanner;

public class OrtalamaHesap {
    public static void main(String[] args) {

        int mat, fiz, trk, tarih, kimya, mzik;

        Scanner gir = new Scanner(System.in);
        System.out.print("Mat değerini Girin: ");
        mat = gir.nextInt();

        System.out.print("Fizik Değerini Girin: ");
        fiz = gir.nextInt();

        System.out.print("Türkçe Değerini Girin: ");
        trk = gir.nextInt();

        System.out.print("Tarih Değerini Girin ");
        tarih = gir.nextInt();

        System.out.print("Kimya Değerini Girin: ");
        kimya = gir.nextInt();

        System.out.print("Müzik Değerini Girin: ");
        mzik = gir.nextInt();

        int toplam = (mat + fiz + trk + tarih + kimya + mzik);
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız: " + sonuc);

        String sinifDurumu = sonuc >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sinifDurumu);
    }
}
