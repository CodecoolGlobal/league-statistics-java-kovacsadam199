# League statistics - JAVA projects using Maven

## What is it?
This project is a soccer league simulation.
Teams play with each other and there is a result scores are calculated using percentages and random numbers.
There is an ordered end result table.
The focus of the project was to practice lambda expressions and using Java 8 Stream API.

The test cases focus on different statistics like top scorers and other criteria which is solved with Streams.


#### Requirements:
- Java 11
- Maven 3.5.2
- Junit 5.5.2

#### How to run in linux terminal:
1. Go to project folder: league-statistics-java-kovacsadam199
2. mvn compile
3. mvn exec:java -Dexec.mainClass=com.codecool.leaguestatistics.Program
