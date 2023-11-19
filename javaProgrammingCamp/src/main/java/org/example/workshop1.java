package org.example;

public class workshop1 {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,10};

        boolean status = sayiBul(sayilar,3);
        mesajVer(status,3);

    }

    public static boolean sayiBul(int[] dizi,int sayi){
        boolean status = false;
        for (int s:dizi
        ) {
            if (s==sayi){
                status = true;
                break;
            }
        }
        return status;
    }
    public static void mesajVer(boolean status,int sayi){
        String mesaj = "";

        if(status == true){
            mesaj = "Sayı mevcuttur " +sayi;
            System.out.println(mesaj);
        }
        else {
            mesaj = "Sayı mevcut değildir. " +sayi;
            System.out.println(mesaj);
        }
    }
}
