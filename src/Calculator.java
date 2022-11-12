public class Calculator {
    public static void calc(String[] operators, String [] operands) {
        if (!Checker.checkOpertor(operators)) {
            throw new ArithmeticException("Можно использовать только знаки +,-,*,/");
        } else {
            if (!Checker.checkInt(operands)) {
                throw new ArithmeticException("число не должно быть больше 10 или меньше 1");
            } else {
                int result = Integer.parseInt(operands[0]);
                for (int i = 1; i < operands.length; i++) {
                    if (operators[i].equals("+"))
                        result += Integer.parseInt(operands[i]);
                    else if (operators[i].equals("-"))
                        result -= Integer.parseInt(operands[i]);
                    else if (operators[i].equals("*"))
                        result *= Integer.parseInt(operands[i]);
                    else if (operators[i].equals("/"))
                        result /= Integer.parseInt(operands[i]);
                }
                System.out.println(result);
            }
        }
    }
}
