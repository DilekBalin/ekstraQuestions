package questionsOfOsa;

public class PostIncrement {
    public static void main(String[] args) {


        int num1 = 9;
        int num2 = num1++;   //postincrement yani
        //once num2 'ye deger atandi
        //sonra da num1 'in degeri 1 artirilir
        // num2=9;
        //num1=10;

        if (num2 < 10) {

            System.out.println(num2 + " Hello World");
        } else {
            System.out.println(num1 + " Hello Universal");
        }
    }
}
