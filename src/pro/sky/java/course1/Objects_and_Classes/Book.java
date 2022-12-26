package pro.sky.java.course1.Objects_and_Classes;

public class Book {
    public String nameBook;
    public int year;

    public String author;

    public Book(String nameBook, int year, Author author) {
        this.nameBook = nameBook;
        this.year = year;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYear() {
        return this.year;
    }

    public String getAuthor() {
        return this.author;
    }
    public void setYear(int year) {
        this.year = year;
    }
}



