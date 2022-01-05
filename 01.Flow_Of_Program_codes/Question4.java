// Question 4 :- Take 2 numbers as inputs and find their HCF and LCM.
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,gcd,LCM;
        System.out.println("Enter First Number");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();

        gcd = a;

        while(true){
            if((a%gcd ==0) && (b%gcd ==0))
            break;
            else
            gcd--;
        }

        LCM = (a*b)/gcd;
        System.out.println();
        System.out.println("HCF of Given Numbers is "+gcd);
        System.out.println("LCM of Given Number is "+LCM);
    }
}
