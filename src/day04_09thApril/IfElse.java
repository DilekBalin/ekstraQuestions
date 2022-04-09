package day04_09thApril;

public class IfElse {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10 + 1);

        if (a < 5) {
            System.out.println("a 5'ten kucuktur " + a);
        } else {
            System.out.println("a 5'tir veya daha buyuktur= " + a);
        }

        int b=6;
        if(b<7){ b=b-2;b=b+5; //boyle de yazabiliriz
            //b,7'den kucuk true ve islem yapar
            //b=6-2  b=4
            //b= 4+5   b=9

        }
        System.out.println(b);


        int c= (int) (Math.random()*10);
        if(c>5){
            System.out.println("c,5'ten buyuk");

        } else if(c==5){
            System.out.println("c,5'e esittir");
        } else System.out.println("c,5'ten kucuktur");
    }

}
