/*   Created by IntelliJ IDEA.
 *   Author: Kajal Bansal
 *   Date: 8/4/2020
 *   Time: 7:14 PM
 *   File: Lab5Task.java
 */

package course.lab.labTasks.lab5;

/**
 * Create a program in Java to create OTP (One-Time Passwords) for a customer service.
 */

public class Lab5Task {
    private static final byte RANDOM_NUMBER_MAX_LIMIT = 10;

    /**
     * This method generates an OTP for the customer depending upon the number of digits.
     *
     * @return the generated OTP.
     */
    private static int generateOTP() {
        int numberOfDigitsInOTP = 6;
        int oneTimePassword = 0;
        for (int i = 0; i < numberOfDigitsInOTP; i++) {
            int randomNumber = 0;
            randomNumber = createRandomNumber();
            int powersOfTen;
            powersOfTen = (int) Math.pow(10.0, i);
            powersOfTen = randomNumber * powersOfTen;
            oneTimePassword = powersOfTen + oneTimePassword;
        }
        return oneTimePassword;
    }

    /**
     * This method generates a random number between 0 and 9 for the OTP.
     *
     * @return a random number between 0 and 9.
     */
    private static int createRandomNumber() {
        return (int) (Math.random() * RANDOM_NUMBER_MAX_LIMIT);
    }

    /**
     * This method prints the generated OTP with some dashes between the characters.
     *
     * @param generatedOTP the random OTP generated from the generateOTP method.
     */
    private static void printOTP(int generatedOTP) {
        String otpString = String.valueOf(generatedOTP);
        for (int i = 0; i < otpString.length(); i++) {
            System.out.print(otpString.charAt(i) + (i < otpString.length() - 1 ? "-" : ""));
        }
    }

    public static void main(String[] args) {
        int generatedOTP = generateOTP();
        System.out.print("Your OTP is : ");
        printOTP(generatedOTP);
    }
}
