import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen üçgenin kenar uzunluklarını girin:\n");

        System.out.print("a: ");
        double a = input.nextDouble();

        System.out.print("b: ");
        double b = input.nextDouble();

        System.out.print("c: ");
        double c = input.nextDouble();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı: " + alan);
    }
}
