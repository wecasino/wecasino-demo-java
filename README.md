

### references
- https://www.rabbitmq.com/tutorials/tutorial-one-spring-amqp


### run demo app

```sh

# brew reinstall openjdk
# brew info java
# sudo ln -sfn /usr/local/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk
# echo 'export PATH="/usr/local/opt/openjdk/bin:$PATH"' >> ~/.zshrc
# source ~/.zshrc

# brew install maven

mvn clean package

java -jar target/demo-0.0.1.jar

```