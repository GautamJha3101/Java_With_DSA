// Question 1 :- Area Of Circle Java Program
import java.util.Scanner;
public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius,pi = 3.14f,ans;
        System.out.println("Enter the radius of Circle in cm.");
        radius = sc.nextFloat();
        ans = pi*radius*radius;
        System.out.println("The area of circle is "+ans+" cm.");
    }
}