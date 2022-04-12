package day05_11thApril;

import java.util.Scanner;

public class BoySiralama {
    public static void main(String[] args) {
        //Ali'nin ve sinif arkadaslarinin boyu rastgele veriliyor
        //ogrenciler boy sirasina gore dizildiginde ali kacinci sirada olur?

        //Ali=175, sinif boylar=175,185,165,175,182,173,182,175

        int sinifMevcudu=8;
        int ali=175;
        int boydas=0;
        int uzun=0;




        for (int i=0;i<sinifMevcudu;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("boy giriniz");
            int boy=scanner.nextInt();
            if(boy==ali){
                boydas++;
            }else if(boy>ali){
                uzun++;
            }
            }
            int ilksira=uzun+1;
            int sonsira=uzun+boydas;
        System.out.println("Ali "+ilksira+" ile"+sonsira+ " arasindadir.");


        }


    }

