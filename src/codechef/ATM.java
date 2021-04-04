/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 22-03-2021
    Time: 19:38
    File: ATM.java 
*/
package codechef;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int withdrawAmount = scanner.nextInt();
        double initialBalance = scanner.nextDouble();
        scanner.close();
        double remainingBalance;
        if (withdrawAmount % 5 == 0 && withdrawAmount < initialBalance) {
            remainingBalance = (initialBalance - withdrawAmount) - 0.50;
        } else {
            remainingBalance = initialBalance;
        }
        System.out.format("%.2f", remainingBalance);
    }
}