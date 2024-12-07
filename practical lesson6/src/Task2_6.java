
public class Task2_6 {
    public static void main(String[] args) {
        String sentence = "The user with the nickname koala757677 this month left 3 times more " +
                          "comments than the user with the nickname croco181dile181920 4 months ago 23 1er war 3r3rec";
        
        int wordCount = countWordsInSentence(sentence);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWordsInSentence(String sentence) {
   
  // Розділяємо рядок на слова, використовуючи пробіл як роздільник
  String[] words = sentence.split("\\s+"); // метод що розбиває рядок на підрядки по пробілам
        
  int count = 0;
  
  // Перевіряємо кожне слово
  for (String word : words) { // проходимо по кожному слову з речення
      // Якщо слово складається тільки з літер (без цифр)
      if (word.matches("[a-zA-Z]+")) { // matches метод, який перевіряє, чи задовольняє рядок заданому регулярному виразу.
          count++;
      }
  }
  
  return count;  // Повертаємо кількість слів, що складаються тільки з літер
    }
}