
public class Student extends Person {
    private Classroom classroom;//private modifier
    public Student(String name, int age, boolean parent_Permission) {
            super(name,age,parent_Permission);
        }
        public Classroom getClassroom() {
            return this.classroom;
        }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }


}