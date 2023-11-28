package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number = 5;
        int toplam =0;

        for(int i=1;i<number;i++){
            if(number%i == 0){
                toplam = toplam + i;
            }
        }
        if(number == toplam){
            System.out.println(number + " Mükemmel sayıdır.");
        }
        else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}