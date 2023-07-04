// Реализовать алгоритм сортировки слиянием

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;
import java.util.ArrayList;
import java.util.Arrays;

public class task3_3dz_dop_Maslov_LA {

    public static void quickSort(int[] arrayLeonid, int low, int high) {

        // Если массив пуст или уже нечего делить, то закончить
        if (arrayLeonid.length == 0 || low >= high) {
            return;
        }

        // выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = arrayLeonid[middle];

        // разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (arrayLeonid[i] < border) {
                i++;
            }
            while (arrayLeonid[j] > border) {
                j--;
            }
            if (i <= j) {
                int swap = arrayLeonid[i];
                arrayLeonid[i] = arrayLeonid[j];
                arrayLeonid[j] = swap;
                i++;
                j--;
            }
        }

        // рекурсия для сортировки левой и правой части
        if (low < j) {
            quickSort(arrayLeonid, low, j);
        }
        if (high > i) {
            quickSort(arrayLeonid, i, high);
        }
    }

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task3_3dz_dop_Maslov_LA.class.getName());
        FileHandler fh = new FileHandler(".vscode\\DZ\\logTask6.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> arrayName = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = 25 - ran.nextInt(N);
                arrayName.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + arrayName);
            int[] arr = arrayName.stream().mapToInt(i -> i).toArray();

            int low = 0;
            int high = arr.length - 1;

            quickSort(arr, low, high);
            System.out.println("Стало после реализации алгоритма сортировки слиянием: ");
            System.out.println(Arrays.toString(arr));
        }
    }
}
