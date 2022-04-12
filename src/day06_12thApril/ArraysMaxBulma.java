package day06_12thApril;

public class ArraysMaxBulma {
    public static void main(String[] args) {
        /*
        Verilen bir tam sayi dizisinin en buyuk elemanini ve bu elemanin kacinci sirada oldugunu bulunuz

        INPUT:
        {10,13,56,20,40,60,56,32}

        OUTPUT:
        60
        5

         */
        int numbers[] = new int[] {10, 13, 56, 20, 40, 60, 56, 32};//int bir array dizisi olusturduk
       int max=numbers[0];
               int sira=0;;
       for (int i=0;i<numbers.length;i++){
           if(numbers[i]>max){//eger array'in icinde baktigimiz indexteki sayi max'tan buyukse
               max=numbers[i]; //o indexi max'a atadik
               sira=i;
           }

           }

        System.out.println(max);
        System.out.println(sira);
    }


        }




