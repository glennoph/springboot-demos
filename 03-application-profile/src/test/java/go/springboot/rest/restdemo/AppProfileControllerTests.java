package go.springboot.rest.restdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AppProfileControllerTests {

	@Autowired
	private AppProfileController appProfile;

	@Test
	void contextLoads() {
		System.out.println("RestdemoApplicationTests.contextLoads");
		assertThat(appProfile).isNotNull();
	}

	@Test
	void checkAppProfileProperties() {
		System.out.println("checkAppProfileProperties");
		System.out.println(appProfile.home().toString());
		assertThat(appProfile.home().toString())
				.contains("development");
	}

	@Test
	void checkAppProfileMsg() {
		System.out.println("checkAppProfileMsg");
		System.out.println(appProfile.msg());
		assertThat(appProfile.msg().toString().contains("development properties message"));
	}


}
