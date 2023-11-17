/*
Create class Student with the following:
Inherits from Person.
Constructor extends parent's constructor by adding classroom and a parameter for it.
 */
public class Student extends Person {
    private Classroom classroom;//private modifier
    public Student(String name, int age, boolean parent_permission) {
        super(name, age, parent_permission);
        this.name = name;
        this.classroom = null;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
        classroom.addStudent(this);
    }

    public Classroom getClassroom() {
        return this.classroom;
    }
}