package day01_3thApril;

public class While {
    public static void main(String[] args) {


        int sayi = 0;   //assign atama yapildi

        while (sayi < 5) {     //kosul
            // ve kosul true ise  while body'si calismaya baslar
            //while ici islem yapilan yerler
            System.out.print("Java-");  //Java-Java-Java-Java-Java-
            sayi++;  //artirma ya d aazaltma yaptigimizi belirtiyoruz
            System.out.println(" ");  //alt satira gecmek icin
        }
        System.out.println("Dongu bitti sonuc: " + sayi); //Dongu bitti sonuc: 5


        int sayi1 = 5;   //assign atama yapildi

        while (sayi1 > 0) {
            System.out.println("Java-");
            sayi1--;

        }
        System.out.println("*****************");
        int sayi2 = 5;   //assign atama yapildi

        while (sayi2 > 0) {
            System.out.print("Java-");  //Java-Java-Java-
            sayi2 -= 2;


        }
    }
}