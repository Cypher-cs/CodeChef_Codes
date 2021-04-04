/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 04-04-2021
    Time: 12:23
    File: ValidPairSocks.java 
*/
package comptete.aprilchallange2021;

import java.util.Scanner;

public class ValidPairSocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte socksA = scanner.nextByte();
        byte socksB = scanner.nextByte();
        byte socksC = scanner.nextByte();

        if (socksA == socksB || socksA == socksC || socksB == socksC) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}