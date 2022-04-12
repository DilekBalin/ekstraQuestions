package day05_11thApril;

public class While {
    public static void main(String[] args) {


        //1'den 10 a kadar olan sayilari toplayin(10 dahil)


        int num = 10;
        int toplam = 0;

        int i = 0;   //starting value
        while (i < num + 1) { //condition
            toplam += i;  //ending value
            i++;   //increment or decrement

        }
        System.out.println("sayilarin toplami= " + toplam);
    }
}
