// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

/*  Creati o clasa Animal cu metodele eat() si sound().
    Creati 3 subclase: Lion, Tiger, Panther.
    Suprascrieti metoda eat() in fiecare subclasa care sa descrie ce mananca fiecare animal.
    Suprascrieti metoda sound() care sa descrie sunetul fiecarui animal.
    In clasa Main creati o instanta din fiecare subclasa si apelati metodele.*/
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Lion leu = new Lion();
        Tiger tigru = new Tiger();
        Panther pantera = new Panther();

        System.out.println("Leu:");
        leu.eat();
        leu.sound();
        System.out.println();

        System.out.println("Tigru:");
        tigru.eat();
        tigru.sound();
        System.out.println();

        System.out.println("Pantera:");
        pantera.eat();
        pantera.sound();

    }
}