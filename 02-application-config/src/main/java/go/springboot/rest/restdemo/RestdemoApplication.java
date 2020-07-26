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

		AppConfig appConfig = (AppConfig) ctx.getBean("appConfig");
		System.out.println(appConfig.toString());
	}


}
