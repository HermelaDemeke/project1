/*
Create class Student with the following:
Inherits from Person.
Constructor extends parent's constructor by adding classroom and a parameter for it.
 */
public class Student extends Person {
    private String classroom;
    public Student(String name, int age, boolean parent_permission) {
        super(name, age, parent_permission);
        this.classroom=classroom;

        }
    }
