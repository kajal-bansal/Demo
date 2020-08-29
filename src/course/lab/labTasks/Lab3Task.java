/*   Created by IntelliJ IDEA.
 *   Author: Kajal Bansal
 *   Date: 7/27/2020
 *   Time: 5:30 PM
 *   File: Lab3Task.java
 */

package course.lab.labTasks;

import java.util.Scanner;

public class Lab3Task {
    public static final String DISCOUNT_CODE = "CoVid19";

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter your Coupon Code");
        String clientInputDiscountCode = scannerObject.nextLine();
        scannerObject.close();
        if (clientInputDiscountCode.isEmpty()) {
            System.out.println("The coupon code cannot be blank or empty .");
        } else if (clientInputDiscountCode.equalsIgnoreCase(DISCOUNT_CODE)) {
            System.out.println("Congrats, you get ₹ 100 off on your bill!");
        } else {
            System.out.println("You entered a wrong coupon");
        }
    }
}
