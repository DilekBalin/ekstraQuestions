package day03_06thApril;

import java.util.Arrays;

public class Array {

    //birden fazla ayni data tipine sahip deegrlerimizi saklamak icin array olustururuz

    public static void main(String[] args) {
         int arr1 [] = {10,20,30,40,50};  //int bir array olusturduk
        int arr2 []=new int[5];   //icinde deger omayan ancak 5 element alabilecek bir int array olusturduk


        for (int i=0; i<arr1.length;i++){
            System.out.println("Eleman : "+ arr1[i]);

        }

        arr2[0]= 1;  //arr 0.indexine 1 ekledik
        arr2[1] = 2; //arr 1.indexine 2 ekledik
        arr2 [2]=3;
        arr2[3] =4;
        arr2[4] =5;
        System.out.println("Array 2'nin birinci elemani : "+arr2[0]);  //1
        System.out.println("Array 2'nin ikinci elemani : "+arr2[1]);  //2
        System.out.println("Array 2'nin ucuncu elemani : "+arr2[2]);  //3






    }
}
