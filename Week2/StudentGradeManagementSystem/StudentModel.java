public class StudentModel
{
    private String name;
    private int grade;

    public StudentModel(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
    }

    public String getName()
    {
        return name;
    }

    public int getGrade()
    {
        return grade;
    }
}
