package grupSorulari;

import java.util.Arrays;

public class Soru30 {
    public static void main(String[] args) {
         /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */
        String str = "Javacilar cook afilli";
        int count = 1;
        String strIstenen = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                    count++;
                }
            }
            if (!strIstenen.contains(str.substring(i, i + 1))) {
                strIstenen += str.substring(i, i + 1) + "=" + count + ",";
                count = 1;
            }else{
                count=1;
            }
        }
        String ıstenenArray[] = strIstenen.split(",");
        System.out.println(Arrays.toString(ıstenenArray));
    }
}
