# Travelagency

This guide will help you run the Travel Agency task remotely on your local machine. The task involves implementing Java code to manage activities and destinations for a travel agency.

## Prerequisites

Before you begin, ensure you have the following installed on your system:

- Java Development Kit (JDK) version 8 or higher
- Git (optional, if you want to clone the repository)

## Setup Instructions

1. **Clone the Repository **
   

2. **Navigate to the Project Directory:**
   ```
   cd travelagency
   ```

3. **Ensure Required JAR File:**
   - Make sure you have the `junit-jupiter-api-5.10.2.jar` file placed in the `lib` directory.

4. **Compile the Java Code:**
   ```
   javac -cp "lib/*:bin" -d bin src/test/java/com/yourcompany/*.java
   ```

5. **Run the Tests:**
   ```
   java -cp "lib/*:bin" org.junit.platform.console.ConsoleLauncher --class-path bin --scan-class-path
   ```

6. **Review Test Results:**
   - Check the console output for test results.

7. **Make Changes and Iterate:**
   - Modify the Java files in the `src/test/java/com/yourcompany/` directory to implement required functionality.
   - Repeat steps 4-6 to compile, run tests, and review results iteratively.
  
## Project Structure
<img width="292" alt="Project Structure" src="https://github.com/shreyanshtri26/travelagency/assets/65079159/8366384c-d309-48bc-b4d3-8ddea88695e8">



- **src/test/java/com/yourcompany/:** Contains Java test files for the Travel Agency task.
- **lib/:** Directory to store required JAR files, including `junit-jupiter-api-X.X.X.jar`.
- **bin/:** Directory where compiled Java class files will be stored.

## High-level diagram

![High-level diagram](https://github.com/shreyanshtri26/travelagency/assets/65079159/787c04ea-a924-45ee-9712-d2b9be84e8d3)

## UML class diagram

![UML class diagram](https://github.com/shreyanshtri26/travelagency/assets/65079159/b46f3b54-5873-408b-9597-6057d6730f22)
## Implementation Details

- **Language Used:** Java programming language
- **Unit Testing:** Unit test cases should be written for every class using the JUnit framework.
- **Design Principles:** Each class should follow the [SOLID Design Principles](https://itnext.io/solid-principles-explanation-and-examples-715b975dcad4).
- **Clean Code Guidelines:** Code should adhere to [Clean Code Guidelines](https://gist.github.com/wojteklu/73c6914cc446146b8b533c0988cf8d29) with the exception of Dependency Injection, which can be skipped.
- **Unit Test Guidelines:** Follow [Unit Test guidelines](http://www.kyleblaney.com/junit-best-practices) for writing effective unit tests.
- **Code Documentation:** Proper [Java code documentation](https://www.tutorialspoint.com/java/java_documentation.htm) needs to be done for all classes and methods.

