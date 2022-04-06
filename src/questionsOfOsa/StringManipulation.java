package questionsOfOsa;

public class StringManipulation {

    public static void main(String[] args) {
        String str1="Java";
        String str2=new String ("java");  //new ile baslayan her sey yeni nbir referans alir
        str1.toLowerCase();   //sonuc degismedi cunku atama yapmadik


        if (str1.equals(str2)){  //str1==str2 stringte kullanmmayi tercih ederiz cunku hem referansa hem de deegre baakr
            //dolayisiyla yeni bir obje olusturuldugu icin farkli referans olur
            //equals ise icerigine bakar
            System.out.println("Equal");

        }else{
            System.out.println("Not equal");
        }



    }
    }
