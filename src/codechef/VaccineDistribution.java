/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher0p)
 *   Date: 15-12-2020
 *   Time: 00:58
 *   File: VaccineDistribution.java
 */

package codechef;

import java.util.Scanner;

public class VaccineDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // T --> Number of test cases
        int T = scanner.nextInt();

        for (int i = T; i > 0; i--) {
            int r = 0;

            // N --> number of peoples
            // D --> number of people vaccinate per day
            int N = scanner.nextInt();
            int D = scanner.nextInt();
            int[] a = new int[N];
            for (int index = 0; index < N; index++) {
                a[index] = scanner.nextInt();
                if (a[index] >= 80 || a[index] <= 9){
                    r++;
                }
            }
            int k = 0;
            k += r / D;
            if (r%D != 0) {
                k++;
            }
            N = N - r;
            k += N/D;

            if (N%D != 0) {
                k++;
            }
            System.out.println(k);
        }
    }
}

