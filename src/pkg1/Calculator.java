import java.util.Scanner;
public class Calculator {
    public void calculator() {
        char operator;
        double number1, number2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the operator: +, -, *, /");
        operator = input.next().charAt(0);
        System.out.println("Enter first number");
        number1 = input.nextDouble();
        System.out.println("Enter second number");
        number2 = input.nextDouble();
        switch (operator) {
            case '+' -> {
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
            }
            case '-' -> {
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
            }
            case '*' -> {
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
            }
            case '/' -> {
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            }
            default -> System.out.println("Invalid operator!");
        }
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.calculator();
    }


}
