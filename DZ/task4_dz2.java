// 4) К калькулятору из предыдущего ДЗ добавить логирование.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class task4_dz2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task4_dz2.class.getName());
        FileHandler fh = new FileHandler(".vscode\\DZ\\logTask4.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Сalculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numb_a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int numb_b = sc.nextInt();
        System.out.println("Введите операцию + - / *: ");
        char operation;

        operation = sc.next().charAt(0);
        int res;
        switch (operation) {
            case '+':
                res = numb_a + numb_b;
                System.out.printf("Результат: %d", res);
                break;
            case '-':
                res = numb_a - numb_b;
                System.out.printf("Результат: %d", res);
                break;
            case '/':
                res = numb_a / numb_b;
                System.out.printf("Результат: %d", res);
                break;
            case '*':
                res = numb_a * numb_b;
                System.out.printf("Результат: %d", res);
                break;

        }
        sc.close();
    }
}
