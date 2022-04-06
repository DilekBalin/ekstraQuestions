package day03_06thApril;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int arr1 [] = {10,20,30,40,50};
        int arr2 []=new int[5];

        System.out.print("Array 2 'nin degerlerini girin:");
        for (int i=0; i<arr2.length; i++) {
            arr2[i] = scan.nextInt();  //arr2 'nin i.indeksini kullanicidan istiyoruz
        }
        System.out.println("Array 2'nin degerleri yaziliyor....");

        for (int i=0; i<arr2.length;i++){
            System.out.println("Eleman : "+ arr2[i]);
        }

    }
}
