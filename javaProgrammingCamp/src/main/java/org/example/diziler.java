package org.example;

public class diziler {
    public static void main(String[] args) {
        String[] sehirler1 = new String[]{"Ankara","İstanbul","İzmir"};
        String[] sehirler2 = new String[]{"Antep","Diyarbakır","Urfa"};

        sehirler1 = sehirler2;
        sehirler1[0] = "Adana";
        System.out.println(sehirler2[0]);
    }
}
