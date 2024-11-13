public class Task1_6test {

    public static void main(String[] args) {
        int positiveNumber = 127;
        int negativeNumber = -127;

        System.out.println(intToBinaryString(positiveNumber));  // Виведе двійкове представлення 127 у вигляді 32 біт
        System.out.println(intToBinaryString(negativeNumber));  // Виведе двійкове представлення -127 у вигляді 32 біт
    }

    public static String intToBinaryString(int i) {
        StringBuilder binaryString = new StringBuilder();
        int bitCount = 32;  // Кількість бітів для представлення у двійковому форматі 

        // Працюємо з числом без явного доповнення, оскільки Java автоматично обробляє від'ємні числа
        if (i<0) {
            for (int j = 0; j < bitCount; j++) {
            int bitok = i & 1;  // Отримуємо найменший біт через порівняння оператором & (побітове і)
            binaryString.insert(0, bitok);  // Додаємо отриманий біт на початок рядка (позиція 0)
            i >>= 1;  // Зсуваємо число вправо на 1 біт, щоб отримати наступний біт
        }
        }
        else{
            // Перетворення числа в двійковий рядок
        for (int j = 0; j < bitCount; j++) {
            int bit = i % 2;  // Отримуємо залишок від ділення на 2 (молодший біт)
            binaryString.insert(0, bit);  // Додаємо біт на початок рядка (для побудови правильного порядку)
            i = i / 2;  // Ділимо на 2, щоб перейти до наступного біта
        }
        }
       
        return binaryString.toString();
    }
}
