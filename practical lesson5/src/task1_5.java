public class task1_5 {
    //Selection sort
    public static void sortDescending(byte[] array) {
        int n = array.length;

        // Один за одним перебираємо всі елементи масиву
        for (int i = 0; i < n - 1; i++) {
            // Знаходимо індекс максимального елемента в невідсортованій частині
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) { //починаємо пошук максимального елемента з елемента, що йде відразу після поточного i
                if (array[j] < array[maxIndex]) {
                    maxIndex = j;
                }
           
           
            }

            // Міняємо місцями максимальний елемент з елементом на початку невідсортованої частини
            byte temp = array[maxIndex]; // створюємо тимчасову змінну
            array[maxIndex] = array[i]; // переміщуємо поточний елемент на місце найбільшого
            array[i] = temp; // передаємо значення найбільшого елементу індексу початкового
        }
    }

    public static void main(String[] args) {
        byte[] numbers = {3, 7, 4, 9, 5, 2, 6, 1, 2, 1, 0, 11, 5, -70};
        sortDescending(numbers);

        // Виводимо відсортований масив
        for (byte number : numbers) {
            System.out.print(number + " ");
        }
    }
}
