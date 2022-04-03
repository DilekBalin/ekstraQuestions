package day01_3thApril;

public class Continue {
    public static void main(String[] args) {


        int i=0;
        while(i<10){
            if(i==4||i==7){
                i++;
                continue;

            }
            System.out.println("a sayisi="+i);
            i++;

            //*a sayisi=0
            //a sayisi=1
            //a sayisi=2
            //a sayisi=3
            //a sayisi=5
            //a sayisi=6
            //a sayisi=8
            //a sayisi=9
        }
    }
}
