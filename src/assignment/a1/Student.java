package assignment.a1;

public class Student {
    // write the code of student class here
    private  int age;
    private  String name;

    public Student(){
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("My name is " + this.name+ ". I am " + this.age + " years old");
    }

    void sayHello(String name) {
        System.out.println(this.name + " says hello to " + name);
    }
}

