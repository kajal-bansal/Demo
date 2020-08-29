/*   Created by IntelliJ IDEA.
 *   Author: Kajal Bansal
 *   Date: 7/20/2020
 *   Time: 1:09 PM
 *   File: Task2.java
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Task 2 - Create a program in Java to declare, initialize and use local variables of all the primitive data types in Java.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bytenum");
        byte byteNum = scanner.nextByte();
        System.out.println("Enter shortnum");
        short shortNum = scanner.nextByte();
        System.out.println("Enter intnum");
        int intNum = scanner.nextInt();
        System.out.println("Enter longnum");
        long longNum = scanner.nextLong();
        System.out.println("Enter floatnum");
        float floatNum = scanner.nextFloat();
        System.out.println("Enter doublenum");
        double doubleNum = scanner.nextDouble();
        System.out.println("Enter bool");
        boolean bool = scanner.nextBoolean();
        System.out.println("Enter character");
        char character = scanner.next().charAt(0);
        scanner.close();
    }

}
