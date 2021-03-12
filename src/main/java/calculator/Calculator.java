package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice:\n1. Factorial\n2. Square root\n3. Logarithm\n4. Power\n5. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                System.out.println("Result: " + factorial(num) + "\n");
            } else if (choice == 2) {
                System.out.println("Enter a number");
                int num = sc.nextInt();
                System.out.println("Result: " + sqroot(num) + "\n");
            } else if (choice == 3) {
                System.out.println("Enter a number");
                int num = sc.nextInt();
                System.out.println("Result: " + nlog(num) + "\n");
            } else if (choice == 4) {
                System.out.println("Enter the number and exponent");
                int num = sc.nextInt();
                int p = sc.nextInt();
                System.out.println("Result: " + power(num, p) + "\n");
            } else if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            } else System.out.println("Invalid input");
        }
    }

    public static double factorial(int num){
        if(num < 1){
            logger.info("Factorial of negative number is not possible!");
            return Double.NaN;
        }
        else{
            double fact = 1;
            for(int i = 1; i <= num; i++){
                fact *= i;
            }
            logger.info("Factorial of the number : " + num + "\n Result is : " + fact);
            return fact;
        }

    }

    public static double sqroot(int num){
        logger.info("Calculating Square Root of : " + num + "\n Result : " + Math.sqrt(num));
        return Math.sqrt(num);
    }

    public static double nlog(int num){
        logger.info("Calculating Natural Logarithm of : " + num + "\n Result : " + Math.log(num));
        return Math.log(num);
    }

    public static double power(int num, int power){
        logger.info("Power : " + num + "^" + power + "/n Result : " + Math.pow(num, power));
        return Math.pow(num,power);
    }
}
