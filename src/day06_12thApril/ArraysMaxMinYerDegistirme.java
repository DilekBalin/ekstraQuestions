package day06_12thApril;

import java.util.Arrays;

public class ArraysMaxMinYerDegistirme {
    public static void main(String[] args) {
        /*
        Verilen bir tam sayi dizisinin en buyuk elemanini
        ve en kucuk elemanini bulup yer degistirin

        INPUT:
        {13,10,56,20,40,60,56,32}

        OUTPUT:
        {13,60,56,20,40,10,56,32}
         */

        int numbers[] = {13, 10, 56, 20, 40, 60, 56, 32};
        for (int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+ " ");
        System.out.println();
        int max = numbers[0];
        int min = numbers[0];
        int maxSira = 0;
        int minSira = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxSira = i;


            }

        }
        int temp = numbers[maxSira];
        numbers[maxSira] = numbers[minSira];
        numbers[minSira] = temp;
        for (int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+ " ");

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minSira = i;
            }


        }

        System.out.println("En buyuk sayi " + max);
        System.out.println("En buyuk sayinin yeri =" + maxSira);
        System.out.println("En kucuk sayi= " + min);
        System.out.println("En kucuk sayinin yeri= " + minSira);

    }
}