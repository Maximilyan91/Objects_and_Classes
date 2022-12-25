import pro.sky.java.course1.Objects_and_Classes.Author;
import pro.sky.java.course1.Objects_and_Classes.Book;

public class Main {
    public static void main(String[] args) {

        Book liberty = new Book( "Liberty", 1800);
        Book amphibianMan = new Book("Человек амфибия", 1961);
        System.out.println("liberty = " + liberty.getNameBook() + " " + liberty.getYear());
        System.out.println("amphibianMan = " + amphibianMan.getNameBook() + " " +  amphibianMan.getYear());

        Author petrov = new Author("Петров", "Афанасий", "Валерьевич");
        Author belyaev = new Author("Беляев", "Александр", "Романович");
        System.out.println("petrov = " + petrov.getSurname() + " " + petrov.getName() + " " + petrov.getPatronymic() );
        System.out.println("belyaev = " + belyaev.getName()  + " " +  belyaev.getName()  + " " +  petrov.getPatronymic());


    }



}
