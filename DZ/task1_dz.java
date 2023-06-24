// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! 
// (произведение чисел от 1 до n)

package DZ;

import java.util.Scanner;

public class task1_dz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        int sum = 0;
        int f = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            f *= i;
        }
        System.out.println(sum);
        System.out.println(f);
        sc.close();

    }
}
