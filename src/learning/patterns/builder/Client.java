package learning.patterns.builder;

public class Client {
    public static void main(String[] args) {
        Student.Builder b = Student.getBuilder().setName("Sourabh").setAge(10).setSchool("123");

        Student s = b.build();
        System.out.println("s->" + s.getName());
    }
}
