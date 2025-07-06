# Digital-Nurture-4.0-6372771

## Cognizant DN 4.0 - Java FSE Deepskilling Hands-On

This repository contains all the mandatory hands-on exercises completed as part of the **Cognizant Digital Nurture 4.0 (Java Full Stack Engineer)** Deepskilling program.

---

## Week 1 – Core Java and Design Principles

### Module 1: Design Patterns & Principles

#### 1. Singleton Pattern
* **Exercise**: Logger implementation using the Singleton Design Pattern.
* **Objective**: Ensure that only one instance of the logger exists across the application.
* **Highlights**:
  * Thread-safe double-checked locking.
  * Lazy initialization.
  * Log methods with timestamp support.

**Folder**: `Week1/Module1/Exercise1-SingletonPattern`  
**Key Files**: `Logger.java`, `LoggerTest.java`

#### 2. Factory Method Pattern
* **Exercise**: Document creation using the Factory Method Design Pattern.
* **Objective**: Abstract the document creation logic for different types like Word, PDF, Excel.
* **Highlights**:
  * Common `Document` interface.
  * Factory classes for each document type.
  * Centralized testing through a factory-based instantiation approach.

**Folder**: `Week1/Module1/Exercise2-FactoryMethodPattern`  
**Key Files**: `Document.java`, `DocumentFactory.java`, `WordDocumentFactory.java`, etc.

---

### Module 2: Algorithmic Thinking & Java Implementation

#### 3. E-commerce Platform Search Function
* **Exercise**: Implementation of search functionalities using Linear and Binary search.
* **Objective**: Develop efficient search for products in an e-commerce platform.
* **Highlights**:
  * `Product` class with fields: `productId`, `productName`, `productCategory`, `price`.
  * Linear search methods by ID, Name, Category, and Price.
  * Binary search methods with sorted arrays for optimized performance.
  * Hybrid binary + linear approach for price range queries.

**Folder**: `Week1/Module2/Exercise2-ECommercePlatformSearch`  
**Key Files**: `Product.java`, `ProductLinearSearch.java`, `ProductBinarySearch.java`, `ProductSearchTest.java`  
**Discussion**: `Exercise 02-discussion.docx`

#### 4. Sorting Customer Orders
* **Exercise**: Sort orders by total price using sorting algorithms.
* **Objective**: Prioritize high-value orders by applying sorting techniques.
* **Highlights**:
  * `Order` class holds customer details and product list.
  * `OrderProduct` class encapsulates product details.
  * Implemented both **Bubble Sort** and **Quick Sort** based on `totalPrice`.
  * Demonstrates efficiency and time complexity difference between the two algorithms.

**Folder**: `Week1/Module2/Exercise3-SortingCustomerOrders`  
**Key Files**: `Order.java`, `OrderProduct.java`, `OrderTest.java`  
**Discussion**: `Exercise 03-discussion.docx`

#### 5. Financial Forecasting
* **Exercise**: Predict future financial value using recursion.
* **Objective**: Forecast future value based on initial value and growth rate.
* **Highlights**:
  * Recursive implementation for compound growth.
  * Handles invalid inputs (negative values, unrealistic rates).
  * Clean and extensible design with Javadoc and validation.

**Folder**: `Week1/Module2/Exercise7-FinancialForecast`  
**Key Files**: `FinancialForecast.java`, `FinancialForecastTest.java`  
**Discussion**: `Exercise 07-discussion.docx`

---

## Week 2 – Programming Languages

### Module 03 – PL/SQL Programming

#### 1. Exercise 1 – Control Structures
* **Highlights**:
  * Demonstrates conditional branching using `IF`, `ELSIF`, and `ELSE`.
  * Implements iterative logic using `LOOP`, `WHILE`, and `FOR`.
  * Shows the use of variables and control flow in PL/SQL blocks.

**Folder**: `Week 02-Programming Languages/Module 03-PLSQL Programming/Exercise 1 - Control Structures`

#### 2. Exercise 3 – Stored Procedures
* **Highlights**:
  * Creation of stored procedures using `CREATE PROCEDURE`.
  * Use of parameters with `IN`, `OUT`, and `IN OUT` modes.
  * Execution through anonymous PL/SQL blocks or SQL Developer.

**Folder**: `Week 02-Programming Languages/Module 03-PLSQL Programming/Exercise 3 - Stored Procedures`

---

### Module 04 – Test Driven Development and Logging Framework

#### 3. Exercise 01 – Setting Up JUnit
* **Highlights**:
  * Basic JUnit environment setup using Maven.
  * Simple test case to validate structure and execution.
  * Demonstrates use of `@Test` annotation and assertions.

**Folder**: `Week 02-Programming Languages/Module 04 – Test driven development and Logging framework/src/test/java/com/example/JUnit/Exercise_01_Setting_Up_JUnit`

