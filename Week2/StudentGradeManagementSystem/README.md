# Student Grade Management System (Java)

A **console-based Java application** that allows users to manage student grades efficiently.  
The system supports adding students, viewing records, sorting grades, and generating a report using **Java Collections and File Handling**.

---

## Project Overview

The **Student Grade Management System** is designed to demonstrate:
- Core Java concepts
- Object-Oriented Programming (OOP)
- Collection Framework (`HashMap`, `ArrayList`)
- Sorting using Comparator / Lambda
- File Handling for report generation

This project is ideal for **internship submission** and **beginner-to-intermediate Java learners**.

---

## Features

-  Add student name and grade  
-  Display all student records  
-  Sort students by grade (High → Low)  
-  Generate a text-based report (`Student_Report.txt`)  
-  Clean modular design with separate classes  

---

## Technologies Used

- **Language:** Java  
- **Concepts:**  
  - OOP (Encapsulation, Classes, Objects)  
  - Collections Framework  
  - Lambda Expressions  
  - File Handling (`FileWriter`, `PrintWriter`)  

---

## Project Structure

~~~text
StudentGradeManagement/
│
├── StudentModel.java       // Model class for student data
├── GradeManager.java       // Business logic & report generation
├── StudentGradeApp.java    // Main application (Menu-driven)
├── Student_Report.txt      // Generated report file
└── README.md               // Project documentation
~~~
---

## ▶️ How to Compile and Run

### Compile All Files
```bash
javac StudentModel.java
javac GradeManager.java
javac StudentGradeApp.java
```

## ▶️ Run the Application
```bash
java StudentGradeApp
```
---

### Menu Options
```bash
1. Add Student
2. Display All Students
3. Display Students Sorted by Grade
4. Generate Report
5. Exit
```
---
## Report Generation

Selecting option 4 generates a file named:
```bash
Student_Report.txt
```
# The report contains:

Student Name
Grade
Sorted by grade (High → Low)

---

## Future Enhancements

- Input validation for student name and grade
- Persistent storage using File Handling or Database (JDBC)
- Search student by name
- GUI-based version using Java Swing

---

##  License

This project is licensed under the **MIT License** — feel free to modify and use it for learning or development purposes.
See the [LICENSE](LICENSE) file for details.

---

## Author

**Omkar Sachin Narlawar**  

If you like this project, give it a **Star** on  
[GitHub](https://github.com/OmkarNarlawar26)!

Connect to [Linkedin](https://www.linkedin.com/in/omkar-narlawar-7504a8388/)!
