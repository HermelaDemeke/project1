/*
Create class Teacher with the following:
 */
public class Teacher extends Person{
 String specialization;
    //Constructor extends parent's constructor by adding specialization and a parameter for it.
    public Teacher(String name, int age, boolean parent_permission,String specialization) {
        super(name, age, parent_permission);
        this.specialization=specialization;
    }
    //Override can_use_services? so it always returns true.
    public boolean can_use_service(){
        return true;
    }
}
