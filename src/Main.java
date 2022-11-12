import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value: ");
        String value = scanner.next();
        String[] operators = value.split("[0-9]+");
        String[] operands = value.split("[+-/*]");

        Calculator.calc(operators, operands);



    }
}