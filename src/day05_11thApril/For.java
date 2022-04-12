package day05_11thApril;

public class For<sum> {
    public static void main(String[] args) {
        int N = 10;
        int toplam = 0;
        for (int i = 0; i < N + 1; i++) { //i=i+1   //10 kez donecek bu islem
            System.out.println("i = " + i);
            toplam += i;

        }
        System.out.println("tum sayilarin toplami = " + toplam);


        //1den 10 a kadar olan tek sayilarin toplamini bul
        int sayi = 10;
        int sum = 0;
        for (int i = 1; i < sayi; i = i + 2) {  //i ,1 den baslasin sarti saglarsa asgida konteynira ekle yukaru cikarken 2 artir
            //i, 3 oldu sarti sagladi konteynirda 1 vardi 1+3=4 oldu
            // yukari cikarke 2 artirdi sayimiz artik 5 ve ayni islem devam eder
            sum += i;
        }
        System.out.println("tek sayilarin toplami= "+ sum);


        System.out.println("**************");

   //1'den 10 a kadar olan cift sayilarin toplamini bulun

        int sayi2=10;
        int toplamTek=0;
        int toplamCift=0;

        for(int i=1; i<sayi2+1;i++){
            if(i%2==0) toplamCift+=i;
            else toplamTek+=i;

            }
        System.out.println("cift sayilarin toplami= "+toplamCift);
        System.out.println("tek sayilarin toplami= "+toplamTek);
        }

    }
