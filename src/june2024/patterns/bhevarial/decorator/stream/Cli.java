package june2024.patterns.bhevarial.decorator.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Cli {
    public static void main(String[] args) throws FileNotFoundException {
        //  Decorated Objects.
        System.out.println(new ObjectStream(new BufferReaderStream(new FileReaderStream())).getStream());
    }
}
