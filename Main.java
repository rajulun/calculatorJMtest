import java.util.Scanner;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Числа не должны быть больше 10, операторы только +, -, *, /. Введите данные корректно. Например, 2 + 4 или II + IX");
        String a, operator, b;



        a = scanner.next();
        operator = scanner.next();
        b = scanner.next();

        ValidateInput.validate(a, operator, b);



    }

}



