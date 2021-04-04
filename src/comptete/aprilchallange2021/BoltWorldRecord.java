/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 04-04-2021
    Time: 12:34
    File: BoltWorldRecord.java 
*/
package comptete.aprilchallange2021;

import java.util.Scanner;

public class BoltWorldRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            double[] arr = new double[4];
            double multi = 1;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextFloat();
                multi = multi * arr[i];
            }
            double time = (100 / multi);
            double time2 = Math.round(time * 100.0) / 100.0;
            System.out.println(time2);
            if (time2 < 9.58) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}