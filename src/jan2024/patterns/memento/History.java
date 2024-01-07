package jan2024.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    /**
     * Push the elment in last -> Top
     * @param state
     */
    void push(EditorState state){
        states.add(state);
    }

    /**
     * Remove the last element from -> Top
     * @return
     */
    EditorState pop() {
        int length = states.size();
        EditorState state = null;
        if(length >1) {
            state = states.get(length - 1);
            states.remove(state);
        } else {
            state = states.get(0);
        }
        return state;
    }

}
