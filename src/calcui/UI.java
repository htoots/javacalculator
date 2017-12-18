package calcui;

public class UI {

    //Print a welcome screen
    public void turnOn() {
        System.out.println("You are using Calco by Hannes Toots.");
    }

    //Print choices
    public void printChoices(){

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
