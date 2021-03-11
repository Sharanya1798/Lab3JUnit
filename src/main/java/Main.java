import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("What you want to test\nPress 1 for Square Root\nPress 2 for IP address\nPress 3 for Multiplication\n");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        //System.out.println("So do that, why bother this code ¯\\_(ツ)_/¯");
        if(choice == 1)
        {
            System.out.println("Enter any number");
            double number = scanner.nextDouble();
            System.out.println("Square root of given number is"+Math.sqrt(number));
        }

    }
}
