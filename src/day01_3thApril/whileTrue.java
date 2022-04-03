package day01_3thApril;

import java.util.Scanner;

public class whileTrue {
    public static void main(String[] args) {


        while (true) { //sartimiz true olana kadar while surekli calisir
            Scanner scanner = new Scanner(System.in);
            System.out.println("karakter giriniz");
            String s = scanner.nextLine();

            if (s.equals("h")) {
                System.out.println("programdan cikiliyor");
                break;//burda sinir koyduk ve kullanici h girince program duracak

            }
            System.out.println("karakter= " + s);
        }
}}