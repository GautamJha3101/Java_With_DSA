// Question 4 :- Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,ans;
        char operator;
        System.out.println("Enter First Number");
        num1 = sc.nextInt();
        System.out.println("Enter Operator");
        operator = sc.next().charAt(0);
        System.out.println("Enter second number");
        num2 = sc.nextInt();

        if(operator == '+'){
            ans = num1+num2;
        }else if (operator == '-'){
            ans = num1-num2;
        }else if (operator == '*'){
            ans = num1*num2;
        }else if (operator == '/'){
            ans = num1/num2;
        }else{
            System.out.println("Wrong operator entered");
            return;
        }

        System.out.println("Answer is "+ans);
    }
}
