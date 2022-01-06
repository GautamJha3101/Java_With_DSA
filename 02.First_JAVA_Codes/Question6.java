// Question 6 :- Input currency in rupees and output in USD.
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double INR,USD;
        System.out.println("Input in INR Indian currency");
        INR = sc.nextDouble();
        USD = 0.013*INR; // Acoording to today dated 06-01-2022 1 INR = 0.013 USD  or we can say 1USD = 74.46 INR
        System.out.println("Ruppe "+INR+" in Dollar = "+USD);

    }  
}
