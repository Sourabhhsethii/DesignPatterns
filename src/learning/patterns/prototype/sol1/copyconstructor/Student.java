package learning.patterns.prototype.sol1.copyconstructor;

/**
 * We already have an object of the class!!
 * We want to create the copy of the object!!! <-> Another object of the same class. value of all the attributes as the original object.
 *
 * VIA Copy Constructor
 *
 * Issue -> How to Copy INCase of Child Class
 */
public class Student {

    int rollNumber;
    String name;

    public Student() {
    }

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student Student(Student student){
        Student copy = new Student();
        copy.name = student.name;
        copy.rollNumber = student.rollNumber;
        return copy;
    }

}
