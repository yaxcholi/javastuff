import java.util.Scanner;

public class CoinValue2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coin;

        do {
            System.out.print("Enter coin value in pence or 0 to exit: ");
            coin = scanner.nextInt();

            if (coin != 0) {
                System.out.println(coinPrinter(coin));
            }
        } while (coin != 0);

        System.out.println("Exiting...");
        scanner.close();
    }

    public static String coinPrinter(int coin) {
        String result;
        switch (coin) {
            case 1:
                result = "One penny";
                break;
            case 2:
                result = "Two pence";
                break;
            case 5:
                result = "Five pence";
                break;
            case 10:
                result = "Ten pence";
                break;
            case 20:
                result = "Twenty pence";
                break;
            case 50:
                result = "Fifty pence";
                break;
            case 100:
                result = "One pound";
                break;
            case 200:
                result = "Two pounds";
                break;
            default:
                result = "Invalid coin: " + coin;
        }
        return result;
    }
}
