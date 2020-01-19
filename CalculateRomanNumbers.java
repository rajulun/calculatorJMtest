public class CalculateRomanNumbers extends Calculator {

    public static void calculateRomanNum(int a, String operator, int b) {
        int c;
        if (operator.equals("+")) {
            c = plus(a, b);
            ConvertRomanNumbers.arabToRoman(c);
        } else if (operator.equals("-")) {
            c = subtract(a, b);
            ConvertRomanNumbers.arabToRoman(c);
        } else if (operator.equals("*")) {
            c = multiply(a, b);
            ConvertRomanNumbers.arabToRoman(c);
        } else if (operator.equals("/")) {
            try {
                c = divide(a, b);
                ConvertRomanNumbers.arabToRoman(c);
            } catch (ArithmeticException e) {
                System.out.println("На ноль делить нельзя");
            }

        }
    }


}