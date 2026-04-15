package Constructors;

public class Student {
    String name;
    int age;
    float psp;
    Batch batch;

    public Student() {
    }

    public Student(String name, int age) {
        // The values are already initialised with default
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, float psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    public Student(String name, int age, float psp, Batch batch) {
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.batch = batch;
    }

    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.psp = other.psp;
        //In case of batch in student, shallow copy is better approach
        this.batch = other.batch; // reference variables - memory got copied //
//        this.batch = new Batch();
//        this.batch.name = other.batch.name;
//        this.batch.strength = other.batch.strength;
//        this.batch = new Batch(other.batch);

    }
}
