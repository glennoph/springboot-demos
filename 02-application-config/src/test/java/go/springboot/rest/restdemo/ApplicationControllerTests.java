package go.springboot.rest.restdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationControllerTests {

	@Autowired
	private AppConfig appConfig;

	@Test
	void contextLoads() {
		System.out.println("RestdemoApplicationTests.contextLoads");
		assertThat(appConfig).isNotNull();
	}

	@Test
	void checkAppConfigProperties() {
		System.out.println("checkAppConfigProperties");
		System.out.println(appConfig.toString());
		assertThat(appConfig.toString())
				.contains("Application name");
	}

}
