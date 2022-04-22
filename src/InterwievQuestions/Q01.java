package InterwievQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir String aliniz
        String'te var olan her karakterin sayisini ekrana yazdiriniz
        Ornek:
       alacan>>>> a=3, l=1, c=1, n=1
       abaa===>  a=3,  b=1
   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str = scan.nextLine();

        //split()
        String arr[] = str.split("");  //Data type'i String olan bir array olusturduk ve herbir karakteri parcalaadik
        Arrays.sort(arr); // tum karakterleri alfabetik sirayla verir
        System.out.println(Arrays.toString(arr));

        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;
            } else {
                System.out.println(arr[1 - 1] + " sayisi " + (counter + 1) + " kez kullanilmistir");
                //counter+1 dememeizin sebebei nce sanki k arakter yokmus gibi 0 dedik eger karakterle karsilasirsa 1 artiracak
                counter = 0;  //sayaci sifirlammaiz gerekir ki diger karakteri de saymya gecsin
            }

            if (i == arr.length - 1) { ///en sona geldiginde
                System.out.println(arr[i] + " sayisi " + (counter + 1) + " kez kullanilmistir");
            }


        }

    }}