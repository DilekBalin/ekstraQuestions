package InterwievQuestions;

import java.util.Scanner;

public class MySolution02 {
    public static void main(String[] args) {

          /*Kullanicidan alinan bir String'in ilk ve son harfini yine kullanicidan alinan sayi kadar
        return eden bir method yaziniz

        Ornek:
        input      output
        elma  2    eaea
        army  3     ayayay
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bi string giriniz");
        String kelime= scan.nextLine();
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        System.out.println(method(kelime, sayi));


    }

    private static String method(String kelime, int sayi) {
        String str="";
        char ilkHarf=kelime.charAt(0);
        char sonHarf=kelime.charAt(kelime.length()-1);
        for(int i=0;i<sayi;i++){
            str+=(ilkHarf + ""+ sonHarf);
        }

  return str;
    }
}
