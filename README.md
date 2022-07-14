
<div style="display: flex; min-width: 100%; justify-content: center; align-items: center; align-content: center;">
    <img src="https://cdn-images-1.medium.com/max/800/1*gxXLMIuJDHCH7fwIgEP1cg.png" width="300px" alt="Spring Boot"/>
    <img src="https://graphql.org/img/og-image.png" width="300px" alt="Spring Boot"/>
</div>



# Project GraphQL

### Drescription
Project for studies GraphQL

## Run project

### Required:
* Java
* Docker instaled

### kafka
For database MySQL the code below should run
```node
 docker-compose up
```
### Projeto
Access the producer folder and execute the code below
```node
mvn install
```
After this, go to folder "target" and execute the command below
```node
java -jar graphql-0.0.1-SNAPSHOT.jar
```
> Your can access swagger ui in the address: http://localhost:8080/playground
