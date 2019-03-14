## awesome-bi

### Setting up

1. Install docker in order to start a PostgreSQL database

    https://docs.docker.com/install/linux/docker-ce/ubuntu/

Use the following image

    https://hub.docker.com/_/postgres
    
Start a postgres instance using

    $ docker run --name some-postgres -e POSTGRES_PASSWORD=password -p 5432:5432 -d postgres
    
Initialize the database locally with flyway (or to perform a migration)

    mvn flyway:migrate
    
At this point you should have your database up and running with a schema `dashboard`, `dashboard-app` user and
tables `data_source` and `data_table`

Create or edit the database creating additional SQL files prefixed by V#_ (e.g. V3_name.sql). 


2.Starting the application

    cd core && mvn spring-boot:run
    
3.Access

    http://localhost:8080
    http://localhost:8080/datasources
     

Swagger-UI is available at

    http://localhost:8080/swagger-ui.html
    
    

