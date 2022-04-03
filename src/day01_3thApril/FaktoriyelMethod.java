package day01_3thApril;

import java.util.Scanner;

public class FaktoriyelMethod {


    public static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int sayi=scanner.nextInt();
        int faktoriyel=1;

        while(sayi>0){
            faktoriyel*=sayi;
            sayi--;
        }
        System.out.println(faktoriyel);
    }



    public static void main(String[] args) {
        faktoriyel();
        faktoriyel();   //bu methodu main method icinde defalarca kullanabilirim

    }
}
