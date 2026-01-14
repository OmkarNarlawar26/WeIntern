import java.util.*;
import java.io.*;

public class GradeManager
{

    private HashMap<String, Integer> studentMap;

    public GradeManager()
    {
        studentMap = new HashMap<>();
    }

    // Add student
    public void addStudent(String name, int grade)
    {
        studentMap.put(name, grade);
        System.out.println("Student added successfully.");
    }

    // Display all students
    public void displayAllStudents()
    {
        if (studentMap.isEmpty())
        {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\nStudent Records:");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet())
        {
            System.out.println("Name: " + entry.getKey() + " | Grade: " + entry.getValue());
        }
    }

    // Sort students by grade
    public void displaySortedByGrade()
    {
        if (studentMap.isEmpty())
        {
            System.out.println("No student records to sort.");
            return;
        }

        ArrayList<StudentModel> studentList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : studentMap.entrySet())
        {
            studentList.add(new StudentModel(entry.getKey(), entry.getValue()));
        }

        studentList.sort((s1, s2) -> s2.getGrade() - s1.getGrade());

        System.out.println("\nStudents Sorted by Grade (High → Low):");
        for (StudentModel s : studentList)
        {
            System.out.println("Name: " + s.getName() + " | Grade: " + s.getGrade());
        }
    }

    //Generate Report
    public void generateReport()
    {
        if (studentMap.isEmpty())
        {
            System.out.println("No data available to generate report.");
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("Student_Report.txt")))
        {

            writer.println("===== Student Grade Report =====\n");

            ArrayList<StudentModel> studentList = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : studentMap.entrySet())
            {
                studentList.add(new StudentModel(entry.getKey(), entry.getValue()));
            }

            studentList.sort((s1, s2) -> s2.getGrade() - s1.getGrade());

            for (StudentModel s : studentList)
            {
                writer.println("Name: " + s.getName() + " | Grade: " + s.getGrade());
            }

            System.out.println("Report generated successfully: Student_Report.txt");

        } 
        catch (IOException e) 
        {
            System.out.println("Error while generating report.");
        }
    }
}
