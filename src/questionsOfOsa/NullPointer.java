package questionsOfOsa;

public class NullPointer {
    public static void main(String[] args) {
        int x= 0;  //0 bir degerdir
        String s=null;   //null bir deger degildir sadece s'ye bir deger atanmadiginin isaretcisidir
        System.out.println(s);  //null

        //  if (x==s) System.out.println("Success");     >>>hata verir cunku x'e  bi deger atanmis s'e atanmamis
        // else System.out.println("Failure");


         /* int sayi=null;
         boolean bl=nul;
         primitive data turleri icin null pointer kullanilamaz
         */
         Integer sayi=null;  //Wrapper claslarda null kullanilabilir cunku non-primitive dir
         Boolean bl =null;

        String str1;
        String str2=new String();
        String str3="";   //hiclik de bir degerdir
        String str4=null;   //str4 'un bir referansi var ama ne pointr var ne de obje var

        //bir stringe deger atayabiliriz
        //bu dort variable atama acisindan aynidir
        //hepsine yeni deger atanabilir ve kullanilabilir

        str1="java";
        System.out.println(str1); //java
        System.out.println("Java "+str4); //Java null    //str 4'un null olarak atandigini bize bildirdi
        System.out.println(str4.length()); //.NullPointerException


    }
}
