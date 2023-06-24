
import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        String phrase = "Добро пожаловать на курс по Java";
        String[] arr = phrase.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf(arr[i]);
            System.out.print(" ");
        }

    }
}
