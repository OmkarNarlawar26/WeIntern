import java.util.ArrayList;

public class StudentService
{

    private ArrayList<Student> students = new ArrayList<>();
    private int idCounter = 1;   // AUTO ID

    // Add Student (Auto ID)
    public void addStudent(String name, int age, String course)
    {
        Student student = new Student(idCounter++, name, age, course);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View All Students
    public void viewStudents()
    {
        if (students.isEmpty())
        {
            System.out.println("No student records found.");
            return;
        }
        for (Student s : students)
        {
            s.displayStudent();
        }
    }

    // Search Student
    public void searchStudent(int id)
    {
        for (Student s : students)
        {
            if (s.getId() == id)
            {
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Update Student
    public void updateStudent(int id, String name, int age, String course)
    {
        for (Student s : students)
        {
            if (s.getId() == id)
            {
                s.setName(name);
                s.setAge(age);
                s.setCourse(course);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Delete Student
    public void deleteStudent(int id)
    {
        for (Student s : students)
        {
            if (s.getId() == id)
            {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
