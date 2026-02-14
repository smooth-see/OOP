import practice2.Student;
import java.util.*;

class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisites;

    public Course(String name, String description, int credits, String prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return name + " (" + credits + " credits)";
    }
}

class GradeBook {
    private Course course;
    private List<Student> students;
    private Map<Student, Integer> grades = new HashMap<>();

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        this.students = students;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void setGrade(Student student, int grade) {
        grades.put(student, grade);
    }

    public void displayGradeReport() {
        double average = determineClassAverage();
        System.out.printf("\nClass average is %.2f. ", average);
        outputMinMax();
        outputBarChart();
    }

    private double determineClassAverage() {
        if (grades.isEmpty()) return 0;
        int total = 0;
        for (int grade : grades.values()) total += grade;
        return (double) total / grades.size();
    }

    private void outputMinMax() {
        Student lowS = null, highS = null;
        int lowG = 101, highG = -1;

        for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
            if (entry.getValue() < lowG) {
                lowG = entry.getValue();
                lowS = entry.getKey();
            }
            if (entry.getValue() > highG) {
                highG = entry.getValue();
                highS = entry.getKey();
            }
        }
        System.out.printf("Lowest grade is %d (%s, id: %s).\n", lowG, lowS.getName(), lowS.getId());
        System.out.printf("Highest grade is %d (%s, id: %s).\n", highG, highS.getName(), highS.getId());
    }

    private void outputBarChart() {
        System.out.println("\nGrades distribution:");
        int[] frequency = new int[11];
        for (int grade : grades.values()) {
            frequency[grade == 100 ? 10 : grade / 10]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (i == 10) System.out.printf("%5d: ", 100);
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int stars = 0; stars < frequency[i]; stars++) System.out.print("*");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook for " + course.getName();
    }
}

public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Course myCourse = new Course("CS101 Object-oriented Programming and Design", "Core Java", 5, "None");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Student A", 1));
        studentList.add(new Student("Student B", 4));
        studentList.add(new Student("Student C", 3));
        studentList.add(new Student("Student D", 87));
        studentList.add(new Student("Student E", 5));

        GradeBook myGradeBook = new GradeBook(myCourse, studentList);

        myGradeBook.displayMessage();

        System.out.println("Please, input grades for students:");
        for (Student s : studentList) {
            System.out.print(s.getName() + ": ");
            if (input.hasNextInt()) {
                int grade = input.nextInt();
                myGradeBook.setGrade(s, grade);
            }
        }

        myGradeBook.displayGradeReport();

        input.close();
    }
}