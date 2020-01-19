import java.util.Arrays;
import java.util.List;

public class ValidateInput {


    public static void validate(String a, String operator, String b) {
        int numA, numB, c;
        String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        List<String> list = Arrays.asList(romanNumbers);
        Calculator arabCalc = new Calculator();
//        CalculateRomanNumbers RomanCal = new CalculateRomanNumbers();

        try {


            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                if (list.contains(a.toUpperCase()) && list.contains(b.toUpperCase())) {
                    ConvertRomanNumbers.romanToArab(a.toUpperCase(), operator, b.toUpperCase());
                } else if (Integer.parseInt(a) >= 0 && Integer.parseInt(a) <= 10 && Integer.parseInt(b) >= 0 && Integer.parseInt(b) <= 10) {
                    numA = Integer.parseInt(a);
                    numB = Integer.parseInt(b);

                    if (operator.equals("+")) {
                        c = arabCalc.plus(numA, numB);
                        System.out.println(c);
                    } else if (operator.equals("-")) {
                        c = arabCalc.subtract(numA, numB);
                        System.out.println(c);
                    } else if (operator.equals("*")) {
                        c = arabCalc.multiply(numA, numB);
                        System.out.println(c);
                    } else if (operator.equals("/")) {
                        try {
                            c = arabCalc.divide(numA, numB);
                            System.out.println(c);
                        } catch (ArithmeticException e) {
                            System.out.println("На ноль делить нельзя");
                        }
                    }


                } else
                    System.out.println("Числа не должны быть больше 10, операторы только +, -, *, /. Введите данные корректно. Например, 2 + 4 или II + IX");
            }
        } catch (Exception e) {
            System.out.println("I/O exception");
        }
    }
}