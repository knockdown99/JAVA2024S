import java.util.ArrayList;
import java.util.List;

public class Task1_4{
    public static void main(String[] args) {
        // Заданий масив
        Object[] array = {-9, -50, -90, 0,};

        // Фільтруємо масив, залишаючи тільки додатні числа
        List<Double> positiveNumbers = new ArrayList<>(); //Динамічний масив
        
        for (Object element : array) {
            double num = (Double) element;
            if (num > 0) {
                positiveNumbers.add(num); 
            }
        }

        // Обчислюємо добуток додатних чисел
        double product = 1;
        for (double number : positiveNumbers) {
            product *= number;
        }

        // Обчислюємо середнє геометричне
        double geometricMean = Math.pow(product, 1.0 / positiveNumbers.size());

        // Виводимо результат
        if (Double.isNaN(geometricMean)) {
            System.out.println("The array has no positive numbers");
        } else {
            System.out.println("Geometric mean of positive numbers: " + geometricMean);
        }
    }
}