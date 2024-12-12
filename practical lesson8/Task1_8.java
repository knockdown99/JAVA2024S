import java.util.*;

// Клас "Студент" 
class Student {
    String firstName;   
    String lastName;    
    String studentID;   
    double averageGrade; 

    // Конструктор для ініціалізації об'єкта студента
   
    public Student(String firstName, String lastName, String studentID, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.averageGrade = averageGrade;
    }
}

// Клас "Факультет" 
class Faculty {
    String name;          
    Set<Student> students; // Множина студентів факультету (колекція)

    // Конструктор для ініціалізації факультету
    public Faculty(String name) {
        this.name = name;
        this.students = new HashSet<>(); // Використовуємо HashSet (уникнення дублювання студентів)
    }

    public void addStudent(Student student) {
        students.add(student); // Додає студента, якщо його ще немає у множині
    }
}

// Клас "Інститут"
class Institute {
    String name;         
    Set<Faculty> faculties;

    // Конструктор для ініціалізації інституту
    public Institute(String name) {
        this.name = name;
        this.faculties = new HashSet<>(); // Використовуємо HashSet для факультетів
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);               // Додає факультет, якщо його ще немає у множині
    }

// Завдання 1: Підрахунок загальної кількості студентів в інституті
public int getTotalStudents() {
    
    Set<Student> uniqueStudents = new HashSet<>();

    // Перебір факультетів і додавання їх студентів до множини
    for (Faculty faculty : faculties) {
        uniqueStudents.addAll(faculty.students); // Додає студентів факультету до HashSet 
    }

    return uniqueStudents.size(); // Повертаємо кількість студентів
}

    // Завдання 2: Знаходження факультету з найбільшою кількістю студентів
    public String getFacultyWithMostStudents() {
        int maxStudents = 0;   // Максимальна кількість студентів
        String facultyName = ""; // Назва факультету з найбільшою кількістю студентів

        // Цикл for-each для перебору факультетів
        for (Faculty faculty : faculties) {
            if (faculty.students.size() > maxStudents) {
                maxStudents = faculty.students.size(); // Оновлюємо максимальне значення
                facultyName = faculty.name;           // Оновлюємо назву факультету
            }
        }
        return facultyName; // Повертаємо назву факультету
    }

    // Завдання 3: Отримання студентів із середнім балом у діапазоні 95..100
    public Set<Student> getTopStudents() {
        Set<Student> topStudents = new HashSet<>(); // Множина для збереження студентів

        // Цикл для перебору всіх факультетів
        for (Faculty faculty : faculties) {
            // Цикл для перебору всіх студентів факультету
            for (Student student : faculty.students) {
                if (student.averageGrade >= 95 && student.averageGrade <= 100) {
                    topStudents.add(student); // Додаємо студента до результату
                }
            }
        }
        return topStudents; // Повертаємо множину студентів
    }

    // Додаткова функціональність: Обчислення середнього балу студентів за факультетами
    public Map<String, Double> getAverageGradesByFaculty() {
        Map<String, Double> facultyAverages = new TreeMap<>(); // Використовуємо TreeMap для автоматичного сортування за назвою факультету
//забезпечує автоматичне впорядкування, що зручно для виводу даних.

        // Цикл для перебору факультетів
        for (Faculty faculty : faculties) {
            double totalGrades = 0;   // Сума середніх балів студентів
            int studentCount = faculty.students.size(); // Кількість студентів на факультеті

            // Цикл для підрахунку загальної суми балів
            for (Student student : faculty.students) {
                totalGrades += student.averageGrade;
            }

            // Обчислення середнього балу
            double average = studentCount > 0 ? totalGrades / studentCount : 0;
            facultyAverages.put(faculty.name, average); // Додаємо середній бал до мапи
        }
        return facultyAverages; // Повертаємо мапу середніх балів
    }
}

// Головний клас програми
public class Task1_8 {
    public static void main(String[] args) {
        
        // Створюємо студентів
        Student student1 = new Student("Ivan", "Kovalenko", "S123", 96);
        Student student2 = new Student("Olena", "Shevchenko", "S124", 89);
        Student student3 = new Student("Alina", "Dmytrenko", "S125", 97);
        Student student4 = new Student("Mykolo", "Shevchenko", "S126", 100);
        Student student5 = new Student("Panas", "Kochiy", "S127", 88);
        // Створюємо факультети
        Faculty faculty1 = new Faculty("Engineering");
        faculty1.addStudent(student1); // Додаємо студентів до факультету
        faculty1.addStudent(student2);

        Faculty faculty2 = new Faculty("Telecommunications");
        faculty2.addStudent(student3);
        faculty2.addStudent(student4);
        faculty2.addStudent(student5);
        // Створюємо інститут
        Institute institute = new Institute("Technical University");
        institute.addFaculty(faculty1); // Додаємо факультети до інституту
        institute.addFaculty(faculty2);

        // Завдання 1: Загальна кількість студентів
        System.out.println("The total number of students in the institute: " + institute.getTotalStudents());

        // Завдання 2: Факультет із найбільшою кількістю студентів
        System.out.println("Faculty with the largest number of students: " + institute.getFacultyWithMostStudents());

        // Завдання 3: Студенти з середнім балом 95..100
        Set<Student> topStudents = institute.getTopStudents();
        System.out.println("Students with an average score of 95..100:");
        for (Student student : topStudents) {
            System.out.println(student.firstName + " " + student.lastName + " (" + student.studentID + "), Mark: " + student.averageGrade);
        }

        // Додаткова функціональність: Середній бал за факультетами
        System.out.println("Average grades by faculty:");
        Map<String, Double> averageGrades = institute.getAverageGradesByFaculty();
        //Перебір мапи averageGrade

        for (Map.Entry<String, Double> entry : averageGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
