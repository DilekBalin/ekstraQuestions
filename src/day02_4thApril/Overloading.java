package day02_4thApril;

public class Overloading {

    //bir methodun frakli parametrelerle calismasidir

    public static void toplama(int a,int b, int c){
        System.out.println("Toplamlari= "+(a+b+c));
    }

    public static void toplama(int a,int b){
        System.out.println("Toplamlari= "+(a+b));
    }

    public static void toplama (int a, int b, int c, int d){
        System.out.println("Toplamlari= "+(a+b+c+d));
    }
    public static void main(String[] args) {
toplama(4,5,6);
toplama(52,20);
toplama(5,5,9,19);
    }
}
