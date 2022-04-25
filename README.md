# spring-profile
Profile setting for spring boot

# How to run 
Build with maven 

1. Go to target folder and find the jar
2. For dev mode: java -jar spring-profile-0.0.1-SNAPSHOT.jar
3. For prod mode: java -jar -Dspring.profiles.active=prod spring-profile-0.0.1-SNAPSHOT.jar


# After  that verify with 
2022-01-20 22:03:20.562  INFO 10188 --- [           main] o.r.c.profile.SpringProfileApplication   : The following profiles are active: prod
2022-01-20 22:03:23.064  INFO 10188 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 1005 (http)


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)