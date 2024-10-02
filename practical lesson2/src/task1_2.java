public class task1_2 {
    public static void main(String[] args) {
        double a = 3.45;
        double b = -2.25;
        double c = 2.65;
        double d = 3.99;

            if (c <= 0) {
                System.out.println("Аргумент логарифма повинен бути додатним");
            } else {
                double y = (Math.cos(b) + Math.sin(Math.sqrt(a))) / (2 * Math.log(c) + Math.exp(d));
                System.out.printf("y = %.6f ", y);
        }
    }
}
