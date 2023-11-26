import java.util.Scanner;

public class potato {

    public static void main(String[] args) {
        potatoCounter(7);
        System.out.println("Seperator");
        mashCounter(20);
    }


    public static void potatoCounter(int maxCounter) {
        int counter = 1;
        while (counter <= maxCounter) {
            if (counter != 4) {
                System.out.println(counter + " potato");
            } else {
                System.out.println(counter);
            }
            counter = counter + 1;
        }
        System.out.println("more");
    }

    public static void mashCounter(int maxCounter) {
        int counter = 1;
        while (counter <= maxCounter) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("mash");
            } else {
                System.out.println(counter);
            }
            counter = counter + 1;
        }
        System.out.println("more");
    }
}
