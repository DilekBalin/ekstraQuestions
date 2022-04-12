package day05_11thApril;

public class ForLoop {
    //x ve y tam sayilardir
    //bu sayilar arasinda kalan sayilardan
    //3'e bolunebilen saylarin toplamini bulan bir program yaziniz (y>x)
    public static void main(String[] args) {


        int x = 15;
        int y = 1;
        int toplam = 0;

        if (y > x) {

            for (int i = x + 1; i < y; i++) {
                if (i % 3 == 0) toplam += i;
            }

        }else{
            for (int i = y + 1; i < x; i++) {
                if (i % 3 == 0) toplam += i;
        }
    }
        System.out.println("3'e bolunebilen sayilarin toplami= "+toplam);


    }}