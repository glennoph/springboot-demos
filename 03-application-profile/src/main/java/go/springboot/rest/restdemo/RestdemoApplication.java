package go.springboot.rest.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class RestdemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(RestdemoApplication.class, args);

		AppProfileController appProfile = (AppProfileController) ctx.getBean("appProfile");
		System.out.println(appProfile.toString());

	}


}
