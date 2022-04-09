package day04_09thApril;

public class Maths2 {
    public static void main(String[] args) {

        int sayi = Math.abs(-10);//sayinin mutlak degerini al demektir
        System.out.println("sayi= " + sayi);//10

        int yas1 = 15;
        int yas2 = 18;

        int yasFarki = yas1 - yas2;
        yasFarki = Math.abs(yasFarki);
        System.out.println("yas farki= " + yasFarki);//3

        long sayi2 = Math.round(3.99); // 4   //yuvarlama yapti
        System.out.println("Sayi2= " + sayi2);

        int sayi3 = (int) Math.sqrt(49);
        System.out.println(sayi3); //7

        int sayi4 = Math.max(45, 102);
        System.out.println(sayi4);//102
        sayi4 = Math.min(45, 102);
        System.out.println(sayi4);//45

        int a=10;
        int b=7;
        int kalan;
        kalan= a%b; //bir sayinin basamaklarini bulamda kullaniriz
        System.out.println("kalan = "+kalan);


        //birler ve onlar basamagini yer degistirin
        int c=57;
        int birlerBasamagi=c%10;  //10 ile bolumunden kalani verdi yani 7
        int onlarBasamagi=c/10;  //sayinin 10 ile bolumunden gelen sonuc 5,7 ancak integer 7'yi siler  yani sayimiz 5


        c=birlerBasamagi*10+onlarBasamagi;  //7*10+5>>>>75
        System.out.println(c);

        //Bunu String ile de yapabiliriz
        String str=String.valueOf(c); //integer veriyi String'e cevirme
        System.out.println(c);
        str= str.substring(1)+str.substring(0,1);
        System.out.println("Str = "  +str);  //57

        //String'i integer'a cevirme
        int num=Integer.valueOf(str); //String ifadeyi tam sayiya ceviriyor
        int num2=Integer.parseInt(str); //daha cok tercih ediliyor


    }


}
