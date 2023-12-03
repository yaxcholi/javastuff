public class TemperatureAnalysis {

    public static void main(String[] args) {
        int[] temperatures = {9, 2, 11, -1, 10, 0, 7, -2, 8, 2, 10, -2, 12, 3};
        
        int coldNights = countColdNights(temperatures);
        int warmNights = countWarmNights(temperatures);
        double avgTemperature = calculateAverage(temperatures);

        displayResults(coldNights, warmNights, avgTemperature);
    }

    public static int countColdNights(int[] temps) {
        int coldCount = 0;
        for (int temp : temps) {
            if (temp < 1) {
                coldCount++;
            }
        }
        return coldCount;
    }

    public static int countWarmNights(int[] temps) {
        int warmCount = 0;
        for (int temp : temps) {
            if (temp > 10) {
                warmCount++;
            }
        }
        return warmCount;
    }

    public static double calculateAverage(int[] data) {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return (double) sum / data.length;
    }

    public static void displayResults(int coldNights, int warmNights, double avgTemperature) {
        System.out.println(coldNights + " cold nights");
        System.out.println(warmNights + " warm nights");
        System.out.println(avgTemperature + " degrees average");
    }
}
