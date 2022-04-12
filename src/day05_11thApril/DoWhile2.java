package day05_11thApril;

public class DoWhile2 {
    //1'den 10 kadar olan tek ve cift sayilarin toplamini bulunuz
    public static void main(String[] args) {

        int sayi = 10;  //girilen sayi
        int toplamCift = 0;  //cift sayilarin toplami icin bos konteynir
        int toplamTek = 0;  //tek sayilarin toplami icin bos konteynir

        int i = 0;   //starting value

        do {  //aksiyon burda gerceklesiyor
            if (i % 2 == 0) toplamCift += i;    //2 ye tam bolunurse cift kontynirina at
            else toplamTek += i;   //2'ye tam bolunmezse tek konteynirina at
            i++; //decrement

        } while (i < sayi + 1);  //condition

       System.out.println(toplamCift);
        System.out.println(toplamTek);
    }
}
