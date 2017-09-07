# wildfly-swarm-multiple-jaxrs-application-demo

WildFly Swarm Multiple JAX-RS Application Demo

## Build & Run

``` console
./mvnw clean package
java -jar target/wildfly-swarm-multiple-jaxrs-application-demo-swarm.jar 
```

## JAX-RS Resources

* http://localhost:8080/my-app/public
* http://localhost:8080/my-app/private

## Static Contents

* http://localhost:8080/my-app/
* http://localhost:8080/my-app/sub/sub.html