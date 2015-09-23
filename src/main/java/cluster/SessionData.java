package cluster;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Khaled Ayoubi
 */
public class SessionData implements Serializable {
    private List<String> data = new ArrayList<>();
    private String a;

    public void add(String s) {
        a = s;
        data.add(s);
    }

    public String getData() {
        return data.toString() + " recent: " + a;
    }

    @Override
    public String toString() {
        return getData();
    }
}
