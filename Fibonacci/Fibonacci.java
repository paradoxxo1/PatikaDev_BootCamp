package Giris.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, first = 0, second = 1, next, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        n = input.nextInt();

        System.out.print(first + " " + second);

        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.print(" " + next);
            total += next;
            first = second;
            second = next;
        }

        System.out.println("\nToplam: " + total);
    }
}
