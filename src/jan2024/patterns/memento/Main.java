package jan2024.patterns.memento;

/**
 *  Memento Pattern !!!
 *  It store the History of the content!!!!
 *  Problem -> How to Store history of content.
 */
public class Main {
    public static void main(String[] args) {

        var editor = new Editor();
        var history = new History();

        editor.setContent("Test");
        editor.setColour("Red");
        editor.setFont("Arial");
        editor.setTitle("Test Doc");

        /**
         * Push State First
         */
        history.push(editor.createState());

        /**
         * Push State Second
         */

        editor.setFont("Arial2");
        editor.setTitle("Test Doc Again 1 ");
        history.push(editor.createState());

        editor.restoreState(history.pop());
        editor.restoreState(history.pop());

        /**
         * Push State Third
         */

        editor.setFont("Arial2");
        editor.setTitle("Test Doc Again 2");
        history.push(editor.createState());


        editor.setFont("Arial2");
        editor.setTitle("Test Doc Again 3");
        history.push(editor.createState());
        editor.restoreState(history.pop());
        System.out.println(editor.getTitle());
        editor.restoreState(history.pop());
        System.out.println(editor.getTitle());
        editor.restoreState(history.pop());

        System.out.println(editor.getTitle());


    }
}
