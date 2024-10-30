public class task2_5 {
    public static void sortDescending(byte[] array) {
        
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            byte key = array[i]; //Індекс: ключ з яким виконується порівняння
            int j = i - 1; // Індекс: попередній перед ключом елемент

            // Внутрішній цикл: порівнюємо ключ з попередніми елементами
            while (j >= 0 && array[j] < key) {
                // Зсуваємо менший елемент на одну позицію праворуч
                array[j + 1] = array[j];
                j = j - 1; //перехід до наступного елементу ліворуч
            }
            array[j + 1] = key; //встановлюмо ключ на правильне місце
        }
    }

    public static void main(String args[]) {
        byte[] arr = {0, 99, 9, 7, -100, 4, 9, 5, 2, 6, 1};
        sortDescending(arr);

        // Виводимо відсортований масив
        for (byte number : arr) {
            System.out.print(number + " ");
        }
    } 
}
