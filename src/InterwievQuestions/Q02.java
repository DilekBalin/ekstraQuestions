package InterwievQuestions;

import java.util.Scanner;

public class Q02 {
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
        String str= scan.nextLine();
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        ilkSonHarf(str,sayi);
        System.out.println(ilkSonHarf(str,sayi));

    }

    private static String ilkSonHarf(String str, int sayi) {
        String s=str.substring(0,1)+str.substring(str.length()-1);

        String b="";//conteynir  //ilk basta ciktim belli degil cunku
        for (int i=0;i<sayi;i++){
            b+=s;

        }
          return b;    //ciktiyi yani son halini dondurduk yani return ettik
    }

}
