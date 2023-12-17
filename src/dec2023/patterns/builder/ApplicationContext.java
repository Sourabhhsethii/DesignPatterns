package dec2023.patterns.builder;

import java.util.HashMap;

public class ApplicationContext {
    int serverPort;
    HashMap<String, Object> beanRegistery;
    HashMap<String, Object> beanPostProcessing;
    String envVariables;

    public ApplicationContext(Builder builder) {
        this.serverPort = builder.serverPort;
        this.beanRegistery = builder.beanRegistery;
        this.beanPostProcessing = builder.beanPostProcessing;
        this.envVariables = builder.envVariables;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    /**
     * Builder Inner Class
     */
    public static class Builder {
        int serverPort;
        HashMap<String, Object> beanRegistery;
        HashMap<String, Object> beanPostProcessing;
        String envVariables;

        public ApplicationContext build(){
            return new ApplicationContext(this);
        }

        public Builder setServerPort(int serverPort) {
            this.serverPort = serverPort;
            return this;
        }

        public Builder setBeanRegistery(HashMap<String, Object> beanRegistery) {
            this.beanRegistery = beanRegistery;
            return this;
        }

        public Builder setBeanPostProcessing(HashMap<String, Object> beanPostProcessing) {
            this.beanPostProcessing = beanPostProcessing;
            return this;
        }

        public Builder setEnvVariables(String envVariables) {
            this.envVariables = envVariables;
            return this;
        }
    }

    @Override
    public String toString() {
        return "ApplicationContext{" +
                "serverPort=" + serverPort +
                ", beanRegistery=" + beanRegistery +
                ", beanPostProcessing=" + beanPostProcessing +
                ", envVariables='" + envVariables + '\'' +
                '}';
    }
}
