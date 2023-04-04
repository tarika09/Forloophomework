import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Double number1;
        Double number2;

        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        char operator = scanner.next().charAt(0);
        //charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        //we are using data type double so that user can enter integer as well as floating value
        number1 = scanner.nextDouble();

        System.out.println("Enter second number");
        number2 = scanner.nextDouble();

        scanner.close();
        double output;

        switch (operator)
        {

            // performs addition between numbers
            case '+':
                output = number1 + number2;
                break;

            // performs subtraction between numbers
            case '-':
                output = number1 - number2;
                break;

            // performs multiplication between numbers
            case '*':
               output = number1 * number2;
               break;

            // performs division between numbers
            case '/':
                output = number1 / number2;
                break;

            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println(number1+" "+operator+""+number2+"="+output);


    }
}


