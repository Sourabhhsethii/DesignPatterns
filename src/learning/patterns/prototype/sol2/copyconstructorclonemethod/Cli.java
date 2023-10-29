package learning.patterns.prototype.sol2.copyconstructorclonemethod;

public class Cli {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Sourabh");
        System.out.println("Cloned Student : "+ s1.clone().name);
        Student s2 = new IntelligentStudent(1,"Sethi",5);
        System.out.println("Cloned Intelligent Student : "+ s2.clone().name);
    }
}
