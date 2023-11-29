// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        /*Creati o clasa ( la alegerea voastra ) care este extinsa de alte 2 clase.
    Pentru clasa parinte creati un constructor care initializeaza toate campurile clasei.
    Pentru clasele mostenitoare, constructorul va apela constructorul din clasa parinte,
    iar pentru campuri creati getter si setter.*/
        Student student= new Student("Ana", "Popescu", 21,"Universitatea din Oradea");
        System.out.println(student.getFirstName() + " studiaza la "+ student.getUniversity());

        Elev elev=new Elev("Mihai","Pop", 10, 5);
        System.out.println(elev.getFirstName()+ " este in clasa "+elev.getGrade());
    }
}