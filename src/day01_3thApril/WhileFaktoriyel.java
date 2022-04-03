package day01_3thApril;

import java.util.Scanner;

public class WhileFaktoriyel {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi=scanner.nextInt();
        int faktoriyel=1;  //komnyetnir olusturduk

        while (sayi>=1){  //sayi 1 ve 1 den buyukse while calismaya baslasin
            faktoriyel*=sayi;  //faktoriyel tanimi yaptik
            sayi--;


           /* ornegin sayi 3 girilsin
           3 ,1'den buyuk ve while calisti
           faktoriyel 1,sayi 3 carpimlari 3 ve faktoriyel ci=onteynirina attik
           sayi 1 azaldi ve 2 ,1 den buyuk 2*3=6 conteynira atildi ve sayi 1 azaldi
           sayi 1 =1 ve ayni i islem
            */

        }
        System.out.println(faktoriyel);
    }
}
