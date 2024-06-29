package june2024.patterns.bhevarial.decorator.stream;

import java.io.FileOutputStream;

public class FileReaderStream extends BaseStream {

    BaseStream stream;

    public FileReaderStream() {
        System.out.println("File Stream Created");
    }

    public FileReaderStream(BaseStream baseStream) {
        this.stream = baseStream;
    }

    @Override
    Integer getStream() {
        Integer st;
        if(stream != null) {
            System.out.println("Added File Stream Added");
            st = stream.getStream() + 10_00;
        } else {
            st = 10_00;
            System.out.println("Added File Stream Added");
        }
        return st;
    }

    @Override
    public String toString() {
        return "FileReaderStream{" +
                "stream=" + stream +
                '}';
    }
}
