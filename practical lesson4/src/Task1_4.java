import java.util.ArrayList;
import java.util.List;

public class Task1_4 {
    public static void main(String[] args) {
        // Заданий масив
        Object[] array = {-9, -50, -90, 0,};

        // Фільтруємо масив, залишаючи тільки додатні цілі числа
        List<Integer> positiveNumbers = new ArrayList<>(); //Динамічний масив
        for (Object element : array) 
        {
            if (element instanceof Integer && (int) element > 0) {
                positiveNumbers.add((Integer) element); //додавання нового елементу в кінець списку
            }
        }

        // Обчислюємо добуток додатних чисел
        int product = 1;
        for (int number : positiveNumbers) 
        {
            product *= number;
        }

        // Обчислюємо середнє геометричне
        double geometricMean = Math.pow(product, 1.0 / positiveNumbers.size());

        // Виводимо результат
        if (Double.isNaN(geometricMean)) {
             
            System.out.println("The array has no positive integers");
        }
        else{
           System.out.println("Geometric mean of positive integers: " + geometricMean); 
        }
        
    }
}
