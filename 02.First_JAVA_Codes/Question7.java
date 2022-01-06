// Question 7 :- To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate fibonacci Series");
        int num = sc.nextInt();
        int num1 =1, num2 = 1, next;
        for(int i =1; i<=num;++i){
            System.out.print(num1+", ");
             next = num1+num2;
             num1 = num2;
             num2 = next; 
        }

    }
}
