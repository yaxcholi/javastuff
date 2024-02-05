import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("The number entered is 0 and is therefore Zero.");
        } else if (number % 2 == 0) {
            System.out.println("The number entered is " + number + " and is therefore Even.");
        } else {
            System.out.println("The number entered is " + number + " and is therefore Odd.");
        }

        scanner.close();
    }
}
