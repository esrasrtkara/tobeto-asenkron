package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       String mesaj = "Bugün hava çok güzel.";
//        System.out.println(mesaj);
//        System.out.println("karaktar sayısı : "+ mesaj.length());
//        System.out.println("5. karakter : "+mesaj.charAt(4));
//        System.out.println(mesaj.concat(" Yaşaşın!"));
//        System.out.println(mesaj.startsWith("B"));
//        System.out.println(mesaj.endsWith("."));
//        char[] karakterler = new char[5];
//        mesaj.getChars(0,5,karakterler,0);
//        System.out.println(karakterler);
//        System.out.println(mesaj.indexOf('a'));
//        System.out.println(mesaj.lastIndexOf("e"));

        System.out.println(mesaj.replace(' ','-'));
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,5));

        for (String kelime:mesaj.split(" ")
             ) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim()); // Başında ve sonundaki boşlukları yok eder.


    }
}