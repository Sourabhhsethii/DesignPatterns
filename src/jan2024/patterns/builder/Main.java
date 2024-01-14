package jan2024.patterns.builder;

import java.math.BigInteger;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        var document = Document.getBuilder()
                .setDocContent("Test Builder")
                .setName("Doc1")
                .setId(BigInteger.valueOf(1000))
                .setUuid(UUID.randomUUID()).build();
        System.out.println(document.getDocContent());
        System.out.println(document.getName());
        System.out.println(document.getUuid());
    }
}
