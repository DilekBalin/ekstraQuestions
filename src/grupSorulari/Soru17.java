package grupSorulari;

import java.util.Scanner;

public class Soru17 {
    public static void main(String[] args) {
         /*
        Given an int check the number is even or not
        if the number is even print true
        if the number is odd print false
        result should be true or false.
     */


     /*
        Veri tipi int olan number verildiğinde, number  çift mi tek mi kontrol et
        Eğer number çift ise  print true
        Eğer number tek ise  print false
        result true ya da false olmalı.
     */


            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen bir sayi giriniz");

            int sayi = scan.nextInt();

            if (sayi % 2 == 0) {
                System.out.println(true);
            } else System.out.println(false);


        }

    }

