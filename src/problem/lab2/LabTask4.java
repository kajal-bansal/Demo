/*   Created by IntelliJ IDEA.
 *   Author: Kajal Bansal
 *   Date: 7/25/2020
 *   Time: 8:37 PM
 *   File: LabTask4.java
 */

package problem.lab2;

public class LabTask4 {
    //Create a program in Java to demonstrate declaration, initialization and usage of static and non-static variables.
    //static variable
    static int number = 10;
    //non-static variable
    int Number = 20;
}

class main {
    public static void main(String[] args) {
        LabTask4 aakash = new LabTask4();
        System.out.println("number*2=" + aakash.Number * 2);
        System.out.println("Number*2=" + LabTask4.number * 2);
    }
}

