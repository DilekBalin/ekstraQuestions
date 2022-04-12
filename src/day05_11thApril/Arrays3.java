package day05_11thApril;

public class Arrays3 {
    public static void main(String[] args) {
//bir sinifa ait ders notlari verilmistir
        //sinifin basarili ogrencilerinin not ortalamasini bulunuz
        //50 ve daha yukari not alan ogrenciler basarili sayilmistir

        int not[] = new int[]{75, 50, 85, 45, 40, 60, 49, 100, 95, 98};
        int toplam = 0;
        int basariliSayisi=0;

       for (int i=0;i<not.length;i++){
           if(not[i]>=50){
               basariliSayisi++;
               toplam+=not[i];

           }
       }
        System.out.println("basarili ogrenci sayisi= "+basariliSayisi);
        System.out.println("basarili ogrenci not toplami= "+toplam);

        double average=1.0*toplam/basariliSayisi;
        System.out.println(average);
    }
}
