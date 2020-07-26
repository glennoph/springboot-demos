package go.springboot.rest.restdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Value("${homeController.msg}")
    private String msg;

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return this.msg;
    }

}
