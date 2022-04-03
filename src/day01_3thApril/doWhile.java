package day01_3thApril;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi = scanner.nextInt();
        int toplam=0;

        do {
            toplam+=sayi%10;//birler basamagini konteynira attim
            sayi/=10;//birler basamagindan kurtuldum

        } while (sayi>0) ;
        System.out.println(toplam);
        }


    }

