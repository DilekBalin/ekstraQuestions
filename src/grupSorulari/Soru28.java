package grupSorulari;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru28 {
    public static void main(String[] args) {
           /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.
        */
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[6];// boyut belli oldugu icin dogrudan buraya yaziyoruz 6'yi
        for (int i = 0; i < 6; i++) { // kullanicidan istemek bu sekilde oluyor for looplar icin,
            System.out.print("sayi giriniz : "); //sout burada olsun.
            arr[i] = scan.nextInt();
        }
//method
        System.out.println(tekEleman(arr));// methodu yazdirmak icin yapiyoruz.
    }
    private static ArrayList<Integer> tekEleman(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();//bos list icine tek elemanlar atanacak
        // list olmasinin en onemli nedeni boyutu bilmiyoruz. Boyut bilinmeyinca List yapilir!
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                list.add(arr[i]);// add method'u ile bulunan tek sayilar liste dahil olmus olur.
            }
        }
        return list;
    }
}
