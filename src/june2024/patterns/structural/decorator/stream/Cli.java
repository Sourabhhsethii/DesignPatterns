package june2024.patterns.structural.decorator.stream;

import java.io.FileNotFoundException;

public class Cli {
    public static void main(String[] args) throws FileNotFoundException {
        //  Decorated Objects.
        System.out.println(new ObjectStream(new BufferReaderStream(new FileReaderStream())).getStream());
    }
}
