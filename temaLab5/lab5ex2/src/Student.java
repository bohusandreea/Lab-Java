public class Student extends Persoana {

    private String university;
    public Student(String FirstName, String LastName, int age, String university) {
        super(FirstName, LastName, age);
        this.university=university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
