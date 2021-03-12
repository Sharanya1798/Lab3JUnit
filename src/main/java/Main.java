import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void sqrtFunction(double number)
    {
        System.out.println("Square root of given number is "+Math.sqrt(number));
    }
    public static void factorialFunction(double number)
    {
        int fact = 1, i;
        for(i=1; i<=number; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of given number is "+fact);
    }
    public static void naturalLogFunction(double number)
    {
        System.out.println("Natural logarithm of the given number is "+Math.log(number));
    }
    public static void powerFunction(double number, double power)
    {
        System.out.println("The result obtained is "+Math.pow(number, power));
    }
    public static void main(String[] args) {
        System.out.println("What you want to test\nPress 1 for Square Root\nPress 2 for Factorial function\nPress 3 for Natural logarithm(ln(x))\nPress 4 for Power function\n");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice < 1 || choice > 4)
        {
            System.out.println("Invalid choice maid");
            return;
        }
        System.out.println("Enter any number");
        double number = scanner.nextDouble();
        switch (choice) {
            case 1:
                sqrtFunction(number);
                break;
            case 2:
                factorialFunction(number);
                break;
            case 3:
                naturalLogFunction(number);
                break;
            case 4:
                System.out.println("Enter the power");
                double power = scanner.nextDouble();
                powerFunction(number, power);
                break;
            default: System.out.println("Invalid choice made");
        }
    }
}
