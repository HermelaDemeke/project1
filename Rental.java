import java.util.Date;

/*
Create a class Rental with the following:
The date instance variable, should be initialized in the constructor.
Setter and getter for date (remember about attr_accessor).
 */
class Rental {
    private String Date;
    private Book book;
    private Person person;

    public Rental(String Date, Book book, Person person) {
        this.Date = Date;
        this.book = book;
        this.person = person;
        book.addRental(this);
        person.addRental(this);
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = Date;
    }

    public Book getBook() {
        return book;
    }

    public Person getPerson() {
        return person;
    }

}
/*
    Create the many-to-many (also has-many-through) relationship between Person and Book using the intermediate class Rental. The following should be implemented:
        Create the has-many side of Book and Rental (a book has many rentals).
        Create the belongs-to side of Rental and Book (a rental belongs to a book).
        Create the has-many side of Person and Rental (a person has many rentals).
        Create the belongs-to side of Rental and Person (a rental belongs to a person).
        Modify the constructor of Rental so Book and Person are set in it.
*/
