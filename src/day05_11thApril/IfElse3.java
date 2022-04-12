package day05_11thApril;

public class IfElse3 {
    public static void main(String[] args) {

        //Verilen sayiinin pozitif,negatif ya da sifir olup olmadigini ekrana yazdiran  progrm yaziniz
        //Verilen dort sayinin en buyugunu ekrana yazdiran programi bulunuz

        int sayi = (int) (Math.random() * 10 - 5);


        if (sayi > 0) {
            System.out.println("sayi: " + sayi + " pozitif sayidir");
        } else if (sayi < 0) {
            System.out.println("sayi : " + sayi + " negatif sayidir");

        } else System.out.println("sayi : " + sayi + " sifira esittir");


        int sayi1 = (int) (Math.random() *10);  //sayi 0 ile 10 arasindadir
        int sayi2 = (int) (Math.random() * 10);
        int sayi3= (int) (Math.random() * 10);
        int sayi4 = (int) (Math.random() * 10);
        System.out.println(sayi1+" "+sayi2+" "+sayi3+" "+sayi4);

        int max=sayi1;
        if(sayi2>max) max=sayi2;
        if(sayi3>max) max=sayi3;
        if (4>max) max=sayi4;

            System.out.println("En buyuk sayi= "+max);



    }
}