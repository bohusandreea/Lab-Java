public class Elev extends Persoana {
    private int grade;
    public Elev(String FirstName, String LastName, int age, int grade)
    {
        super(FirstName, LastName, age);
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
