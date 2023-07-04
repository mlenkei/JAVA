// 1. Дан произвольный список целых чисел,
//  удалить из него чётные числа.

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;

public class task1_3_Maslov_LA {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task1_3_Maslov_LA.class.getName());
        FileHandler fh = new FileHandler(".vscode\\DZ\\logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> arrayLeonid = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = 25 - ran.nextInt(N);
                arrayLeonid.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + arrayLeonid);
            ArrayList<Integer> newArr = listSort(arrayLeonid);
            System.out.printf("\n Удаленные четные  числа: \n");
            System.out.println(newArr);
        }
    }

    public static ArrayList<Integer> listSort(ArrayList<Integer> arrayLeonid) {
        for (int i = arrayLeonid.size() - 1; i >= 0; i--) {
            int even = arrayLeonid.get(i) % 2;
            if (even == 0) {
                System.out.println("Четное число:" + arrayLeonid.get(i));
                arrayLeonid.remove(i);
            }
        }
        return arrayLeonid;
    }

}
