package calcui;

import java.util.Scanner;

public class Calculator {

    //Choose operator
    //TODO fix error inputs
    public int getChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice:");
        return input.nextInt();
    }

    //Get first choice of number
    //TODO cancel choice somehow
    public double getNum1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number (x) :");
        return input.nextDouble();
    }

    //Get second choice of number
    public double getNum2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the second number (y) :");
        return input.nextDouble();
    }

    //Product of first and second number based on choice.
    public double calculate(double num1, double num2, int choice) {
        if (choice == 1) {
            return (num1 + num2);
        }
        else if (choice == 2){
            return (num1 - num2);
        }
        else if (choice == 3){
            return (num1 * num2);
        }
        else if (choice == 4){
            return (num1 / num2);
        }
        else{
            throw new IllegalArgumentException("Something went wrong.");
        }
    }
}

