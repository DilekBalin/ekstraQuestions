package questionsOfOsa;

public class Ternary {
    public static void main(String[] args) {

     //Soru1
        int x = 5;
        System.out.println((x > 2 ? x < 4 ? 10 : 8 : 7));
        //ilk soru isareti ile son iki nokta arasi sartimiz dogru ise calisacak
        //eger hicbir sartimiz saglanmiyorsa son iki noktadan sonraki kisim calisir yani 7 olur
        //5>2 true oldugu icin ic kisma yani 10 ve 8 sartina bakacagiz
        //5<4 false oldugu icin ilk sonuc olan 10 calismaz ve cevap 8 olur


        //verilen bir sayinin tek veya cift oldugunu yazdiran bir kod olusturun

        System.out.println("**************");

      //Soru 2
        int sayi=20;
        if(sayi%2==0){
            System.out.println("sayi cifttir");
        }
  else {
            System.out.println("Sayi tektir");
        }
        System.out.println(sayi%2==0?"sayi cifttir":"sayi tektir");   //ternary ile tek satirda yaptik
    }
}
