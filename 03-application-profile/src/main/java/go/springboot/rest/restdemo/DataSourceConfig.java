package go.springboot.rest.restdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {

    @Bean(name="datasource")
    @Profile("development")
    DataSource developmentDataSource() {
        return new DataSource("my-development-url", 1111);
    }

    @Bean(name="datasource")
    @Profile("test")
    DataSource testDataSource() {
        return new DataSource("my-test-url", 2222);
    }

}
