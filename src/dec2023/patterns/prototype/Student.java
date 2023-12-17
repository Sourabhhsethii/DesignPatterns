package dec2023.patterns.prototype;

public class Student implements Cloneable{
    private String  name;
    private Integer rollNumber;
    private String className;

    public Student() {
    }

    public Student(String name, Integer rollNumber, String className) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.className = className;
    }

    /**
     * Copy Constructor !!!
     * @param student
     * @return
     */
    public Student(Student student) {
        this.name = student.name;
        this.rollNumber = student.rollNumber;
        this.className = student.className;
    }

    /**
     * Only Copy Method it will not work with subclassing!!!!
     * @param std
     * @return
     */
    public Student  Student(Student std) {
        Student copy = new Student();
        copy.name = std.name;
        copy.rollNumber = std.rollNumber;
        copy.className = std.className;
        return copy;
    }

    @Override
    public Student clone() {
        return  new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", className='" + className + '\'' +
                '}';
    }
}
