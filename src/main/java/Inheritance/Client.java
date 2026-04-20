package Inheritance;

public class Client {
    public static void main(String[] args) {
        Student s = new Student("Akash", "ak@gm.com", 23, 10.0f, 100);

        User.hello();
        Student.hello();
        s.hello(); // Do not access static functions through object

        User u = new Student();
        u.hello();// It calls the function of the reference class because statuc func are not overridden but hidden

        System.out.println("DEBUG");
    }
}
