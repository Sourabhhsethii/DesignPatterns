package dec2023.patterns.builder;

/**
 * Builder
 */
public class Teacher {
    String name;
    int teacherNumber;
    String testEnv;

    public
    Teacher(Builder builder) {
        this.name = builder.name;
        this.teacherNumber = builder.teacherNumber;
        this.testEnv = builder.testEnv;
    }

    public static Builder getBuilder(){
     return new Builder();
    }


    public static class Builder{
        String name;
        int teacherNumber;
        String testEnv;


        public Teacher build(){
            return new Teacher(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setTeacherNumber(int teacherNumber) {
            this.teacherNumber = teacherNumber;
            return this;
        }

        public Builder setTestEnv(String testEnv) {
            this.testEnv = testEnv;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", teacherNumber=" + teacherNumber +
                ", testEnv='" + testEnv + '\'' +
                '}';
    }
}
