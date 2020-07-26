package go.springboot.rest.restdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private String msg = "hello, world";

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return this.msg;
    }

}
