package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4,5};
        int aranacak = 7;
        boolean varMi = false;

        for (int sayi:sayilar
             ) {
             if(sayi == aranacak){
                 varMi = true;
                 break;
             }
        }

        if(varMi){
            System.out.println("Sayı bulundu.");
        }
        else {
            System.out.println("Sayı bulunamadı.");
        }
    }
}