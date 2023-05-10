package Giris.UserEntry;

import java.util.Scanner;

public class UserEntry {
    public static void main(String[] args) {
        String kulAdi, pass, yeniPass;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        kulAdi = inp.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        pass = inp.nextLine();

        // Kullanıcının girdiği şifreyi kontrol ediyoruz ve İlk olarak 1234 Şifresini tanımlıyoruz.
        if (pass.equals("1234")) {
            System.out.println("Hoşgeldiniz " + kulAdi);
        } else {
            System.out.println("Hatalı Şifre Girdiniz!");

            // Kullanıcıya şifresini sıfırlamak isteyip istemediğini soruyoruz
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (E/H)");
            String cevap = inp.nextLine();
            if (cevap.equalsIgnoreCase("E")) {

                // Yeni şifreyi kontrol ediyoruz
                System.out.println("Yeni Şifrenizi Giriniz: ");
                yeniPass = inp.nextLine();
                if (yeniPass.equals(pass)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Programdan çıkılıyor.");
            }
        }
    }
}
