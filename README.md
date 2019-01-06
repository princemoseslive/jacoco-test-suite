# jacoco-test-suite
Jacoco Implementation

Jacoco is used to measure the code coverage of application.


## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes

``` 
git clone git@github.com:princemoseslive/jacoco-test-suite.git

mvn clean install package.

mvn test

```

## To see the output

Go to target directory and open index.html from jacoco-ut folder in browser

![alt text](https://github.com/princemoseslive/jacoco-test-suite/blob/master/Jacoco-image1.png)


Clicking on each method in above figure gives detailed report. Here it shows green coloured line indicating which line is covered by unit test.

![alt text](https://github.com/princemoseslive/jacoco-test-suite/blob/master/Jacoco-Image2.png)

## Built With
Maven 3.3.9
Java 8
