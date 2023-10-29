package learning.patterns.prototype.sol2.copyconstructorclonemethod;

/**
 * How to implement prototype when there are many child classes???? Think?
 *
 * Ideal Solution is Object It itself provide a method to create a copy of the object!!!
 * Our Code should not voilates SRP or OCP!!
 *
 * Solution -> Use Copy Constructor + Implement Clone Method -> Implement Copy Constructor + Clone Method
 */
public class Student implements Cloneable {
    int rollNumber;
    String name;

    public Student() {
    }

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(Student student){
        this.name = student.name;
        this.rollNumber = student.rollNumber;
    }


    @Override
    public Student clone(){
        return new Student(this);
    }
}
