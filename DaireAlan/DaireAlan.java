import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen daire diliminin yarıçapını girin: ");
        double r = input.nextDouble();

        System.out.print("Lütfen merkez açısının ölçüsünü girin: ");
        double alpha = input.nextDouble();

        double pi = 3.14;
        double alan = (pi * r * r * alpha) / 360;

        System.out.println("Daire diliminin alanı: " + alan);
    }
}
