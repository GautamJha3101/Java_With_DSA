// Question 3 :- Take a number as input and print the multiplication table for it.
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its table");
        int number = sc.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(number+" * "+i+" = "+number*i);
        }
    }
}
