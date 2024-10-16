import java.util.ArrayList;

public class Task1_4{
    public static void main(String[] args) {
        double[] numbers = {-2, -3, 5, 0, 1.3, -4}; 

        // Знаходимо індекси додатних елементів
        ArrayList<Integer> positiveIndices = new ArrayList<>(); //динамічний масив
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveIndices.add(i); // додаємо індекс позитивного елеммента в новий масив
            }
        }

        // Розраховуємо добуток індексів
        double product = 1.0;
        for (int index : positiveIndices) {
            product *= index;
        }

        // Розраховуємо середнє геометричне
        double geometricMean = Math.pow(product, 1.0 / positiveIndices.size());
        
///Вивід        
        if (Double.isNaN(geometricMean)) {
            System.out.println("The array has no positive numbers");
        } else {
        System.out.printf("Geometric mean of indices of positive elements: %.6f", geometricMean);
    }
}
}