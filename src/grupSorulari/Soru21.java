package grupSorulari;

import java.util.Scanner;

public class Soru21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String text = input.nextLine();
        int sayac = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b') {
                sayac++;
            }
        }
        System.out.println(sayac);

    }
}