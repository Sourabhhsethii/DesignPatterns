package learning.patterns.registery;

import learning.patterns.registery.prototype.NoteBook;

import java.util.HashMap;
import java.util.Map;

/**
 * NoteBook Registry store prototype object of NoteBook
 */
public class NotebookRegistry {
    Map<String, NoteBook> noteBookMap = new HashMap<>();

    void register(String name, NoteBook noteBook){
        noteBookMap.put(name,noteBook);
    }

    NoteBook get( String name){
        return noteBookMap.get(name);
    }

}
