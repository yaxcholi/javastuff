import java.util.Scanner;

public class TimesTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

  
        while (number < 1 || number > 12) {
           
            System.out.print("Enter an integer between 1 and 12 inclusive: ");
            number = scanner.nextInt();

           
            if (number < 1 || number > 12) {
                System.out.println("Invalid input. Please enter a number between 1 and 12 inclusive.");
            }
        }

   
        System.out.println("Times Tables for " + number + ":");
        int i = 1;
        while (i <= 12) {
            int result = number * i;
            System.out.println(String.format("%2d * %2d = %2d", number, i, result));
            i++;
        }

      
        scanner.close();
    }
}
