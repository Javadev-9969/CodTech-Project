import java.util.Scanner;

public class BasicCalculator {

    public static double add(double n, double m){
        return n+m;
    }
    public static double subtract(double n, double m){
        return n-m;
    }
    public static double multiply(double n, double m){
        return n*m;
    }
    public static double division(double n, double m){
        return n/m;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("Choose Operation you want to perform:");
            System.out.println("+. Addition");
            System.out.println("-. Subtraction");
            System.out.println("*. Multiplication");
            System.out.println("/. Division");
            System.out.println("X. Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.next();

            if (choice == "x") {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case "+":
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case "-":
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case "*":
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("Result: " + division(num1, num2));
                    } else {
                        System.out.println("Cannot divide by zero. Please enter a non-zero second number.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

}



