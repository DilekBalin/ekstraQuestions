package grupSorulari;

public class Soru36 {
    public static void main(String[] args) {
          /* Interview Question
        Write a Java program to reverse a string.
        Use for loop and create a method called
        reverseString */
        String str="Hello World";
        reverseString(str);
    }
    private static void reverseString(String str) {
        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
