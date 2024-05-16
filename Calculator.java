import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Receives 2 numbers to perform operations between them.
        System.out.print("First number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();

        // Receives the mathematical operator.
        System.out.println("What's the mathematical operation? (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();

        double result;

        switch(operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero!");
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
