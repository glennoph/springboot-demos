# web-mvc application

## index.html 
* loc: resources/static
* a ref: /greeting

## GreetingController.java

* mapping: /greeting
* requestParam: name, dft world
* model.addAttribute: name
* return "greeting"

## greeting.html
loc: src/main/resources/templates/greeting.html
* thymeleaf
* returns:
Hello, $name

## Tests
1. SmokeTest 
   - assert that greetingController is not null
   
2. WebApplicationTests
   - mockMvc
   - perform /greeting
   - expect "Hello, world"