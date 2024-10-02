public class task1_3 {
    
    public static void main(String[] args) {
        double m = 3;        
        int k = 20;

        if (k > 30) {
            System.out.println("the value of k should not exceed 30.");
            return;
        }

        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += Math.sqrt(m / i) * Math.sin(m * i);
        }

        System.out.printf("the sum of the series: %.6f ", sum);
    }
    
}



