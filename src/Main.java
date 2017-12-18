import calcui.Calculator;
import calcui.UI;

public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        UI ui = new UI();
        int inputchoice = calc.getChoice();
        System.out.println(inputchoice);
        double num1 = calc.getNum1();
        double num2 = calc.getNum2();
        System.out.println(num1 + " " + num2);
        char operator = ui.returnChoice(inputchoice);
        double answer = calc.calculate(num1, num2, inputchoice);

        //Print final result
        System.out.println(num1 + " " + operator + " " + num2 + " is " + answer);
    }
}
