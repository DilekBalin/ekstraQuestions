package day01_3thApril;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //bir atm icin
        //bakiye goruntuleme
        //para yatirma
        //para cekme


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bakiye goruntuleme icin 1:");
        System.out.println("Para yatirmak icin 2:");
        System.out.println("Para cekmek icin 3:");
        System.out.println("Cikis icin 4:");

        int islem=scanner.nextInt();
        int bakiye=1000;

        switch(islem){
            case 1:
                System.out.println("Bakiyeniz= "+bakiye+" TL'dir.");
            case 2:
                System.out.println("yatiracaginiz miktari giriniz");
                int miktar=scanner.nextInt();
                bakiye+=miktar;
                System.out.println("Bakiyeniz= "+bakiye+ " TL'dir.");

            case 3:
                System.out.println("cekeceginiz miktari giriniz");
                miktar= scanner.nextInt();
                bakiye-=miktar;
                System.out.println("Bakiyeniz= "+bakiye+" TL'dir.");
            case 4:
                System.out.println("Sistemden cikiliyor....");break;

            default:
                System.out.println("Hatali giris");

        }

    }
}
