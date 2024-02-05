import java.util.Scanner;

public class MinMaxLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.print("Enter the min value: ");
        int min = scanner.nextInt();
        
       
        System.out.print("Enter the max value: ");
        int max = scanner.nextInt();
        
        while (min <= max) {
            System.out.println(min);
            min++;
        }
    }
}
