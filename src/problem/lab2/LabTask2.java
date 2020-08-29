/*   Created by IntelliJ IDEA.
 *   Author: Kajal Bansal
 *   Date: 7/25/2020
 *   Time: 5:38 PM
 *   File: LabTask2.java
 */

package problem.lab2;

public class LabTask2 {
    public static void main(String[] args) {
        //Create a program in Java to create local variables with the var keyword. Assign the value of all 8 primitive data types to 8 variables.
        // Book
        var bookEdition = (byte) 7;
        var bookNumber = (short) 20;
        var numberOfBookSold = 112;
        var priceOfBook = (long) 1780;
        var versionOfBook = 1.0F;
        var bookGrade = 'A';
        var bookCode = (double) 537643745;
        var willYouPurchase = true;
        System.out.println("Book edition=" + bookEdition);
        System.out.println("Book number=" + bookNumber);
        System.out.println("Number of book sold=" + numberOfBookSold);
        System.out.println("Price of book=" + priceOfBook);
        System.out.println("Version of book=" + versionOfBook);
        System.out.println("Book grade=" + bookGrade);
        System.out.println("Book code=" + bookCode);
        System.out.println("Will you purchase=" + willYouPurchase);

    }
}
