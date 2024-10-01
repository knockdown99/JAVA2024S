public class task3_3 {
    public static void main(String[] args) {
       
        double epsilon = 0.001;

        double sum = 0;
        int i = 1;
        double currentTerm;

        while (true) {
            currentTerm = 1.0 / (i * (i + 1));
            sum += currentTerm;

            if (Math.abs(currentTerm) < epsilon) {
                break;
            }

            i++;
        }

        System.out.println("the sum of the series, when epsilon = " + epsilon + ": " + sum);
    }

}
