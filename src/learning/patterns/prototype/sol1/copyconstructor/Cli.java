package learning.patterns.prototype.sol1.copyconstructor;

public class Cli {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Sourabh");
        Student s2 = s1.Student(s1);
        System.out.println("Original :->" +s1.name);
        System.out.println("Copy  :->" + s2.name);

    }
}
