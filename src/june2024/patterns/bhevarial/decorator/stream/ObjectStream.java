package june2024.patterns.bhevarial.decorator.stream;

public class ObjectStream extends BaseStream {
    BaseStream baseStream;

    public ObjectStream(BaseStream baseStream){
        this.baseStream = baseStream;
    }


    @Override
    Integer getStream() {
        Integer temp;
        if(baseStream != null){
            System.out.println("Added Object Stream");
            temp =  baseStream.getStream() + 2000001;
        } else {
            temp = 2000001;
        }
        return temp;
    }
}
