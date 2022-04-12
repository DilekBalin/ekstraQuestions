package grupSorulari;

public class Soru14 {
    //Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
// ve girilen sayinin faktoryel'ini bulun. (5!=5*4*3*2*1)

    public static void main(String[] args) {
        int input = 9;
        int faktoriyel = 1;
        String faktoriyelAcikYazim = "";

        for (int i = input; i >= 1; i--) {

            faktoriyel *= i;

            if (i == input) {
                faktoriyelAcikYazim = faktoriyelAcikYazim + i;
            } else
                faktoriyelAcikYazim = faktoriyelAcikYazim + "*" + i;
        }

        System.out.println(input + "! = " + faktoriyelAcikYazim + " =" + faktoriyel);


    }
}