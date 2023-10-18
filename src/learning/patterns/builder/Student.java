package learning.patterns.builder;

public class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String school;

    public  Student(Builder b){
        this.name = b.name;
        this.rollNumber = b.rollNumber;
        this.age = b.age;
        this.school = b.school;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    // getBuilder return object of builder class.
    public static Builder getBuilder(){
        return  new  Builder();
    }

    /**
     * Builder Inner Class Added.
     */
    public static class Builder{

        private String name;
        private int rollNumber;
        private int age;
        private String school;

        public  Student build(){
            return new Student(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }
    }


}
