package encapsulation26;

public class Encapsulate {
    // private variables declared these can only be accessed by public methods of class
    private String name;
    private int rollno;
    private int age;

    // set method for name to access private variable name
    public void setName(String name){
        this.name = name;
    }
    // get method for name to access private variable age
    public String getName(){
        return name;
    }
    // get method for roll to access private variable roll no
    public int getRollno(){
        return rollno;
    }
    // set method for roll to access private variable roll no
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    // get method for age to access private variable age
    public int getAge(){
        return age;
    }
    // set method for age to access private variable age
    public void setAge(int age){
        this.age = age;
    }
}
