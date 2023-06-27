// Введите одно из уравнений с тремя неизвестными
//  типа 1? + ?3 = 5? или ?8 + 2? = ?5
package DZ;

import java.util.Scanner;

public class task4_2_dz {
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
            System.out.println(b);
            if (b >= w) {
                r = b - w;
            } else {
                r = b - w + 10;
            }
            for (int i = 1; i < 10; i++) {
                int q = i;
                int res;
                for (int j= 1; j < 10; j++){
                    int t =j;
                    if (q + e < 10) {
                        res = q * 10 + w + e * 10 + r;
                        if (res == t*10+b){
                            System.out.printf("Решение: %d%d + %d%d = %d \n", q, w, e, r, res);
                        }
                    }
                }
             }
          }
          if (parts[1].contains("?") && parts[5].contains("?") && parts[11].contains("?")) {
              int q = Integer.parseInt(parts[0]);
              int t = Integer.parseInt(parts[10]);
              int r = Integer.parseInt(parts[6]);
              for (int i = 1; i < 10; i++) {
                  int w = i;
                  int b = i;
                  for (int j = 1; j < 10; j++) {
                      int res;
                      int e = j;
                      if (q + e < 9) {
                          res = q * 10 + w + e * 10 + r;
                          if (res <= t*10+b && res > t*10-1){
                              System.out.printf("Решение: %d%d + %d%d = %d \n", q, w, e, r, res);
                          }
                        
                     }
                 }
             }
         }
     }
}
