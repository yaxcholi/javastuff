public class Sequence {

    public static void main(String[] args) {
        
        Solution();
    }

    // part a
    public static int[] fillFibonacci(int[] data) {

        if (data.length >= 2) {
           
            data[0] = 1;
            data[1] = 1;

       
            for (int i = 2; i < data.length; i++) {
                data[i] = data[i - 1] + data[i - 2];
            }
        }
        return data;
    }

    // part b
    public static void printFibonacci(int[] data) {
        System.out.println("Term\tFib");
        // Start from the second element (index 1) and print the terms and corresponding Fibonacci numbers
        for (int i = 1; i < data.length; i++) {
            System.out.println(i + "\t" + data[i]);
        }
    }

    // part c
    public static void Solution() {
        // arrays
        int[] array1 = new int[6];
        int[] array2 = new int[15];
        int[] array3 = new int[2];

        // using method
        fillFibonacci(array1);
        fillFibonacci(array2);
        fillFibonacci(array3);

        System.out.println("Array 1:");
        printFibonacci(array1);

        System.out.println("\nArray 2:");
        printFibonacci(array2);

        System.out.println("\nArray 3:");
        printFibonacci(array3);
    }
}
