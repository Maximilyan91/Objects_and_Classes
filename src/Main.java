import pro.sky.java.course1.Objects_and_Classes.Author;
import pro.sky.java.course1.Objects_and_Classes.Book;
public class Main {
    public static void main(String[] args) {

        Author petrov = new Author("Петров", "Афанасий", "Валерьевич");
        Author belyaev = new Author("Беляев", "Александр", "Романович");

        Book liberty = new Book("Liberty",1980, petrov);
        Book amphibianMan = new Book("Человек амфибия", 1961, belyaev);

        System.out.println("liberty = " + liberty.getNameBook() + " " + liberty.getYear() + " " + liberty.getAuthor());
        System.out.println("amphibianMan = " + amphibianMan.getNameBook() + " " +  amphibianMan.getYear() + " " + amphibianMan.getAuthor());

        liberty.setYear(2000);
        System.out.println("liberty = " + liberty.getYear());


        System.out.println("petrov = " + petrov.getSurname() + " " + petrov.getName() + " " + petrov.getPatronymic() );
        System.out.println("belyaev = " + belyaev.getName()  + " " +  belyaev.getName()  + " " +  petrov.getPatronymic());


    }



}
