package grupSorulari;

import java.util.Arrays;

public class Soru6 {
    /*Bir siniftaki ogrencilerin boylari tam sayi olarak verilmistir, ayrica bu sinifin ogrencisi olan Ali'nin de
   boyu veriliyor,.Beden egitimi dersinde ogrenciler buyukten kucuge
   siralandiginda Ali kacinci sirada olur?(En uzun ogrenci 1. siradadir ve boy esitligi dikkate alinmamistir°
   input={170,180,167,165,175,190,169,172,187,178,175}
   Alinin boyu 175
   output=Ali 5.siradadir*/
    public static void main(String[] args) {

        int boylari[] = {198,195,170, 180, 167, 165, 175, 190, 169, 172, 187, 178, 175};

        Arrays.sort(boylari);

        System.out.println(Arrays.toString(boylari));

        int buyuktenKucuge[] = new int[boylari.length];

        for (int i = 0; i < buyuktenKucuge.length; i++) {

            buyuktenKucuge[i] = boylari[boylari.length - 1 - i];

        }
        System.out.println(Arrays.toString(buyuktenKucuge));


        System.out.println ("Ali " + (Arrays.binarySearch(buyuktenKucuge,198)) + " .siradadir.");


    }

}
