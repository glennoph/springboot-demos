package go.springboot.rest.restdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties(prefix = "appconfig")
public class AppConfig {

    private String appName;
    private String appDescription;
    private String appFirstName;
    private String appEmail;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public String getAppFirstName() {
        return appFirstName;
    }

    public void setAppFirstName(String appFirstName) {
        this.appFirstName = appFirstName;
    }

    public String getAppEmail() {
        return appEmail;
    }

    public void setAppEmail(String appEmail) {
        this.appEmail = appEmail;
    }

    @Override
    public String toString() {
        return "ApplicationConfig{" +
                "appName='" + appName + '\'' +
                ", appDescription='" + appDescription + '\'' +
                ", appFirstName='" + appFirstName + '\'' +
                ", appEmail='" + appEmail + '\'' +
                '}';
    }
}
