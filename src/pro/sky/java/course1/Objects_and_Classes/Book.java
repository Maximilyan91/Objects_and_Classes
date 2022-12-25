package pro.sky.java.course1.Objects_and_Classes;

public class Book {
    public String nameBook;
    public int year;

    public Book(String nameBook, int year) {
        this.nameBook = nameBook;
        this.year = year;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYear() {
        return this.year;
    }
}



