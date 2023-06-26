package DZ;

import java.util.Scanner;

public class task4_2_dz {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String equation = scanner.nextLine();
        String[] parts = equation.split("");
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[5]);
        System.out.println(parts[6]);
        System.out.println(parts[10]);
        System.out.println(parts[11]);

        if (parts[0].contains("?") && parts[6].contains("?") && parts[10].contains("?")) {
            int w = Integer.parseInt(parts[1]);
            int b = Integer.parseInt(parts[11]);
            int e = Integer.parseInt(parts[5]);
            int r;
            System.out.println(w);
            if (w >= b) {
                r = w - b;
            } else {
                r = w - b + 10;
            }
            for (int i = 1; i < 10; i++) {
                int q = i;
                int res;
                if (q + e < 10) {
                    res = q * 10 + w + e * 10 + r;
                    System.out.printf("Решение: %d%d + %d%d = %d \n", q, w, e, r, res);
                }
            }
        }

        if (parts[1].contains("?") && parts[5].contains("?") && parts[11].contains("?")) {
            int q = Integer.parseInt(parts[0]);
            int t = Integer.parseInt(parts[10]);
            int r = Integer.parseInt(parts[6]);
            for (int i = 1; i < 10; i++) {
                int w = i;
                for (int j = 1; j < 10; j++) {
                    int res;
                    int e = j;
                    if (q + e < 9) {
                        res = q * 10 + w + e * 10 + r;
                        System.out.printf("Решение: %d%d + %d%d = %d \n", q, w, e, r, res);
                    }
                }
            }
        }
        // !parts[11].contains("?")) {
        // w = 0;
        // b = 0;
        // if w + b != r
        // }
        // if (w == -1 && !parts[1].contains("?")) {
        // w = Integer.parseInt(parts[1]);
        // }
        // if (e == -1 && !parts[5].contains("?")) {

        // }
        // if (r == -1 && !parts[6].contains("?")) {
        // r = Integer.parseInt(parts[6]);
        // }
        // if (t == -1 && !parts[10].contains("?")) {
        // t = Integer.parseInt(parts[10]);
        // }
        // if (b == -1 && !parts[11].contains("?")) {
        // b = Integer.parseInt(parts[11]);
        // }
        // if (parts[0].charAt(i) == '?') {
        // q = i * 10;
        // }
        // if (parts[1].charAt(i) == '?') {
        // w = i;
        // }
        // if (parts[5].charAt(i) == '?') {
        // e = i * 10;
        // }
        // if (parts[6].charAt(i) == '?') {
        // r = i;
        // }
        // if (parts[10].charAt(i) == '?') {
        // t = i * 10;
        // }
        // if (parts[11].charAt(i) == '?') {
        // b = i;
        // }

        // }
        // System.out.println("%d + %d + %d + %d = %d + %d, q, w, e, r, t, b");
        // // if (q + w + e + r == t + b && q != -1 && w != -1 && e != -1 && r != -1 &&
        // t
        // // != -1 && b != -1) {
        // // System.out.println("%d + %d + %d + %d = %d + %d, q, w, e, r, t, b");
        // // } else {

        // // System.out.println("Решений нет");
    }
}
