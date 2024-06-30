package june2024.patterns.structural.composite;

public abstract class BaseBox implements Box {

    public int x;
    public int y;

    BaseBox(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void containsItem(){
        System.out.println("BaseBox contains ->" + x+y);
    }
}
