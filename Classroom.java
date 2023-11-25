import java.util.ArrayList;
import java.util.List;
//Create a class Classroom with the following:
//label instance variable, should be initialized in the constructor.
//Setter and getter for label (remember about attr_accessor)
class Classroom {
   private String label;
   private List<Student> students;
   public Classroom(String label) {
        this.label = label;
        this.students = new ArrayList<>();
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        this.students.add(student);
        student.setClassroom(this);
    }

}



