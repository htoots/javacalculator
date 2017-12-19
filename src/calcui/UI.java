package calcui;

import java.util.Arrays;

public class UI {

    //Print a welcome screen
    public void turnOn() {
        System.out.println("You are using Calco by Hannes Toots.");
    }

    //Print choices
    public void printChoices() {
        String[] choices = new String[]{"0 - See this list again", "1 - Addition (x + y)", "2 - Subtraction (x - y)",
                "3 - Multiplication (x * y)", "4 - Division (x / y)"};
        for (int i = 0; i < choices.length; i++){
            System.out.println(choices[i]);
        }
    }

    //Print choices for final println
    public char returnChoice(int choice) {
        char[] operators = new char[]{'+', '-', '*', '/'};
        return operators[choice - 1];
    }

    //Print result
    public void printAnswer() {

    }
}
