package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for( int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");

        int i=1;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü bitti");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        }while(j<10);
        System.out.println("do-while döngüsü bitti");

    }
}