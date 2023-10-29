package learning.patterns.registery.prototype;

public class NoteBook {
    private int noOfPages;
    String typeOfPages;
    int price;
    String factPage;
    int length;
    int breath;
    boolean hardBound;
    int weight;

    public NoteBook() {
    }

    public NoteBook(NoteBook noteBook){
        this.noOfPages = noteBook.noOfPages;
        this.typeOfPages = noteBook.typeOfPages;
        this.price = noteBook.price;
        this.factPage = noteBook.factPage;
        this.length = noteBook.length;
        this.breath = noteBook.breath;
        this.hardBound = noteBook.hardBound;
        this.weight = noteBook.weight;
    }

    public NoteBook(int noOfPages, String typeOfPages, int price, String factPage, int length, int breath, boolean hardBound, int weight) {
        this.noOfPages = noOfPages;
        this.typeOfPages = typeOfPages;
        this.price = price;
        this.factPage = factPage;
        this.length = length;
        this.breath = breath;
        this.hardBound = hardBound;
        this.weight = weight;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getTypeOfPages() {
        return typeOfPages;
    }

    public void setTypeOfPages(String typeOfPages) {
        this.typeOfPages = typeOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFactPage() {
        return factPage;
    }

    public void setFactPage(String factPage) {
        this.factPage = factPage;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public boolean isHardBound() {
        return hardBound;
    }

    public void setHardBound(boolean hardBound) {
        this.hardBound = hardBound;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Call Copy Constructor & return new object.
     * @return
     */
    public NoteBook clone(){
        return new NoteBook(this);
    }
}
