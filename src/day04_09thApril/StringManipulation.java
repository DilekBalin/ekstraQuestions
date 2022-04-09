package day04_09thApril;

public class StringManipulation {

    public static void main(String[] args) {

        String str="Merhaba Dunya";
        int sayi;
        sayi=str.indexOf(" ");  // str'deki boslugun adresini verir ve oncesini ve sonrasini koparir
        System.out.println("sayi= "+sayi); //7
        String s1,s2;
        s1=str.substring(0,sayi); //0.indexten bosluga kadar koparir>>> Merhaba yazdirir
        s2=str.substring(sayi+1); //bosluktan sonraki kismi koparir  >> Dunya
        str=s2+" "+ s1;
        str=str.toUpperCase();
        System.out.println("str= " +str);// DUNYA MERHABA

    }
}
