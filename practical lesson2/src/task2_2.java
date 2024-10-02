public class task2_2 {
    public static void main(String[] args) {
        double a = 1.25;
        double b = 0.24;
        double c = 4.25;
        double d = 0.56;

        if (Math.abs(b) > 1) {
            System.out.println("Аргумент арккосинуса повинен бути в межах [-1, 1]");
        }
        else{
                double y = 2 * Math.sqrt(Math.tan(a) / Math.abs(Math.acos(b))) - 3 * Math.cbrt(Math.exp(c - a)) * Math.sinh(d);
                System.out.printf("y = %.6f ", y);
            }
        }
    }
