package day05_11thApril;

import java.util.Scanner;

public class NFaktoriyelibulma {
    public static void main(String[] args) {
        // N faktoriyeli bulan bir program yaziniz
        //Bir sinifin mevcudu ve bu sinifa ait notlar veriliyor,sinif ortalamasini bulan programi yaziniz


        int sayi = 5;
        int faktoriyel = 1;

        for (int i = 1; i < sayi + 1; i++) {
            faktoriyel *= i;

        }
        System.out.println(faktoriyel);

        System.out.println("****************");


        int mevcut = 5;
        int sum = 0;
        double average;


        for (int i = 1; i < mevcut+1 ; i++) { //her ogrencinin notunu sirayla alacagiz
            Scanner scan = new Scanner(System.in);
            System.out.print("Lutfen not giriniz= ");
           double not = scan.nextDouble();
            sum += not;
        }
        average=1.0*sum/mevcut;
        System.out.println("ortalama =" +average);
    }
}