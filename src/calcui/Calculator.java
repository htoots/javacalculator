package calcui;

import java.util.Scanner;

public class Calculator {

    //Choose operator
    public int getChoice() {
        UI ui = new UI();
        int b;
        Scanner input = new Scanner(System.in);
        ui.printChoices();
        System.out.println("Input your choice:");
        //Check if input is correct.
        while (true) try {
            String a = input.nextLine();
            b = Integer.parseInt(a);
            //Self explanatory
            if (b == 0) {
                ui.printChoices();
            } else if (b > 0 && b < 6) {
                break;
            } else {
                System.out.println("Number has to be between 0 and 5.");
            }
        }
        //If above throws a numberformatexception, then we catch it and tell the user to enter an int.
        catch (NumberFormatException e) {
            System.out.println("Enter an integer.");
        }
        return b;
    }

    //Get first choice of number
    //TODO maybe think of a way to cancel the next 2
    public double getNum1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number (x) :");
        double b;
        while (true) try {
            String a = input.nextLine();
            b = Double.parseDouble(a);
            break;
        } catch (NumberFormatException e) {
            System.out.println("Input a correct number.");
        }
        return b;
    }

    //Get second choice of number
    public double getNum2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the second number (y) :");
        double b;
        while (true) try {
            String a = input.nextLine();
            b = Double.parseDouble(a);
            break;
        } catch (NumberFormatException e) {
            System.out.println("Input a correct number.");
        }
        return b;
    }

    //Product of first and second number based on choice.
    public double calculate(double num1, double num2, int choice) {
        if (choice == 1) {
            return (num1 + num2);
        } else if (choice == 2) {
            return (num1 - num2);
        } else if (choice == 3) {
            return (num1 * num2);
        } else if (choice == 4) {
            return (num1 / num2);
        } else if (choice == 5) {
            return Math.pow(num1, num2);
        } else {
            throw new IllegalArgumentException("Error #2.");
        }
    }
}

