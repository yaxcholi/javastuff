import java.util.Scanner;

public class largest {


    public static int larger(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

 
    public static void question3() {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;

        System.out.println("Enter a sequence of numbers (enter 0 to terminate): ");

        int num = scanner.nextInt();

        while (num != 0) {
            largest = larger(num, largest);

            System.out.print("Enter the next number (enter 0 to terminate): ");
            num = scanner.nextInt();
        }

        System.out.println("The largest number entered was: " + largest);
    }

    public static void main(String[] args) {
        question3();
    }
}
