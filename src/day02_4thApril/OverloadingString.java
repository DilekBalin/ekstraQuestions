package day02_4thApril;

public class OverloadingString {

    public static void skorHesapla(String name,int score){
        System.out.println(name+ " isimli oyuncunun puani= "+score);
    }

    public static void skorHesapla(String name){
        System.out.println(name +" isimli oyuncunun skoru= 0");
    }

    public static void skorHesapla(int score){
        System.out.println("Isimsiz oyuncunun skoru= "+score);
    }
    public static void main(String[] args) {
skorHesapla("Murat",300);
skorHesapla("MUrat");
skorHesapla(200);

    }
}
