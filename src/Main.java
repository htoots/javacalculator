import calcui.Calculator;
import calcui.UI;

public class Main {
    public static void main(String[] args){
        //Objects
        Calculator calc = new Calculator();
        UI ui = new UI();

        ui.turnOn();                                                //Welcome screen
        int inputchoice = calc.getChoice();                         //Get choice of operation
        //System.out.println(inputchoice);                          Debug code
        double num1 = calc.getNum1();                               //Get num1(x)
        double num2 = calc.getNum2();                               //Get num2(y)
        //System.out.println(num1 + " " + num2);                    Debug code
        char operator = ui.returnChoice(inputchoice);               //Get char for printAnswer
        double answer = calc.calculate(num1, num2, inputchoice);    //Get answer

        //Print final result
        ui.printAnswer(num1, num2, answer, operator);
    }
}
