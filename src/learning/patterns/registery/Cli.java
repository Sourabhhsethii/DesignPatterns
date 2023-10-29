package learning.patterns.registery;

import learning.patterns.registery.prototype.NoteBook;

public class Cli {
    public static void main(String[] args) {
        //int noOfPages, String typeOfPages, int price, String factPage, int length, int breath, boolean hardBound, int weight
        NoteBook noteBookType1 = new NoteBook(1,"lines",30,"History",300,300,true,30);
        NoteBook noteBookType2 = noteBookType1.clone();
        noteBookType2.setHardBound(false);
        noteBookType2.setNoOfPages(200);
        noteBookType2.setPrice(150);

        NotebookRegistry notebookRegistry = new NotebookRegistry();
        notebookRegistry.register("linebooked",noteBookType1);
        notebookRegistry.register("nonLinedBook", noteBookType2);

        System.out.println("linebooked from registery & it's price "+notebookRegistry.get("linebooked").getPrice());
        System.out.println("nonLinedBook from registery & it's price "+notebookRegistry.get("nonLinedBook").getPrice());
    }
}
