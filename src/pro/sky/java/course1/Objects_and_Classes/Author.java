package pro.sky.java.course1.Objects_and_Classes;


public class Author {
    public String name;
    public String surname;
    public String patronymic;

    public Author(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return this.surname;
    }
    public String getName() {
        return this.name;
    }
    public String getPatronymic() {
        return this.patronymic;

    }
}

