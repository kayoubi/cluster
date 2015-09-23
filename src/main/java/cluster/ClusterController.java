package cluster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Khaled Ayoubi
 */
@RestController
public class ClusterController {
    @Autowired
    private SessionBean sessionBean;

    @RequestMapping("/")
    @ResponseBody
    public String session(HttpServletRequest request) {
        return "Session Id : " + request.getSession().getId()
                + "</br> "
                + "Is it New Session :" + request.getSession().isNew()
                + "</br>"
                + "data: " + sessionBean.getData();
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestParam String data) {
        sessionBean.add(data);
        return sessionBean.getData();
    }
}
