import java.util.Scanner;

public class ManavProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut kaç kilo ? : ");
        double armutKilo = input.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        double muzKilo = input.nextDouble();

        System.out.print("Patlıcan kaç kilo ? : ");
        double patlicanKilo = input.nextDouble();

        double toplamTutar = armutFiyat * armutKilo +
                elmaFiyat * elmaKilo +
                domatesFiyat * domatesKilo +
                muzFiyat * muzKilo +
                patlicanFiyat * patlicanKilo;

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
