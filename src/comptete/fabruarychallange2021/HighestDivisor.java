package comptete.fabruarychallange2021;

import java.util.Scanner;

public class HighestDivisor {
    private static int maximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int[] arr = new int[10];
        int[] brr = new int[10];
        for (int i = 1; i < N / 2; i++) {
            for (int j = 0; j < 10; j++) {
                if (N%i == 0) {
                    arr[j] = i;
                    if (arr[j] <= 10) {
                        brr[j] = i;
                    }
                }
            }
        }

        for (int k = 0; k < brr.length; k++) {
            System.out.print(brr[k] + ", ");
        }
        int max = maximum(brr);
        System.out.println("-->" + max);
    }
}
