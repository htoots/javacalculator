import calcui.Calculator;

public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int choice = calc.getChoice();
        double num1 = calc.getNum1();
        double num2 = calc.getNum2();
        double answer = calc.calculate(num1, num2, choice);
        System.out.println(num1 + " + " + num2 + " is " + answer);
    }
}
