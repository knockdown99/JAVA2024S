public class Task2_4 {
    public static void main(String[] args) {
        double[] numbers = {4, 6.3, -4, -7, 4, -1, 3, 5, 90.98, -80, 1, 4, 78, 9, 0, -59, -5};
        double product = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 5 == 0 && numbers[i] < 0) {
                product *= numbers[i];
            }
        }

        System.out.printf("The product of negative numbers with indices that are multiples of 5:  %.6f", product);
    }
}
