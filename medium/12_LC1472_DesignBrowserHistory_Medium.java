import java.util.ArrayList;
import java.util.List;

class BrowserHistory {
    List<String> h = new ArrayList<>();
    int curr = 0, end = 0;

    public BrowserHistory(String homepage) {
        h.add(homepage);
    }
    
    public void visit(String url) {
        if (++curr < h.size()) h.set(curr, url);
        else h.add(url);
        end = curr;
    }
    
    public String back(int steps) {
        return h.get(curr = Math.max(0, curr - steps));
    }
    
    public String forward(int steps) {
        return h.get(curr = Math.min(end, curr + steps));
    }
}
