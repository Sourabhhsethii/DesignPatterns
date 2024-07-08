package july2024.patterns.creational.builder;

public class BuilderPattern {

    private Integer number;
    private String name;

    static Builder getBuilder(){
        return new Builder();
    }

    public BuilderPattern(Builder builder){
        this.number = builder.number;
        this.name = builder.name;
    }

    public static class Builder {

        private Integer number;
        private String name;

        public BuilderPattern build(){

            return new BuilderPattern(this);

        }

        public Builder setNumber(Integer number) {
            this.number = number;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
