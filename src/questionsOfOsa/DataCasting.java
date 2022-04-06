package questionsOfOsa;

public class DataCasting {
    public static void main(String[] args) {
        //primitive ve sayisal data turlerindeki verielri birbirine cevirmeye data casting denir.
        //byte < short < int < long < float < double

        //1.ornek:
byte sayi1=15;
short sayi2=sayi1;   //byte, short'un icine sigar
// sol tarafi bir kap sag tarfi konulacak malzemem olarak dusunebilir

        long sayi3=1500;
        double sayi4=sayi3;

        //kucuk esya buyuk kaba sigar buna automation widening denir

//2.ornek:
        int sayi5= 65;
        //short sayi6= sayi5;   //icine sigmadi
        short sayi6= (short)sayi5;  //sorumlulugu aldik ve buyuk olani kucuge atadik


         sayi5=150;
        byte sayi7=(byte)sayi5;
        System.out.println(sayi7);  //-106
        //byte -128 ile 127 araligindadir 150 bir tur doner 127 debn sonra -128'e gelir ve 23 u cikarir
    }
}
