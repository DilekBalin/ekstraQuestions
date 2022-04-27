package UcusProjesi;

import java.util.Scanner;

public class JavaAirlines {
    public static void main(String[] args) {

        Yolcu ayhan =new Yolcu("B","tek yon",33);//Yolcu class'indan ayhan adinda bir obje olusturduk
        Scanner scan = new Scanner(System.in);
        System.out.print("Java AirLines'a hos geldiniz \n B C D rotalarindan birini seciniz:");
        String city = scan.next().toUpperCase();
        System.out.print("Ucusunuz icin \n tek yon --> 1 \n cift yon --> 2 giriniz :");
        int flyType = scan.nextInt();
        System.out.print("Lutfen yasinizi giriniz:");
        int age = scan.nextInt();
        double priceC = 0.10 * 700;
        double priceB = 0.10 * 500;
        double priceD = 0.10 * 900;

        if (city.equals("B") || (city.equals("C")) || (city.equals("D"))) {
            if (age > 65) {  //ana sart 65
                if (city.equals("B")) { //b sehrini secerse
                    if (flyType == 1) { //tek yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + priceB * 0.70 + " $");

                    } else if (flyType == 2) { //cift yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + (priceB * 0.70*0.80)*2 + " $");//0.7 yas indirimi , 0.80 cift yon indirimi,*2 ise hem gidis hem de donus oldugu icin

                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (city.equals("C")) {
                    if (flyType == 1) { //tek yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + priceC * 0.70 + " $");

                    } else if (flyType == 2) { //cift yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + (priceC * 0.70*0.80)*2 + " $");//0.7 yas indirimi , 0.80 cift yon indirimi,*2 ise hem gidis hem de donus oldugu icin

                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (city.equals("D")) {
                    if (flyType == 1) { //tek yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + priceD * 0.70 + " $");

                    } else if (flyType == 2) { //cift yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + (priceD * 0.70*0.80)*2 + " $");//0.7 yas indirimi , 0.80 cift yon indirimi,*2 ise hem gidis hem de donus oldugu icin

                    } else System.out.println("Hatali giris yaptiniz");
                }


            } else if(age>=12 && age<=24) {
                if (city.equals("B")) { //b sehrini secerse
                    if (flyType == 1) { //tek yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + priceB * 0.9+ " $");

                    } else if (flyType == 2) { //cift yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + (priceB * 0.9*0.80)*2 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (city.equals("C")) {
                    if (flyType == 1) { //tek yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + priceC * 0.9+ " $");

                    } else if (flyType == 2) { //cift yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + (priceC * 0.9*0.80)*2 + " $");

                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (city.equals("D")) {
                    if (flyType == 1) { //tek yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + priceD * 0.9 + " $");

                    } else if (flyType == 2) { //cift yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + (priceD * 0.9*0.80)*2 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }


            }else if(age<=12){
                if (city.equals("B")) { //b sehrini secerse
                    if (flyType == 1) { //tek yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + priceB * 0.5 + " $");

                    } else if (flyType == 2) { //cift yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + (priceB * 0.5*0.80)*2 + " $");

                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (city.equals("C")) {
                    if (flyType == 1) { //tek yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + priceC * 0.5 + " $");

                    } else if (flyType == 2) { //cift yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + (priceC * 0.5*0.80)*2 + " $");//0.7 yas indirimi , 0.80 cift yon indirimi,*2 ise hem gidis hem de donus oldugu icin

                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (city.equals("D")) {
                    if (flyType == 1) { //tek yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + priceD * 0.5 + " $");

                    } else if (flyType == 2) { //cift yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + (priceD * 0.5*0.80)*2 + " $");//0.7 yas indirimi , 0.80 cift yon indirimi,*2 ise hem gidis hem de donus oldugu icin

                    } else System.out.println("Hatali giris yaptiniz");
                }


            }else if(age>=24 && age<=65) {
                if (city.equals("B")) { //b sehrini secerse
                    if (flyType == 1) { //tek yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + priceB  + " $");

                    } else if (flyType == 2) { //cift yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + (priceB *0.80)*2 + " $");

                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (city.equals("C")) {
                    if (flyType == 1) { //tek yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + priceC + " $");

                    } else if (flyType == 2) { //cift yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + (priceC *0.80)*2 + " $");//0.7 yas indirimi , 0.80 cift yon indirimi,*2 ise hem gidis hem de donus oldugu icin

                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (city.equals("D")) {
                    if (flyType == 1) { //tek yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + priceD  + " $");

                    } else if (flyType == 2) { //cift yon secerse
                        System.out.println("****");
                        System.out.println("Ucus tercihiniz icin bilet odemeniz: " + (priceD *0.80)*2 + " $");//0.7 yas indirimi , 0.80 cift yon indirimi,*2 ise hem gidis hem de donus oldugu icin

                    } else System.out.println("Hatali giris yaptiniz");
                }


            }else System.out.println("yasinizi dogru girin: ");
        }else System.out.println("yanlis veri girdiniz ");

    }}
