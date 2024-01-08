package jan2024.patterns.iterator.solution;

import com.dxsys.patterns.behavioural.nov2023.mememto.History;
import jan2024.patterns.iterator.problem.BrowseHistory;

import java.util.ArrayList;
import java.util.List;

public class BroweHistory {

    private List<String> urls = new ArrayList<>();


    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        var lastIndex = urls.size() -1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return  lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }
    public class ListIterator implements Iterator {
        private BroweHistory history;
        private int index;

        public ListIterator(BroweHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index <history.urls.size());
        }

        @Override
        public Object current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
