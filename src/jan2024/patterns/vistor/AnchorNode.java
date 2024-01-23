package jan2024.patterns.vistor;

public class AnchorNode implements HTMLCode{

    @Override
    public void execute(Operation operation) {
      operation.apply(this);
    }
}
