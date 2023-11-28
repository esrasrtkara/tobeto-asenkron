package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number = 25;
        //int remainder = number%2;
        // System.out.println(remainder);
        boolean isPrime = true;
        if (number < 2) {
            System.out.println("Geçersiz sayi");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(number + " asal sayı değildir");
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " asal sayıdır");
            }

        }
    }
}