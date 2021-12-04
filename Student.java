import java.util.Vector;

public class Student extends Person{
    private String id;
   // private String name;
    private Vector courses; // contains all courses the student is registered in

    //constructor
    public Student(String stdName, String stdId) {
        this.name = stdName;
        this.id = stdId;
        courses = new Vector<>();

    }
    //getter
    public String getName() {
        return name;
    }
    //getter
    public String getId() {
        return id;
    }
    //method to register student for course
    public void registerFor(Course course){
        //if student is already taking the course it will do nothing
        if(courses.contains(course)){

        }
        else{
            //updates the vectors if student is not taking the course and wants to take it
            courses.add(course);
            course.getDept().registerList.add(this);
            course.classList.add(this);

        }
    }
    //method to determine if student is registered in a course
    public Boolean isRegisteredInCourse (Course course){
        //checks if the vector courses contains the course meaning the student is taking the course
        if(courses.contains(course)){
            return true;
        }
        else{
            return false;
        }
    }
    //to string method
    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

        return getName() + " " + getId();
    }
}