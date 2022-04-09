package day04_09thApril;

public class Maths {
    public static void main(String[] args) {
        //Matematiksel fonksiyonlar
        double piSayisi =Math.PI;
        double randomSayi =Math.random();// 0 ile 1 arasinda sayilar getirir
      //  int randomSayiInt= (int) (randomSayi*100);//basta int vermedi cat to int yaptik
        //0 ile 99 arasinda sayi uretir
        int rs2= (int) (Math.random()*100+1); //1 ile 100 arasinda rastgeel uretilen sayi
        int randomSayiInt= (int)rs2;

        System.out.println("pi sayisi = " +piSayisi);//3.1415926535
        System.out.println("random sayi= " +randomSayi);//her calistridigimizda rastgele sayilar uretir
        System.out.println("randomSayiInt = "+randomSayiInt); //17
    }
}
