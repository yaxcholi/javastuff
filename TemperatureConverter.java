import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = CelsiusToFahrenheit(celsius);

        System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);
        System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);

       
        if (celsius < 3) {
            System.out.println("Warning!!");
        }

        scanner.close();
    }

    public static double CelsiusToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }
}
