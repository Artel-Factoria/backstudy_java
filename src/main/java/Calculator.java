import java.util.Scanner;
public class Calculator {
    public static void main(String arg[]) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Number 1");
        double number1 = myObj.nextDouble();

        for (String Action= ""; Action != "=";) {
            //Представление переменных

            System.out.println("Action");
            String action = myObj.next();

            System.out.println("Number 2");
            double number2 = myObj.nextDouble();


            switch (action) {
                case "-":
                    number1 = number1 - number2;
                    System.out.println(number1);
                    break;

                case "+":
                    number1 = number1 + number2;
                    System.out.println(number1);
                    break;

                case "*":
                    number1 = number1 * number2;
                    System.out.println(number1);
                    break;

                case "/":
                    number1 = number1 / number2;
                    System.out.println(number1);
                    break;

                case "=":
                    System.out.println(number1);
                    Scanner close;

                break;
                default:
                    System.out.println("Something went wrong");
                    break;

            }
        }
    }
}

