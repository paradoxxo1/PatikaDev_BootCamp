import java.util.Scanner;

public class GectiKaldi {
    public static void main(String[] args) {
        int mat, fiz, turk, tarih, kimya;
        int gecerliDersSayisi = 0;
        double toplam = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Girin: ");
        mat = inp.nextInt();
        if (mat >= 0 && mat <= 100) {
            gecerliDersSayisi++;
            toplam += mat;
        }

        System.out.println("Fizik Notunuzu Girin: ");
        fiz = inp.nextInt();
        if (fiz >= 0 && fiz <= 100) {
            gecerliDersSayisi++;
            toplam += fiz;
        }

        System.out.println("Türkçe Notunuzu Girin: ");
        turk = inp.nextInt();
        if (turk >= 0 && turk <= 100) {
            gecerliDersSayisi++;
            toplam += turk;
        }

        System.out.println("Tarih Notunuzu Girin: ");
        tarih = inp.nextInt();
        if (tarih >= 0 && tarih <= 100) {
            gecerliDersSayisi++;
            toplam += tarih;
        }

        System.out.println("Kimya Notunuzu Girin: ");
        kimya = inp.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            gecerliDersSayisi++;
            toplam += kimya;
        }

        if (gecerliDersSayisi == 0) {
            System.out.println("Girilen ders notları geçerli değil.");
        } else {
            double ortalama = toplam / gecerliDersSayisi;
            if (ortalama < 55) {
                System.out.println("Sınıfta Kaldınız Seneye Görüşürüz");
            } else {
                System.out.println("Geçtiniz Tebrikler");
            }
            System.out.println("Ortalamanız: " + ortalama);
        }
    }
}
