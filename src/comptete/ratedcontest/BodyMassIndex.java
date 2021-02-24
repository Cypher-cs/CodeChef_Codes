/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 24-02-2021
Time: 16:41
File: BodyMassIndex.java */
package comptete.ratedcontest;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        for (int i = 0; i < T; i++) {
            int mass = scanner.nextInt();
            int height = scanner.nextInt();

            int bmi = mass / (height * height);
            if (bmi <= 18) {
                cat1 = 1;
            } else if (bmi >= 19 && bmi <= 24) {
                cat2 = 1;
            } else if (bmi >= 25 && bmi <= 29) {
                cat3 = 1;
            } else if (bmi >= 30) {
                cat4 = 1;
            }
        }
        if (cat1 == 1) {
            System.out.println("1");
            cat1--;
        } if (cat2 == 1) {
            System.out.println("2");
            cat2--;
        } if (cat3 == 1) {
            System.out.println("3");
            cat3--;
        } if (cat4 == 1) {
            System.out.println("4");
            cat4--;
        }
    }
}