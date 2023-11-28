package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      char harf = 'E';

      if (harf == 'A' || harf == 'U' || harf == 'I' || harf == 'O' ){
          System.out.println(harf + " kalın seslidir.");
      } else if (harf == 'E' || harf == 'Ü' || harf == 'İ' || harf == 'Ö') {
          System.out.println(harf + " ince  seslidir.");
      }
      else {
          System.out.println("Lütfen sesli harf giriniz.");
      }
    }
}