package encapsulation26;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollno(51);

        //Displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollno: " + obj.getRollno());

        // Direct access of rollno is not possible due to encapsulation
        // System.out.println("Prime's rollno: " + obj.geekname);


    }
}
