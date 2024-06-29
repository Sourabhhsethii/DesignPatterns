package june2024.patterns.bhevarial.decorator.stream;

public class BufferReaderStream extends BaseStream {

    BaseStream baseStream;

    public BufferReaderStream(BaseStream bs){
        baseStream = bs;
    }

    @Override
    Integer getStream() {
        Integer st;
        if(baseStream != null){
            System.out.println("Buffered Stream Added");
            st = baseStream.getStream() + 10_100;
        } else {
            st = 10_10;
        }
        return st;
    }

    @Override
    public String toString() {
        return "BufferReaderStream{" +
                "baseStream=" + baseStream +
                '}';
    }
}
