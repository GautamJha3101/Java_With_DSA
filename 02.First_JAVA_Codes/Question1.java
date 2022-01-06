// Question1 :- Write a program to print whether a number is even or odd, also take input.
import java.util.Scanner;
public class Question1{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("The number entered by you is Even ");
        }else{
            System.out.println("The number entered by you is Odd");
        }

    }
}