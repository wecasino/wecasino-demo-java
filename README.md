

### references
- https://www.rabbitmq.com/tutorials/tutorial-one-spring-amqp


### run receiver

```sh

mvn clean package

# consumer
java -jar target/rabbitmq-tutorials.jar --spring.profiles.active=hello-world,receiver

java -jar target/spring-amqp-0.1.0.jar

```