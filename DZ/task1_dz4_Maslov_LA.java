package DZ;

// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка.
// Одно или два числа могут быть отрицательными.

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class task1_dz4_Maslov_LA_2 {

    static int makeInt(Deque<String> arr) {
        int result = 0; 
        String temporary;
        int krat = 1;

        while (arr.size() != 0) {
            temporary = arr.pollFirst();
            if (!temporary.equals("-")) {
                result = result + krat * (Integer.parseInt(temporary));
                krat *= 10;
            } else {
                result *= -1;
            }
        }
        return result;
    }

    static Queue<String> Pack(int queue_behavior) {
        Deque<String> rework = new LinkedList<>();
        int temp = 0;
        boolean minus = false;
        if (queue_behavior < 0) {
            queue_behavior *= -1;
            minus = true;
        }
        while (queue_behavior > 0) {
            temp = queue_behavior % 10;
            queue_behavior = (queue_behavior - temp) / 10;
            rework.addFirst(Integer.toString(temp));
        }
        if (minus) {
            rework.addFirst("-");
        }
        return rework;
    }

    public static void main(String[] args) {

        Deque<String> Deque_1 = new LinkedList<>(Arrays.asList("5", "4", "3", "-"));
        Deque<String> Deque_2 = new LinkedList<>(Arrays.asList("3", "2", "1"));
        Deque<String> Deque_3 = new LinkedList<>(Arrays.asList("5", "4", "-"));
        Deque<String> Deque_4 = new LinkedList<>(Arrays.asList("6", "5", "4"));


        System.out.println("Начальные данные : ");
        System.out.println("Первая пара: " + Deque_1 + ", " + Deque_2);
        System.out.println("Вторая пара: " + Deque_3 + ", " + Deque_4);
        System.out.println();

        // Преобразуем очереди в числа типа int и перемножаем числа:

        // Первая пара чисел
        int first = makeInt(Deque_1);
        int second = makeInt(Deque_2);
        int composition_1 = first * second;
        System.out.printf("%d * %d = %d\n", first, second, composition_1);
        int sum_1 = first + second;
        System.out.printf("%d + %d = %d\n", first, second, sum_1);
        // Вторая пара чисел
        int three = makeInt(Deque_3);
        int four = makeInt(Deque_4);
        int composition_2 = first * second;
        System.out.printf("%d * %d = %d\n", three, four, composition_2);
        int sum_2 = three + four;
        System.out.printf("%d + %d = %d\n", three, four, sum_2);

        // Запаковываем результаты в списки:
        System.out.println();
        System.out.println("Результирующие коллекции: ");
        System.out.println(Pack(composition_1));
        System.out.println(Pack(sum_1));
        System.out.println(Pack(composition_2));
        System.out.println(Pack(sum_2));
    }

}
