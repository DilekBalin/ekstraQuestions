package day05_11thApril;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] points=new int[5];  //ya uzunluk belirtmeliyiz
        int [] points2=new int[]{1,5,7,8,4}; // ya da elementleri yazmaliyiz

        System.out.println(Arrays.toString(points));  //[0, 0, 0, 0, 0]
        System.out.println("points  = "+points2[2]); //7
        System.out.println(Arrays.toString(points2)); //[1, 5, 7, 8, 4]

        int sum= points2[2]+ points2[4];
        System.out.println("Toplam= "+sum);  //11



    }
}
