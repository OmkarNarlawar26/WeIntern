//  Main File

import java.util.Scanner;

public class StudentGradeApp
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        GradeManager manager = new GradeManager();
        int choice;

        do
        {
            System.out.println("\n===== Student Grade Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Display Students Sorted by Grade");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter grade: ");
                    int grade = sc.nextInt();

                    manager.addStudent(name, grade);
                    break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:
                    manager.displaySortedByGrade();
                    break;

                case 4:
                    manager.generateReport();
                    break;

                case 5:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
