// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;

public class task2_3_Maslov_LA {
    private static final int sum = 0;
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task1_3_Maslov_LA.class.getName());
        FileHandler fh = new FileHandler(".vscode\\DZ\\logTask5.xml");
        ((Logger) logger).addHandler(fh);
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
 
            int min = arrayLeonid.get(0);
            int max = arrayLeonid.get(0);
            float sum = 0;
            for(int i = 0;i<arrayLeonid.size();i++){
                int num = arrayLeonid.get(i);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                sum += num;
            }
            
            float average = sum / arrayLeonid.size();
            System.out.println("Минимальное значение: "+min);
            System.out.println("Ммаксимальное значение: "+max);
            System.out.println("Среднее значение "+average);
            Collections.sort(arrayLeonid);
            System.out.println("Сортированный список массива: \n "+arrayLeonid);
        }
    }
}
