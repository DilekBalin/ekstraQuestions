package InterwievQuestions;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
        Ask user enter a positive number and check if it is prime or not
        kullanicidan bir pozitif sayi girmesini isteyip asal olup olmadigini kontrol edin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir pozitif sayi giriniz");
        int sayi=scan.nextInt();

        boolean asalMi=true;
        for(int i =2;i<sayi;i++){
            if(sayi%i==0){
                asalMi=false;
                break;
            }
        }

   if(asalMi) System.out.println("sayi asaldir");
   else System.out.println("sayi asal degildir");
    }
}
