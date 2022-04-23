package InterwievQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MySolution01 {
    public static void main(String[] args) {
         /*
        Kullanicidan bir String aliniz
        String'te var olan her karakterin sayisini ekrana yazdiriniz
        Ornek:
       alacan>>>> a=3, l=1, c=1, n=1
       abaa===>  a=3,  b=1
   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str = scan.nextLine();

        String arr[] = str.split("");
        Map<String, Integer> kelimeMap = new HashMap<>();
        for (String w : arr) {
            if (kelimeMap.containsKey(w))
                kelimeMap.put(w, kelimeMap.get(w) + 1);
            else kelimeMap.put(w, 1);
            {

            }

        }

        System.out.println(kelimeMap);

    }
}