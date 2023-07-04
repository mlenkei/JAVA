// Реализуйте алгоритм сортировки пузырьком числового
//  массива, результат после каждой итерации
//  запишите в лог-файл.

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;

public class task2_dz2 {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task2_dz2.class.getName());
        FileHandler fh = new FileHandler(".vscode\\DZ\\logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int[] arrayName = new int[20];
        Random random = new Random();
        for (int i = 0; i< arrayName.length; i ++){
            
            arrayName[i] = 25 - random.nextInt(50);
        }
        transformation.printArrayInt(arrayName);
        int[] newArr = listSort(arrayName);
        System.out.printf("\n Отсортированный массив: \n");
        transformation.printArrayInt(newArr);
    }

    public static int[] listSort(int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {

            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

}
