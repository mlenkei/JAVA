// Калькулятор с удалением последнего результата
package For_java_HW;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class task2_dz4_Maslov_LA {

    private static final String TASK_MENU = "Калькулятор: "
            + "\n\t1 - Считаем:"
            + "\n\t0 - Выход";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println(TASK_MENU);
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    task1();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Такого действия не существует!");
                    break;
            }
        }
    }

    public static void task1() {
        int a;
        int b;
        int tac = -1;
        int res = 0;
        String op;
        Scanner scan = new Scanner(System.in);
        a = inputNum("Введите 1е число: ");
        b = inputNum("Введите 2е число: ");
        op = inputStr("\nВведите оператор (+, -, *, /): ");
        Stack<Integer> stack = new Stack<>();
        stack.push(tac);
        stack.push(res);
        if (Objects.equals(op, "+")) {
            res = a + b;
        } else if (Objects.equals(op, "-")) {
            res = a - b;
        } else if (Objects.equals(op, "*")) {
            res = a * b;
        } else if (Objects.equals(op, "/")) {
            res = a / b;
        } else
            System.out.printf("Неверный ввод !");

        System.out.println("ответ:" + res);

        stack.push(res);
        while (true) {
            op = inputStr("\n> Введите оператор (+, -, *, /), " +
                    "\n> Либо ведите \"no\" для удаления последнего результата" +
                    "\n (+, -, *, / или no) ");
            if (Objects.equals(op, "no")) {
                System.out.println("удаленное значение: " + stack.pop());
                res = stack.peek();
                if(res == -1){
                    System.out.println ("Удалять больше нечего! Программа завершает свою работу! До новых встреч!");
                    System.exit (1);
                }
                System.out.println("Текущее значение: " + res);
            } else {
                b = inputNum("Введите число: ");
                if (Objects.equals(op, "+")) {
                    res = res + b;
                } else if (Objects.equals(op, "-")) {
                    res = res - b;
                } else if (Objects.equals(op, "*")) {
                    res = res * b;
                } else if (Objects.equals(op, "/")) {
                    res = res / b;
                } else
                    System.out.printf("Неверный ввод !");
                stack.push(res);
                System.out.println("ответ = " + res);
            }
        }
    }

    public static int inputNum(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        int num = scan.nextInt();
        return num;
    }

    public static String inputStr(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        String str = scan.nextLine();
        return str;
    }

}
