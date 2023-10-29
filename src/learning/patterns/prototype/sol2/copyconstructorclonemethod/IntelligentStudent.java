package learning.patterns.prototype.sol2.copyconstructorclonemethod;

/**
 * Implement Copy Constructor + Clone Method
 */
public class IntelligentStudent extends Student implements Cloneable {
    int psp;

    public IntelligentStudent(int psp) {
        this.psp = psp;
    }

    public IntelligentStudent(int rollNumber, String name, int psp) {
        super(rollNumber, name);
        this.psp = psp;
    }

    public IntelligentStudent(IntelligentStudent is){
        super(is);
        this.psp = is.psp;
    }


    @Override
    public IntelligentStudent clone(){
        return  new IntelligentStudent(this);
    }
}
