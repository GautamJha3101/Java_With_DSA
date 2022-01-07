// Question 2 :- Area of  Triangle
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,b,ans;
        System.out.println("Enter the Height of triangle");
        h = sc.nextInt();
        System.out.println("Enter the Base of Triangle ");
        b = sc.nextInt();
        
        ans = (b*h)/2;
        System.out.println("The area of triangle is "+ans);
    }
}