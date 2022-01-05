// Question1 :- Input a year and find wether it is leap year or not
import java.util.Scanner;

public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter a Year");
        year = sc.nextInt();
        if((year% 4 == 0) && (year %100 !=0) || (year%400 == 0) ){
            System.out.println("Yes Year "+year+" is leap Year.");
        }
        else{
            System.out.println("Not year "+year+" is not leap year");
        }
        sc.close();
    }
    
}