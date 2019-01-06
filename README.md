# jacoco-test-suite-docker
Jacoco Implementation

Jacoco is used to measure the code coverage of application.


## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes

``` 
git clone git@github.com:princemoseslive/jacoco-test-suite.git

git checkout docker

```

## How To Run

1. Compile the project with Maven first, as the class files need to be available for the Code Coverage Analysis:

   ```
   mvn clean package
   ```

1. Start the docker-compose stack.

   ```
   docker-compose up -d
   ```

1. Connect to the maven container and change to /app:

    ```
    docker exec -it jacobo_maven_1 bash
    bash-4.3# cd /app
    ```
1. Fetch the JaCoCo Dump:

    ```
    mvn jacoco:dump -Djacoco.address=app
    ```
    
1. Run the SonarQube Analysis:

    ```
    mvn sonar:sonar -Dsonar.host.url=http://sonar:9000
    ```
1. Access the SonarQube Analysis under http://localhost:9000 and see the coverage report. It should say 0% of your code is covered. 

![alt text](https://github.com/princemoseslive/jacoco-test-suite/blob/docker/Before-App-With-values.png)

1. Access the sample application under http://localhost:8888/jacoco-example. Do some math calculations to see the analysis work.

1. Fetch the JaCoCo Dump again:

    ```
    mvn jacoco:dump -Djacoco.address=app
    ```
1. Run the SonarQube Analysis again:

    ```
    mvn sonar:sonar -Dsonar.host.url=http://sonar:9000
    ```
1. Access the SonarQube Analysis under http://localhost:9000 and see the coverage report. 

![alt text](https://github.com/princemoseslive/jacoco-test-suite/blob/docker/After-App-With-Values.png)

![alt text](https://github.com/princemoseslive/jacoco-test-suite/blob/docker/After-App-with-Values-1.png)

![alt text](https://github.com/princemoseslive/jacoco-test-suite/blob/docker/After-App-with-Values-2.png)



## Built With
* Maven 3.3.9
* Java 8
