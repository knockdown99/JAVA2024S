public class Task3_4 {
    public static void main(String[] args) {
        double[] originalArray = {4, 6.9, -4.1, -7, 4, 1, 3, 5, 90, -80, 1, 4, 78, 9, 0, -59, -5};

        // Створюємо новий масив такого ж розміру
        double[] REVERSE_Array = new double[originalArray.length];

        // Копіюємо елементи в зворотному порядку
        for (int i = 0; i < originalArray.length; i++) {
            REVERSE_Array[i] = originalArray[originalArray.length - i - 1];
        }

        // Виводимо отриманий масив
        for (double num : REVERSE_Array) {
            System.out.print(num + " ");
        }
    }
}
