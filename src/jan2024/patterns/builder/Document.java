package jan2024.patterns.builder;

import java.math.BigInteger;
import java.util.UUID;

/**
 * Object Create responsibility is with build method!!!
 * Builder class User this keyword
 */
public class Document {

    private UUID uuid;
    private BigInteger id;
    private String name;
    private String docContent;

    public Document() {
    }

    Document(Builder builder) {
        this.uuid = builder.uuid;
        this.id = builder.id;
        this.docContent = builder.docContent;
        this.name = builder.name;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{

        private UUID uuid;
        private BigInteger id;
        private String name;
        private String docContent;

        public Document build(){
            return new Document(this);
        }

        public UUID getUuid() {
            return uuid;
        }

        public Builder setUuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public BigInteger getId() {
            return id;
        }

        public Builder setId(BigInteger id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getDocContent() {
            return docContent;
        }

        public Builder setDocContent(String docContent) {
            this.docContent = docContent;
            return this;
        }
    }

    public UUID getUuid() {
        return uuid;
    }

    public BigInteger getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDocContent() {
        return docContent;
    }

}
