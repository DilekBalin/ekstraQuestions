package questionsOfOsa;

public class Switch {
    public static void main(String[] args) {

     final   char a= 'A', d='D'; //final keywordu bu variable'in son degerinin ne oldugunu soyler ve degistirilemez
        char grade ='B';
        switch (grade){   //grade degeri 'B' ve java yukaridan asagi dogru calisir ve 'B'yi arar
            case a:  //a varibale'nin degeri 'A've bu case caliosmaz
            case 'B':   //aradigimiz ile uyumlu oldugu icin burasi calisir ve ekrana great yazdirir
                System.out.println("great");
            case 'C':
                System.out.println("good");break;   //break gorene kadar calisti ve burda bitti
            case d:
            case 'F':
                System.out.println("not good");
        }
    }
}
