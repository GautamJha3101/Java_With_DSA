// Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter First Number");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("First Number is greater.");
        }else if (num2 > num1){
            System.out.println("Second Number is greater.");
        }else{
            System.out.println("Both numbers are equal");
        }
    }
}
