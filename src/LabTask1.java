/*   Created by IntelliJ IDEA.
 *   Author: Kajal Bansal
 *   Date: 7/25/2020
 *   Time: 4:13 PM
 *   File: LabTask1.java
 */

public class LabTask1 {
    public static void main(String[] args) {
        System.out.printf("%-15s %-15s %-15s %-15s\n", "data type", "size in bits", "size in bytes", "range ");
        System.out.printf("%-15s %-15d %-15d %-15s\n", "byte", Byte.SIZE, Byte.BYTES, "from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.printf("%-15s %-15d %-15d %-15s\n", "short", Short.SIZE, Short.BYTES, "from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.printf("%-15s %-15d %-15d %-15s\n", "int", Integer.SIZE, Integer.BYTES, "from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.printf("%-15s %-15d %-15d %-15s\n", "long", Long.SIZE, Long.BYTES, "from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.printf("%-15s %-15d %-15d %-15s\n", "float", Float.SIZE, Float.BYTES, "from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.printf("%-15s %-15d %-15d %-15s\n", "double", Double.SIZE, Double.BYTES, "from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
    }
}
