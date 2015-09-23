package cluster;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Khaled Ayoubi
 */
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionBean implements Serializable {
    private SessionData sessionData = new SessionData();
    private List<String> data = new ArrayList<>();

    public void add(String s) {
        data.add(s);
        sessionData.add(s);
    }

    public String getData() {
        return data.toString() + " / nested: " + sessionData.getData();
    }

    @Override
    public String toString() {
        return getData();
    }
}
