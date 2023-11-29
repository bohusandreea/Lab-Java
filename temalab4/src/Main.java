import exDog.Dog;
import exPerson.Person;
import exPerson.Student;
import exPerson.Profesor;
import exRectangle.Rectangle;
import metodele.Metodele;
import java.io.*;
import java.util.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // ex cu mijlocul unui cuvant
        Metodele met1=new Metodele();
        String arr1="masina";
        String mij=met1.CaractereMijloc(arr1);
        System.out.println(mij);

        // ex cu suma cifre
        int nr=254;
        int sum=met1.Suma(nr);
        System.out.println(sum);

        Dog dog1=new Dog("Rex","Beagle");
        Dog dog2=new Dog("Max","Bulldog");
        System.out.println("Inainte de modificare cu get si set "+"\n");
        System.out.print("Primul caine : " + dog1.getName() + " " + dog1.getBreed() + "\n");
        System.out.println("Al doilea cine : "+dog2.getName() + " " +  dog2.getBreed()+"\n");

        dog1.setName("Milo");
        dog1.setBreed("Dalmatian");
        dog2.setName("Luna");
        dog2.setBreed("Chihuahua");
        System.out.println("Dupa modificare cu get si set "+"\n");
        System.out.print("Primul caine : " +dog1.getName() +" " +  dog1.getBreed()+ "\n");
        System.out.println("Al doilea cine : "+dog2.getName() + " " +  dog2.getBreed());

        // ex cu clasa Rectangle
        Rectangle dr1= new Rectangle(12.2,10);
        double aria=dr1.aria();
        double perim=dr1.perimetru();
        System.out.println("Aria : "+ aria + " " + ", perimetrul  : " + perim );

        // ex cu clasa Person
        Person pers = new Person();
        pers.setName("Ana");
        pers.setEmail("ana@gmail.com");
        System.out.print("Numele si emailul : "+ pers.getName()+" "+pers.getEmail()+"\n");


        Student elev=new Student();
        elev.setName("Ion");
        elev.setEmail("ion@gmai.com");
        int[] note={10,8,9,5};
        elev.setGrades(note);
        System.out.println("numele, emailul si notele : "+elev.getName()+" ,"+ elev.getEmail() +", "+ Arrays.toString(elev.getGrades())+"\n");

        Profesor prof= new Profesor();
        prof.setName("Ioana");
        prof.setEmail("ioana@prof.uoradea.ro");
        String[] cursuri={"matematica", "pclp1", "pclp2"};
        prof.setCourses(cursuri);
        System.out.println("numele, emailul si cursurile : "+ prof.getName()+" ,"+prof.getEmail()+ " , "+Arrays.toString(prof.getCourses()));
    }
    }
