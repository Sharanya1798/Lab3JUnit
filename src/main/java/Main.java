import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("What you want to test\nPress 1 for Square Root\nPress 2 for Factorial function\nPress 3 for Natural logarithm(ln(x))\n");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        //System.out.println("So do that, why bother this code ¯\\_(ツ)_/¯");
        if(choice == 1)
        {
            System.out.println("Enter any number");
            double number = scanner.nextDouble();
            System.out.println("Square root of given number is "+Math.sqrt(number));
        } else if(choice == 2)
        {
            System.out.println("Enter a number for finding Factorial");
            double number = scanner.nextDouble();
            int fact = 1, i;
            for(i=1; i<=number; i++){
                fact = fact*i;
            }
            System.out.println("Factorial of given number is "+fact);
        } else if(choice == 3)
        {
            System.out.println("Enter a Number");
            double number = scanner.nextDouble();
            System.out.println("Natural logorithm of the given number is "+Math.log(number));
        }
    }
}
