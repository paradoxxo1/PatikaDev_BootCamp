package Giris.Heat;

import java.util.Scanner;

public class Heat {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Değerini Girin: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsin.");
        } else if (heat <= 15) {
            System.out.println("Sinemaya gidebilirsin.");
            if (heat >= 10) {
                System.out.println("Pikniğe gidebilirsin.");
            }
        } else if (heat <= 25) {
            System.out.println("Pikniğe gidebilirsin.");
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsin.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
