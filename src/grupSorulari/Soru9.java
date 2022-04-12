package grupSorulari;

import java.util.Scanner;

public class Soru9 {
    /*
Pozitif bir int  num verildiğinde, return edildiği zaman num tamkare ise true veren değilse false veren bir foksiyon yazın.
Not: sqrt gibi fonksiyonları  kullanmayın.
    Example 1:
    Input: 16
    Output: true
    Not: bu sayı tamkare çünkü 4*4 = 16
    Example 2:
    Input: 25
    Output: true
    Note: bu sayı tamkare çünkü 5*5=25
    Example 3:
    Input: 14
    Output: false
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int input = scan.nextInt();

        isPerfectSquare(input);
        System.out.println(isPerfectSquare(input));
    }

    private static boolean isPerfectSquare(int input) {
        boolean sonuc = false;
        for (int i = 1; i * i <= input; i++) {
            if (i * i == input) sonuc = true;

        }
        return sonuc;
    }
}