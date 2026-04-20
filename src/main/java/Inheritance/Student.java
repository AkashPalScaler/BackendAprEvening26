package Inheritance;

public class Student extends User {
    float psp;
    private int iq;

    static void hello(){
        System.out.println("Student : static hello");
    }

    public Student(){
        System.out.println("Student: Default constructor");
        this.name = "Akash";
    }

    public Student(String name, String email, int age, float psp, int iq) {
        super(name, email, age);
        this.psp = psp;
        this.iq = iq;
        System.out.println("Student : Parameterised constructor");
    }

    void something(){
        this.iq = 12;
//        this.age = 23; // child class inherits all properties, but can access only the non-private ones directly
        this.setAge(23);
    }
}
