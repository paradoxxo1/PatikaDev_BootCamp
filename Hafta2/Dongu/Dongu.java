package Hafta2.Dongu;

public class Dongu {
    static void processNumber(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        processNumber(n - 5);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        processNumber(n);
    }
}
