package dec2023.patterns.prototype;

public class MostValuableStudent extends Student implements Cloneable{

    private int testScore;

    public MostValuableStudent(String name, Integer rollNumber, String className, int testScore) {
        super(name, rollNumber, className);
        this.testScore = testScore;
    }

    public MostValuableStudent(Student student, int testScore) {
        super(student);
        this.testScore = testScore;
    }

    public MostValuableStudent(MostValuableStudent student) {
        super(student);
        this.testScore = student.testScore;
    }

    @Override
    public MostValuableStudent clone() {
        return new MostValuableStudent(this);
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    @Override
    public String toString() {
        return "MostValuableStudent{" +
                "testScore=" + testScore +
                '}';
    }
}
