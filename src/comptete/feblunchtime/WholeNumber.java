/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 27-02-2021
    Time: 21:47
    File: WholeNumber.java 
*/
package comptete.feblunchtime;

import java.util.Scanner;

// smallest possible whole number
public class WholeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int n =0;
        int k = 0;
        for (int i = 0; i < T; i++) {
            n = scanner.nextInt();
            k = scanner.nextInt();

            while (n >= k) {
                n = n - k;
                if (n < k) {
                    break;
                }
            }
                System.out.println(n);
        }
    }
}