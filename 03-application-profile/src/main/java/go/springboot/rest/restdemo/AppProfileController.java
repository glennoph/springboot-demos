package go.springboot.rest.restdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppProfileController {
    @Value("${spring.profiles.active}")
    private String profile;

    @Value("${msg}")
    private String msg;

    @RequestMapping("/profile")
    public String home() {
        return profile;
    }

    @RequestMapping("/msg")
    public String msg() { return msg; }
}
