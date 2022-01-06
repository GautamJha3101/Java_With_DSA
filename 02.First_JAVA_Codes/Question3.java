// Question 3 :- Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,t;
        float r,si;
        System.out.println("Enter principle Amount");
        p = sc.nextInt();
        System.out.println("Enter Rate");
        r = sc.nextFloat();
        System.out.println("Enter time period in year");
        t = sc.nextInt();

        si = (p*r*t)/100;

        System.out.println("The simple Interest is "+si);
    }
}
