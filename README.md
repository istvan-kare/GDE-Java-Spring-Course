# Java & Spring Lessons

## 1. Introduction to Java Programming

#### 1.1 Introduction
#### 1.2 History and evolution of Java
  - Java was created by James Gosling and his team at Sun Microsystems in 1995
#### 1.3 Installing the Java Development Kit (JDK)
  - At least Java 17 is required, commands need to be added to PATH variable
#### 1.4 Setting up your development environment (IDE setup)
  - Intellij works out of the box when creating a new Java project - using gradle is recommended for future additions for spring dependencies
#### 1.5 Understanding the Java Virtual Machine (JVM)
#### 1.6 Writing your first Java program 
  - Basic “Hello World” application, brief explanation of the main function
  - Compiling and running Java applications 
  - Navigate to file location in command line
  - Compile with: `javac com.gde.spring.JavaSpringApplication.java`
  - Run compiled class with: `java com.gde.spring.JavaSpringApplication`
  - Easier method is just pressing the green play icon next to the main function in IntelliJ
#### 1.7 Summary: 
  - Overview of Java documentation and resources
    - Use Oracle's [Java Documentation](https://docs.oracle.com/en/java/) for reference.
  - Java Editions: SE, EE, ME
    - Java SE (Standard Edition) for desktop and server applications. 
    - Java EE (Enterprise Edition) for large-scale enterprise applications. 
    - Java ME (Micro Edition) for mobile and embedded devices.

## 2. Java Basics: Syntax and Structure
#### 2.1 Introduction
#### 2.2 Basic syntax and structure of a Java program
  - Explain basic syntax, and package-path relations
#### 2.3 Java data types and variables
  - Operators and expressions
#### 2.4 Control flow statements: if-else, switch
#### 2.5 Looping constructs: for, while, do-while
#### 2.6 Methods: declaration and invocation
  - Parameter passing and return values
#### 2.7 Scope and lifetime of variables
#### 2.8 Summary

## 3. Object-Oriented Programming in Java
#### 3.1 Introduction
#### 3.2. Principles of Object-Oriented Programming (OOP)
  - Encapsulation, Inheritance, Polymorphism, and Abstraction
#### 3.3. Defining Classes and Creating Objects
  - Constructors and Initialization
#### 3.4. Inheritance: Extending Classes
- Polymorphism: method overriding and overloading
#### 3.5. Encapsulation: Access Modifiers and Properties
#### 3.6. Abstract Classes and Methods
#### 3.7 Interfaces and Implementation
#### 3.8 Summary

## 4. Exception Handling in Java
#### 4.1 Introduction
#### 4.2 Introduction to exceptions and error handling
- Exceptions represent errors that can occur during program execution
#### 4.3 Types of exceptions: checked and unchecked
- Checked exceptions: `IOException` 
- Unchecked exceptions: `ArrayIndexOutOfBoundsException`
#### 4.4 Using try-catch blocks
- `finally` block and its usage
#### 4.5 Throwing exceptions: throw and throws keywords
#### 4.6 Creating custom exception classes
#### 4.7 Best practices for exception handling
- Use specific exception types.
- Log exceptions.
- Do not swallow exceptions.
#### 4.8 Understanding the stack trace
#### 4.9 Summary

## 5. Java Collections Framework
#### 5.1 Introduction
#### 5.2 Overview of the Collections Framework
- Collections framework provides various classes and interfaces to store and manipulate groups of data
#### 5.3 List interface and ArrayList/LinkedList implementations
#### 5.4 Set interface and HashSet/TreeSet implementations
#### 5.5 Map interface and HashMap/TreeMap implementations
#### 5.6 Using Iterators and enhanced for loop
#### 5.7 Sorting and searching collections
#### 5.8 Summary

## 6. Java I/O and File Handling
#### 6.1 Introduction
- Java provides `java.io` and `java.nio` packages for I/O operations.
#### 6.2 Byte streams and character streams
- Reading from and writing to files - `BufferedReader` and `BufferedWriter`
#### 6.3 Serialization and deserialization
#### 6.4 Working with Java NIO (New I/O)
#### 6.5 File handling with the File class
#### 6.6 Exception handling in I/O operations
#### 6.7 Summary

## 7. Introduction to Spring Boot
- Overview of the Spring Framework
- Core concepts of Spring Boot
- Setting up a Spring Boot project
- Spring Boot starters and dependencies
- Exploring the Spring Boot project structure
- Configuring Spring Boot applications
- Introduction to Spring Boot annotations
- Running a Spring Boot application

## 8. Building RESTful APIs with Spring Boot
- Introduction to REST architecture
- Creating REST controllers in Spring Boot
- Handling HTTP methods: GET, POST, PUT, DELETE
- Mapping requests with @RequestMapping and @GetMapping
- Request parameters and path variables
- ResponseEntity and handling responses
- Error handling in REST APIs
- Testing REST APIs with Postman

## 9. Spring Boot Data Access with Spring Data JPA
- Introduction to Spring Data JPA
- Configuring data sources and database connections
- Defining entity classes and primary keys
- Creating repositories with Spring Data JPA
- Using CRUD operations: save, find, delete
- Custom query methods and @Query annotation
- Pagination and sorting
- Using H2 in-memory database for testing

## 10. Spring Boot Security: Authentication and Authorization
- Overview of Spring Security
- Implementing basic authentication
- Configuring security with Spring Boot
- Securing REST endpoints
- Role-based access control
- Introduction to OAuth2
- Integrating JWT for stateless authentication
- Best practices for securing applications

## 11. Spring Boot Configuration and Profiles
- Understanding Spring Boot configuration
- Using application.properties and application.yml
- Configuring beans with @Configuration and @Bean
- Environment-specific configurations with profiles
- Externalizing configuration with @Value
- Using @Profile for conditional beans
- Spring Boot configuration properties
- Best practices for managing configurations

## 12. Spring Boot Testing and Performance Tuning
- Introduction to testing in Spring Boot
- Writing unit tests with JUnit and Mockito
- Creating integration tests with Spring Test
- Using @SpringBootTest annotation
- Test slicing with @WebMvcTest and @DataJpaTest
- Introduction to Spring Boot Actuator
- Monitoring application health with Actuator
- Performance tuning techniques and best practices

