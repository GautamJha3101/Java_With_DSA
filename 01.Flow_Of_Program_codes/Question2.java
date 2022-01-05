// Question 2:- Take two numbers and print the sum of both.
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.println("The Sum is "+sum);
    }
}
