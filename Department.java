import java.util.HashSet;
import java.util.Vector;

public class Department {
    private String name; // the name of school “Dept of Computing and Info Science.”
    private String id; // short name for courses “SOFE”, “ELEE”, “STAT”, etc
    public Vector<Course> courseList; // all courses offered by the department
    public Vector<Student> registerList; // all students taking courses in the department.

    //constructor
    public Department(String name, String id) {
        // also initialize the vectors
        this.name= name;
        this.id = id;
        courseList = new Vector<>();
        registerList = new Vector<>();


    }
    //getter
    public String getName() {
        return name;
    }
    //getter
    public String getId() {
        return id;
    }
    //offer course method
    public void offerCourse(Course course){
        //adds course to the specified department
        courseList.add(course);
    }
    //method to print the courses offered
    public void printCoursesOffered(){
        //loops through courselist vector
        for(Course c:courseList)
        {
            //prints courses in specific department
            System.out.println(c.toString());
        }
    }
    //prints students names
    public void printStudentsByName(){
        //loops through registerList vector
        for(Student s:registerList){
            //prints students in specific department
            System.out.println(s.toString());
        }
    }
    //method to check if a student is registered in a specific department
    public Boolean isStudentRegistered (Student student){
        if(registerList.contains(student)){
            return true;
        }
        else{
            return false;
        }
    }
    //method to check if a student is registered in a specific department with a given code
    public Vector<Student> studentsRegisteredInCourse (int code){
        //loops through courseList vector
        for(Course c : courseList){
            //returns the vector that contains the studnet staking course
            if(c.Codeint()==code){
                return c.classList;
            }

        }
        return null;
    }
    //method to print the students in a specific department with a given code
    public String printStudentsRegisteredInCourse(int code){
        //checks if any students are taking the class
        if(studentsRegisteredInCourse(code)==null){
            return "No Students taking the class with the code " + code;
        }
        else{
            //returns students taking course
            for(Student s: studentsRegisteredInCourse(code)){
                return s.getName() + " " + s.getId();
            }
        }
        return "error";
    }
    //method to detect largest course
    public Course largestCourse(){
        Course largest = null;
        int highestSize=0;
        for(Course c: courseList){
            if(c.classList.size()>=highestSize){
                largest = c;
                highestSize = c.classList.size();
            }
            
        }
        return largest;
    }

    //to string method
    public String toString() {
        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:
        // ECSE: 53 courses, 460 students
        return getName() + " " + getId() + ": " + courseList.size() + " courses, " + registerList.size() + " Students";
    }
}