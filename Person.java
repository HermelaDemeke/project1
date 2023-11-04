
/*Create class Person with the following:
Instance vars: id, name, and age.*/
public class Person {
   String name="unknown";
     int id;
   int age;
    boolean parent_permission=true;

    /*Constructor with name, age, and parent_permission as parameter.
     name and parent_permission are optional and have default values of "Unknown" and true.
     */
    public Person(String name, int age, boolean parent_permission) {
        this.name = name;
        this.age = age;
        this.parent_permission = parent_permission;
    }

   // Getters for id, name, and age.
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    /*
Setters for name and age.
 */
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //Private method of_age? that returns true if age is greater or equal to 18 and false otherwise.
    private boolean of_age(){
       if(age>=18)
           return true;
       else
           return false;
        }
       //Public method can_use_services? that returns true if person is of age or if they have permission from parents.
       public boolean can_use_service()
    {
            return of_age()||parent_permission;
    }
}
