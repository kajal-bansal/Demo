import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        System.out.println("Please enter the details");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter student name");
            String studentName = scanner.nextLine();
            System.out.println("Enter father's name");
            String fathersName = scanner.nextLine();
            System.out.println("Enter mother's name");
            String mothersName = scanner.nextLine();
            System.out.println("Enter permanent address name");
            String permanentAddress = scanner.nextLine();
            System.out.println("Enter student phone number");
            long studentPhoneNumber = scanner.nextLong();
            System.out.println("Enter father's phone number");
            long fathersPhoneNumber = scanner.nextLong();
            System.out.println("Enter mother's phone number");
            long mothersPhoneNumber = scanner.nextLong();
            System.out.println("Enter percentage in 12th");
            double percentageIn12th = scanner.nextDouble();
            System.out.println("Enter percentage in 10th");
            double percentageIn10th = scanner.nextDouble();
            System.out.println("Do u want Hostel");
            boolean hostelChoice = scanner.nextBoolean();
            System.out.println("studentName:" + studentName);
            System.out.println("fathersName:" + fathersName);
            System.out.println("mothersName:" + mothersName);
            System.out.println("permanentAddress:" + permanentAddress);
            System.out.println("studentPhoneNumber:" + studentPhoneNumber);
            System.out.println("fathersPhoneNumber:" + fathersPhoneNumber);
            System.out.println("mothersPhoneNumber:" + mothersPhoneNumber);
            System.out.println("percentageIn12th:" + percentageIn12th);
            System.out.println("percentageIn10th:" + percentageIn10th);
            System.out.println("hostelChoice:" + hostelChoice);
            System.out.println("Year:1");
            System.out.println("Section:A");
            System.out.println("Class Roll Number is"+i);
            System.out.println("University Roll Number is"+(20151000+i));
            System.out.println("Course:B.tech cse");
        }
    }
}
