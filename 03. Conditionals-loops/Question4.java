// Question 4 :- Area Of Isosceles Triangle
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,b,ans;
        System.out.println("Enter base of triangle ");
        b = sc.nextInt();
        System.out.println("Enter height of triangle ");
        h = sc.nextInt();

        ans = (b*h)/2;
        System.out.println("The Area of triangle is "+ans);

    }
}
