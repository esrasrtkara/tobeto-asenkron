package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;

        int buyuk=0;

        if(sayi1 > sayi2 && sayi1 > sayi3){
            buyuk = sayi1;
        }
        else if(sayi2 > sayi1 && sayi2 > sayi3){
            buyuk = sayi2;
        } else if (sayi3 > sayi1 && sayi3 > sayi2) {
            buyuk = sayi3;
        }

        System.out.println("En büyük sayı = "+buyuk);


    }
}