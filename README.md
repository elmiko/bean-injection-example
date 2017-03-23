### Description
Example showing bean creation and its injection to the rest controller.

BeanInjectionApplication defines a bean of type MessageService. MessageController injects MessageService bean via its constructor and later uses it when handling requests. 



### Execution
1. Start the application:
```
mvn clean spring-boot:run
```
2. Invoke the service:
```
curl http://localhost:8080
```