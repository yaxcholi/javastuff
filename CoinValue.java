import java.util.Scanner;

public class CoinValue {

    public static void main(String[] args) {
        question1();
    }

    
    public static String getCoinValue(int coin) {
        switch (coin) {
            case 1:
                return "one penny";
            case 2:
                return "two pence";
            case 5:
                return "five pence";
            case 10:
                return "ten pence";
            case 20:
                return "twenty pence";
            case 50:
                return "fifty pence";
            case 100:
                return "one pound";
            case 200:
                return "two pounds";
            default:
                return "invalid " + coin;
        }
    }

  
    public static void solution() {
        Scanner scanner = new Scanner(System.in);

        
        int coin;
        do {
            System.out.print("input coin (type 0 to quit): ");
            coin = scanner.nextInt();

      
            String coinValue = getCoinValue(coin);
            System.out.println(coinValue);

        } while (coin != 0);

        scanner.close();
    }
}
