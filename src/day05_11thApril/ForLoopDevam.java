package day05_11thApril;

import java.util.Scanner;

public class ForLoopDevam {


    public static void main(String[] args) {
          /*N adet sayi veriliyor
    2'ye tam bolunebilen sayilar ile 3'e tam bolunebilen sayilarin ortalamasini bulunuz
     */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 5 tane tam sayi giriniz = ");
        int N = scanner.nextInt();

        int ikiyeBolunebilenToplam = 0;
        int uceBolunebilenToplam = 0;
        double ortIki,ortUc;
        int sayac1=0,sayac2=0;
        int sayi;

        for (int i = 0; i < N; i++) {
            sayi = scanner.nextInt();
            if (sayi % 2 == 0) {
                ikiyeBolunebilenToplam += sayi;
                sayac1++;
            }
            if (sayi % 3 == 0) {
                uceBolunebilenToplam += sayi;
                sayac2++;

            }
        }
        ortIki=1.0*ikiyeBolunebilenToplam /sayac1;
        ortUc=1.0*uceBolunebilenToplam/sayac2;
        System.out.println("ikiye bolunebilenlerin ortalamasi ="+ortIki);
        System.out.println("uce bolunebilenelrin ortalamasi= " +ortUc);
    }
}
