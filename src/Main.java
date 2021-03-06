import calcui.Calculator;
import calcui.UI;

public class Main {
    public static void main(String[] args) {
        //Objects
        Calculator calc = new Calculator();
        UI ui = new UI();

        ui.turnOn();                                                    //Welcome screen
        ui.printChoices();                                              //Print available choices

        //Do loop for keeping the program going for as long as the user wants
        do {
            int inputChoice = calc.getChoice();                         //Get choice of operation
            double num1 = calc.getNum1();                               //Get num1(x)
            double num2 = calc.getNum2();                               //Get num2(y)
            char operator = ui.returnChoice(inputChoice);               //Get char for printAnswer
            double answer = calc.calculate(num1, num2, inputChoice);    //Get answer

            ui.printAnswer(num1, num2, answer, operator);               //Print final result

        } while (ui.repeat().isEmpty());                                //While user input is empty
    }
}
