public class Main {


    public static void printVerse(String ani, String sd) {
        System.out.println("Old McDonald had a farm, E-I-E-I-O");
        System.out.println("And on the farm he had a " + ani + ", E-I-E-I-O");
        System.out.println("With a " + sd + " " + sd + " here and a " + sd + " " + sd + " there");
        System.out.println("Here a " + sd + ", there a " + sd + ", everywhere a " + sd + " " + sd);
        System.out.println("Old McDonald had a farm, E-I-E-I-O\n");
    }

    public static void question1() {
        printVerse("bog", "woof");
        printVerse("cat", "meow");
        printVerse("duck", "quack");
    }


    public static void main(String[] args) {
        question1();
    }
}
