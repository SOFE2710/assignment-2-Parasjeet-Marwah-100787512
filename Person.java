public class Person {
    public String   name;

    // constructors
    public Person(String initialName){
    this.name=initialName;
    }
    //constructor
    public Person(){

    }
    //setter
    public void setName( String fullName) {
        this.name=fullName;
    }
    //getter
    public String getName() {
        return this.name;

    }
    //to string method
    public String toString() {
        return "person class: " + name;
    }
}