#### 4. Exercise 03 – Assertions in JUnit
* **Highlights**:
  * Demonstrates usage of JUnit assertions:
    * `assertEquals`, `assertTrue`, `assertFalse`, `assertNull`, `assertNotNull`.
  * Validates various logical conditions in test cases.

**Folder**: `Week 02-Programming Languages/Module 04 – Test driven development and Logging framework/src/test/java/com/example/JUnit/Exercise_03_Assertions_in_JUnit`

#### 5. Exercise 04 – AAA Pattern & Fixtures
* **Highlights**:
  * Applies the Arrange-Act-Assert (AAA) testing pattern.
  * Uses `@Before` for setup and `@After` for teardown.
  * Ensures clean state between tests.

**Folder**: `Week 02-Programming Languages/Module 04 – Test driven development and Logging framework/src/test/java/com/example/JUnit/Exercise_04_AAA_and_Fixtures`

#### 6. Exercise 01 – Mocking and Stubbing (Mockito)
* **Highlights**:
  * Mocks external dependencies using Mockito.
  * Stubs method return values with `when().thenReturn()`.
  * Tests service behavior without relying on real implementations.

**Folder**: `Week 02-Programming Languages/Module 04 – Test driven development and Logging framework/src/test/java/com/example/Mockito/Exercise_01_Mocking_and_Stubbing`

#### 7. Exercise 02 – Verifying Interactions
* **Highlights**:
  * Ensures specific method calls were made with expected arguments.
  * Uses `Mockito.verify()` to validate interaction between classes.

**Folder**: `Week 02-Programming Languages/Module 04 – Test driven development and Logging framework/src/test/java/com/example/Mockito/Exercise_02_Verifying_Interactions`

#### 8. Exercise 01 – SLF4J Logging (Error & Warning Levels)
* **Highlights**:
  * Uses SLF4J with Logback for structured logging.
  * Demonstrates logging of `ERROR` and `WARN` levels.
  * Configured via Maven dependencies and simple Java class.

**Folder**: `Week 02-Programming Languages/Module 04 – Test driven development and Logging framework/src/main/java/com/example/SLF4J_Logging/Exercise_01_Logging_Error_Warning`

---

## Week 3 – Products and Frameworks

### Module 05 – Spring Core and Maven

---

#### LibraryManagement Maven Project

This single Maven project consolidates multiple Spring Core exercises under one structured application.

---

#### 1. Exercise 01 – Configuring a Basic Spring Application

* **Highlights**:
  - Spring configuration using annotations and/or XML.
  - Demonstrates bean creation and basic setup using `ApplicationContext`.
  - Includes `App.java` to bootstrap the application.

---

#### 2. Exercise 02 – Implementing Dependency Injection

* **Highlights**:
  - Uses both constructor-based and setter-based Dependency Injection (DI).
  - Clear separation of business logic and service layer (`repository`, `service` packages).
  - Demonstrates how Spring handles dependencies with minimal boilerplate.

---

#### 3. Exercise 04 – Creating and Configuring a Maven Project

* **Highlights**:
  - Complete Maven project setup with valid `pom.xml`.
  - Organized structure: `src/main/java`, `src/test/java`, `resources`.
  - Dependencies added for Spring Core and related modules.

**Folder**: `Week 03-Products and Frameworks/Module 05-Spring Core and Maven/LibraryManagement`  
**Key Files**:  
- `App.java` (Main application)  
- `repository/`, `service/` packages (Logic layers)  
- `Exercise_01`, `Exercise_02`, `Exercise_04` (Modular structure per task)  
- `pom.xml`


### Module 06 – Spring Data JPA with Spring Boot, Hibernate

---

#### 4. Exercise 01 – Country Repository with Spring Data JPA
* **Highlights**:
  * Used Spring Boot, JPA annotations, and Hibernate integration.
  * Defined a `Country` entity and repository interface.
  * Used `@Service`, `@Transactional`, and custom service layer to retrieve data.
  * Output verified using application runner and LiveReload console.

**Folder**: `Week 03-Products and Frameworks/Module 06-Spring Data JPA with Spring Boot, Hibernate/Exercise 01/orm-learn`

---

#### 5. Exercise 04 – JPA vs Hibernate vs Spring Data JPA (Comparison)
* **Highlights**:
  * Discusses the differences between:
    * Java Persistence API (JPA)
    * Hibernate ORM
    * Spring Data JPA
  * Includes detailed code comparison of Hibernate vs Spring Data JPA.
  * Created documentation as `.docx` with side-by-side examples.

**Folder**: `Week 03-Products and Frameworks/Module 06-Spring Data JPA with Spring Boot, Hibernate/Exercise 04`  
**File**: `Difference between JPA, Hibernate, and Spring Data JPA.docx`

---

## Notes

* All exercises follow **OOP principles**, and the code is written using clean, modular Java.
* Discussions and complexity analyses are documented in `.docx` files inside respective folders.
* Git commits are maintained weekly with clear structure (`Week1/`, `Week2/`, `Week3/`, ...).

---

*More modules and hands-on exercises will be added as the program progresses.*
