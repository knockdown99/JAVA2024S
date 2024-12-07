import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Клас "Студент"
class Student {
    String firstName; 
    String lastName;  
    String studentID; 
    double averageGrade; 

    // Конструктор для створення об'єкта студента
    public Student(String firstName, String lastName, String studentID, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.averageGrade = averageGrade;
    }
}

// Клас "Факультет"
class Faculty {
    String name; // Назва факультету
    List<Student> students; // Список студентів факультету

    // Конструктор для створення факультету
    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Метод для додавання студента до списку
    public void addStudent(Student student) {
        students.add(student);
    }
}

// Клас "Інститут"
class Institute {
    String name; // Назва інституту
    List<Faculty> faculties; // Список факультетів інституту

    // Конструктор для створення інституту
    public Institute(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    // Метод для додавання факультету до списку
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Завдання 1: Знайти загальну кількість студентів в інституті
    // Використовується нетипізований ітератор
   
public int getTotalStudents() {
    
    int total = 0;

    //Отримання нетипізованого ітератора для списку факультетів faculties — це список об'єктів класу Faculty.
    Iterator facultyIterator = faculties.iterator();
    // Перевірка, чи є наступний елемент у списку за допомогою facultyIterator.hasNext().
    while (facultyIterator.hasNext()) {
        
        Faculty faculty = (Faculty) facultyIterator.next(); // Отримання кількості студентів на поточному факультеті        
        int studentCount = faculty.students.size(); // Метод .size() повертає кількість студентів у списку.

        total += studentCount;
    }

    return total;
}
    

    // Завдання 2: Знайти факультет із найбільшою кількістю студентів
    // Використовується цикл "for-each"
    public String getFacultyWithMostStudents() {
        int maxStudents = 0;
        String facultyName = "";

        for (Faculty faculty : faculties) {
            if (faculty.students.size() > maxStudents) {
                maxStudents = faculty.students.size();
                facultyName = faculty.name;
            }
        }

        return facultyName;
    }

    // Завдання 3: Отримати список студентів із середнім балом 95..100
    // Використовується типізований ітератор
public List<Student> getTopStudents() {

    // список `topStudents` буде заповнюватися студентами, які відповідають умові (95 <= averageGrade <= 100).
    List<Student> topStudents = new ArrayList<>();

    // 
    Iterator<Faculty> facultyIterator = faculties.iterator(); // Типізований ітератор для `faculties`

    //Цикл для перебору всіх факультетів у списку
    while (facultyIterator.hasNext()) {
        // Отримуємо поточний факультет зі списку
        Faculty faculty = facultyIterator.next();

        // Отримання типізованого ітератора для списку студентів поточного факультету
        Iterator<Student> studentIterator = faculty.students.iterator(); // Типізований ітератор для `students`

        // Цикл для перебору всіх студентів у поточному факультеті
        while (studentIterator.hasNext()) {
            // Отримуємо поточного студента зі списку
            Student student = studentIterator.next();

            // Перевірка, чи середній бал студента знаходиться у діапазоні 95–100
            if (student.averageGrade >= 95 && student.averageGrade <= 100) {
                topStudents.add(student);
            }
        }
    }

    
    return topStudents;
}

}

public class Task1_7 {
    public static void main(String[] args) {
        // Створення прикладів даних
        Student student1 = new Student("Ivan", "Kovalenko", "S123", 96);
        Student student2 = new Student("Olena", "Shevchenko", "S124", 89);
        Student student3 = new Student("Alina", "Dmytrenko", "S125", 97);

        Faculty faculty1 = new Faculty("Engineering");
        faculty1.addStudent(student1);
        faculty1.addStudent(student2);

        Faculty faculty2 = new Faculty("Telecommunications");
        faculty2.addStudent(student3);

        Institute institute = new Institute("Technical University");
        institute.addFaculty(faculty1);
        institute.addFaculty(faculty2);

        // Завдання 1
        System.out.println("The total number of students in the institute: " + institute.getTotalStudents());

        // Завдання 2
        System.out.println("Faculty with the largest number of students: " + institute.getFacultyWithMostStudents());

        // Завдання 3
        List<Student> topStudents = institute.getTopStudents();
        System.out.println("Students with an average score of 95..100:");
        for (Student student : topStudents) {
            System.out.println(student.firstName + " " + student.lastName + " (" + student.studentID + "), Mark: " + student.averageGrade);
        }
    }
}
