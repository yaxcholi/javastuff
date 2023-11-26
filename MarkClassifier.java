import java.util.Scanner;

public class MarkClassifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Keep prompting for marks until the user enters 0
        while (true) {
            int mark = readMarkFromUser(scanner);

            // Terminate the program if the user enters 0
            if (mark == 0) {
                System.out.println("Program terminated.");
                break;
            }

            String classification = classifyMark(mark);
            System.out.println("Degree Classification: " + classification);
        }

        scanner.close();
    }

    //read marks in range 0-100, reinputs if wrong
    public static int readMarkFromUser(Scanner scanner) {
        int mark;

        do {
            System.out.print("Enter your degree average mark (0 to exit): ");

            // check if input is integer
            while (scanner.hasNextInt() == false) { 
                System.out.println("Invalid input. Please enter a valid whole number."); /
                scanner.next(); 
            }

      
            mark = scanner.nextInt();

        } while (mark < 0 || mark > 100);

        return mark; // if input is wrong re-enter
    }

    // Method to give marks based on score and rank
    public static String classifyMark(int mark) {
        if (mark >= 1 && mark <= 39) {
            return "Fail";
        } else if (mark >= 40 && mark <= 49) {
            return "3rd";
        } else if (mark >= 50 && mark <= 59) {
            return "2.2";
        } else if (mark >= 60 && mark <= 69) {
            return "2.1";
        } else if (mark >= 70 && mark <= 100) {
            return "1st";
        } else {
            return "Invalid Mark";
        }
    }
}
