package dec2023.patterns.builder;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = ApplicationContext.getBuilder().setServerPort(8080).build();
        System.out.println(applicationContext);
        System.out.println(ApplicationContext.getBuilder().setServerPort(9000).setEnvVariables("dev").build());
        System.out.println(Teacher.getBuilder().setName(
                "sourabh"
        ).setTestEnv("").setTeacherNumber(1).build());
    }
}
