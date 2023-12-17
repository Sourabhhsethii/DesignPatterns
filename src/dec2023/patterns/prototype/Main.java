package dec2023.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        /**
         * New Object Created!!
         */
        Student student = new Student();
        student.setClassName("A");
        student.setName("Sourabh");
        student.setRollNumber(20);


        System.out.println(student);

        /**
         * Prototype Created
         */
        Student student1 = student.clone();
        student1.setRollNumber(30);
        System.out.println(student1);
    }
}
