package day05_11thApril;

public class DoWhile {
    public static void main(String[] args) {
        //1den 10 'a kadar olan sayilarin toplamini bulunuz
        int sayi = 10;
        int toplam = 0;

        int i = 0;   // starting value>>>while ile ayni bu kisim
        do {
            toplam += i;    //ending value
            i++; //decrement or increment

        } while (i < sayi + 1);   //condition   >> bu kisim da while iel ayni
        System.out.println("do ile toplamlari =" + toplam);




        }



    }


