/*   Created by IntelliJ IDEA.
 *   Author: Kajal Bansal
 *   Date: 8/1/2020
 *   Time: 3:30 PM
 *   File: Lab4Task.java
 */

package course.lab.labTasks.lab4;

import java.util.Scanner;

public class Lab4Task {
    private static final byte TOTAL_PARTICIPANTS = 100;

    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + ". " +
                "See you at the conference!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte numberOfTicketsSold = 0;
        while (numberOfTicketsSold <= TOTAL_PARTICIPANTS) {
            int participants = TOTAL_PARTICIPANTS - numberOfTicketsSold;
            System.out.println("Total Tickets Left:" + participants);
            System.out.println("Enter your name");
            String participantName = scanner.nextLine();
            Lab4Task.sellTicket(participantName);
            numberOfTicketsSold++;
            if (numberOfTicketsSold == TOTAL_PARTICIPANTS) {
                System.out.println("Sorry, The tickets are sold-out!");
                break;
            }
        }
    }
}

