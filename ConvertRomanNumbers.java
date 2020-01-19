public class ConvertRomanNumbers {



    public static void romanToArab(String romanNumA, String operator, String romanNumB) {
        String[] romanNumbers = {"NULL", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int a = 0, b = 0;
        for (int i = 0; i < romanNumbers.length; i++) {
            if (romanNumA.equals(romanNumbers[i])) {
                a = i;
            }
            if (romanNumB.equals(romanNumbers[i])) {
                b = i;
            }
        }
            CalculateRomanNumbers.calculateRomanNum(a, operator, b);

    }

    public static void arabToRoman(int c) {
        String[] romanNumbers = {"NULL", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] romanNumbersDec = {"NULL", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX","XC", "C"};
        if(c <= 0){
            System.out.println("В римских числах отсутствуют отрицательные числа");
        } else if (c < 10 && c > 0) {
            System.out.println(romanNumbers[c]);
        } else if (c == 10) {
            System.out.println(romanNumbers[(c)]);
        }else if (c > 10 && c % 10 == 0) {
            System.out.println(romanNumbersDec[(c / 10)]);
        } else {
            System.out.println(romanNumbersDec[(c / 10)] + romanNumbers[c % 10]);
        }

    }
}