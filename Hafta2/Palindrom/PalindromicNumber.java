package Hafta2.Palindrom;

public class PalindromicNumber {
    public static void main(String[] args) {
        int number = 12321;
        if (isPalindromicNumber(number)) {
            System.out.println(number + " bir palindromik sayıdır.");
        } else {
            System.out.println(number + " bir palindromik sayı değildir.");
        }
    }

    static boolean isPalindromicNumber(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
