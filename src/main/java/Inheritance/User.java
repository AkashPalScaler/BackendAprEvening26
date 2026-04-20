package Inheritance;

public class User {
    String name;
    String email;
    private int age;

    static void hello(){
        System.out.println("User : static hello");
    }

    public User(){
        System.out.println("User: Default constructor");
    }

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        System.out.println("User: Parameterised constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
