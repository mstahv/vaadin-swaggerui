# vaadin-swaggerui
Test project showing vaadin and swagger-ui not working

Simple Maven Spring Boot project created by Spring Boot Initializr with the following dependencies:
- Spring Web
- Vaadin


Adds a Rest Endpoint and a simple Model and Service (DemoRestService, Person, PersonService)
With Vaadin removed and springdoc-openapi-starter-webmvc-ui added to the dependencies, the swagger-ui is available at http://localhost:8080/swagger-ui.html
If I add vaadin and create a simple View and add "vaadin.exclude-urls=/api/**,/swagger-ui.html,/swagger-ui/**,/v3/**" to the application properties an error is shown.

Log is:
```
[nio-8080-exec-2] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.web.HttpRequestMethodNotSupportedException: Request method 'GET' is not supported]
```
And the error on the generic error page is:
```
Fri Jan 17 09:17:16 CET 2025
There was an unexpected error (type=Method Not Allowed, status=405).
```