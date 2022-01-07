// Question 5 :- Area Of Parallelogram
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b,h,ans;
        System.out.println("Enter Base of parallelogram");
        b = sc.nextInt();
        System.out.println("Enter Height of Parallelogram");
        h = sc.nextInt();

        ans = b*h;

        System.out.println("The area of Parellogram is "+ans);
    }
}