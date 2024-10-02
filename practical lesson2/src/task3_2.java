public class task3_2 {
    public static void main(String[] args) {
        double a = -1.23;
        double b = -0.34;
        double c = 0.707;
        double d = 2.312;

        if (a == 0) {
            System.out.println("Ділення на нуль");
        } else {
            double y = 3 * (Math.log(Math.abs(b / a)) + Math.sqrt(Math.sin(c) + Math.exp(d)));
            System.out.printf("y = %.6f ", y);
        }
    }
}

