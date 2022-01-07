// Question 3 :- Area Of Rectangle Program
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b,w;
        System.out.println("Enter width of Rectangle");
        w = sc.nextInt();
        System.out.println("Enter bredth of Rectangle");
        b = sc.nextInt();

        int ans = w*b;
        System.out.println("The area of rectangle is "+ans);
    }
}
