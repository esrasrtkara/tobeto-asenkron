package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Esra";
        ogrenciler[1] = "Halil";
        ogrenciler[2] = "Ebru";
        ogrenciler[3] = "Seyda";

        for(int i= 0; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        for (String ogrenci:ogrenciler
             ) {
            System.out.println(ogrenci);
        }



    }
}