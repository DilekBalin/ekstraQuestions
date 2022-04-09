package day04_09thApril;

public class IfElse2<ayse> {
    public static void main(String[] args) {
        int ali=17;
        int ayse=12;


        if(ali>ayse){
            System.out.println("Ali ,Ayse'nin abisidir");
        } else if (ayse>ali){
            System.out.println("Ayse,Ali'nin ablasidir");
        }else System.out.println("Ali ile Ayse ikiz kardestir");



        int ahmet=17;
        int aysegul=21;
        int hasan=20;



        if(ahmet>aysegul){ //Ahmet'in aysegulden buyuk oldugunu varsaydik
            if(ahmet>hasan){
                System.out.println("Ahmet en buyuktur");
            }else{
                System.out.println("Hasan en buyuktur");
            }
        }else{
            if(aysegul>hasan){
                System.out.println("Aysegul en buyuktur");
            } else{
                System.out.println("Hasan en buyuktur");
            }


            //2.yol:
            if(ahmet>aysegul&& ahmet>hasan) System.out.println("Ahemt en buyuktur");
            if(aysegul>ahmet&& aysegul>hasan) System.out.println("Aysegul en buyuktur");
            if(hasan >ahmet && hasan > aysegul) System.out.println("Hasan en buyuktur");


        }



    }



}
