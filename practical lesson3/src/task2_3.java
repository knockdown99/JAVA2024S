public class task2_3 {
    public static double calculateX(double t, int n) {
        double result = 0;

        if (t < 0) {
            for (int i = 1; i <= n; i++) {
                result += t * t * i;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                result += Math.sqrt(t * i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        double t = -2; // Пример значения t
        int n = 5;     // Пример значения n

        double result = calculateX(t, n);
        System.out.println("x(" + t + ", " + n + ") = " + result);
    }
}