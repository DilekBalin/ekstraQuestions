package grupSorulari;

import java.util.Scanner;

public class Soru22 {
    /*
       Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle .
       Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın
      Örnek:      "abc", "cat" --> "abcat"
                  "abc", "dog"  -->"abcdog"
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk kelimeyi giriniz");
        String ilkKelime=scan.next();
        System.out.println("ikinci kelimeyi giriniz");
        String ikinciKelime=scan.next();
        if(ilkKelime.substring(ilkKelime.length()-1).equals(ikinciKelime.substring(0,1))){
            System.out.println(ilkKelime.replace(ilkKelime.substring(ilkKelime.length() - 1), "") + ikinciKelime);
        } else {
            System.out.println(ilkKelime + ikinciKelime);
        }

    }

}
