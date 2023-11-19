package org.example;

public class metotlar {
    public static void main(String[] args) {

        mesajVer("Esra");
        mesajVer("Halil");
        mesajVer("Seyda");

        hesapla();
        hesapla();


        System.out.println(topla(5,3));

    }
    public static void mesajVer(String isim){
        System.out.println("Merhaba " + isim);
    }
    public  static  void hesapla(){
        System.out.println("Hesaplandı");
    }
    public static int topla(int sayi1 ,int sayi2){
        int toplam = sayi1 + sayi2;
        return  toplam;
    }

    //toplanan iki sayinin %10 unu bul
    public static double toplananIkiSayininYuzdesi(int sayi1,int sayi2){
        int toplam = topla(sayi1,sayi2);
        double sonuc = toplam * 10/100;
        System.out.println("Sonuc = " + sonuc);
        return sonuc;
    }
    public static double krediHesapla(double krediMiktari){
        return 125000;
    }

}
