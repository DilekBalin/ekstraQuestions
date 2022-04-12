package day05_11thApril;

public class Array2 {
    public static void main(String[] args) {
/*
bir sinifa ait ders notlari veriliyor
bu notlarin toplamini ve ortalamasini bulunuz

 */
        int numbers []= new int []{40,55,63,85,75,100,100,90,85};
        int sum=0;


for (int i=0; i<numbers.length;i++){
    sum+=numbers[i];

}
        System.out.println("toplam = "+sum);

double average=sum*1.0/numbers.length;;
        System.out.println("ortalama = "+average);

    }
}
