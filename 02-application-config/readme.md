# 02-application-config 
Update values in pojo from yaml file
## pojo class: AppConfig
* add `@ConfigurationProperties(prefix = "appconfig")`
* appconfig is section in yaml file
* the values of the pojo data come from the application.yml file
## resources/application.yml file
* contains 
```
appconfig:
  app-name: Application name
  app-description: ${appconfig.app-name} is a spring boot component
  app-first-name: joe
  app-email: joe@springboot.org
```