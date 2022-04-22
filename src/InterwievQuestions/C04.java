package InterwievQuestions;

import java.util.Scanner;

public class C04 {
    //String olan pin kodunuzu kontrol eden bir kod yaziniz

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String pin="said12345";
        int girisHakki=4;
        System.out.println("****Hos geldiniz****");

        while(true){//pin kodu girip kod calsitigi surece  yani while icindeki sartlardan biri saglandigi surece bu blok caliscak
            System.out.println("pin kodu giriniz");
            String girilenPin= scanner.next();
            if(pin.equals(girilenPin)){
                System.out.println("Basarili giris yaptiniz");
                break;//ilk seferde dogru girerse donguyu kirdik ve cikis yapti
            }else{
                System.out.println("Yanlis giris yaptiniz...");
                girisHakki--;
                System.out.println("Kalan giris hakkiniz: "+girisHakki);
            }if(girisHakki==0){
                System.out.println("giris hakkiniz kalmadi,sim kartiniz bloke oldu");
                break;
            }

        }
    }
}
