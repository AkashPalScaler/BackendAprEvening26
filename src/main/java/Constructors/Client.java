package Constructors;

public class Client {
    public static void main(String[] args) {
//        Student st = new Student("Akash", 23, 100.0f);
//
//        Student stShallowCopy = st;
//
//        Student stCopy = new Student(st);
//
//        stCopy.name = "Temp";
//        stShallowCopy.name = "ShallowTemp";

        Batch batch = new Batch("BackendLLDApr26", 30);
        Student s1 = new Student("Sam", 30, 90.7f, batch);

        Student s1Copy = new Student(s1);

        System.out.println("DEBUG");
    }
}
