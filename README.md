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
  * Implemented both Bubble Sort and Quick Sort based on `totalPrice`.
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

#### LibraryManagement Maven Project

This single Maven project consolidates multiple Spring Core exercises under one structured application.

#### 1. Exercise 01 – Configuring a Basic Spring Application

* **Highlights**:
  * Spring configuration using annotations and/or XML.
  * Demonstrates bean creation and basic setup using `ApplicationContext`.
  * Includes `App.java` to bootstrap the application.

#### 2. Exercise 02 – Implementing Dependency Injection

* **Highlights**:
  * Uses both constructor-based and setter-based Dependency Injection (DI).
  * Clear separation of business logic and service layer (`repository`, `service` packages).
  * Demonstrates how Spring handles dependencies with minimal boilerplate.

#### 3. Exercise 04 – Creating and Configuring a Maven Project

* **Highlights**:
  * Complete Maven project setup with valid `pom.xml`.
  * Organized structure: `src/main/java`, `src/test/java`, `resources`.
  * Dependencies added for Spring Core and related modules.

**Folder**: `Week 03-Products and Frameworks/Module 05-Spring Core and Maven/LibraryManagement`  
**Key Files**:  
- `App.java` (Main application)  
- `repository/`, `service/` packages (Logic layers)  
- `Exercise_01`, `Exercise_02`, `Exercise_04` (Modular structure per task)  
- `pom.xml`

---

### Module 06 – Spring Data JPA with Spring Boot, Hibernate

#### 4. Exercise 01 – Country Repository with Spring Data JPA
* **Highlights**:
  * Used Spring Boot, JPA annotations, and Hibernate integration.
  * Defined a `Country` entity and repository interface.
  * Used `@Service`, `@Transactional`, and custom service layer to retrieve data.
  * Output verified using application runner and LiveReload console.

**Folder**: `Week 03-Products and Frameworks/Module 06-Spring Data JPA with Spring Boot, Hibernate/Exercise 01/orm-learn`

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

## Week 4 – Spring REST using Spring Boot

This week includes 6 mandatory hands-on exercises focusing on building RESTful web services with Spring Boot and implementing JWT-based authentication.

###  Module 7 - Spring REST using Spring Boot 3

#### 1. Exercise – Create a Spring Web Project using Maven
* **Objective**: Initialize a Spring Boot project using Maven.
* **Highlights**:
  * Basic Spring Boot project structure created using Maven.
  * Directory structure includes `src/main/java`, `resources`, and `test` folders.
  * Spring Boot starter dependencies configured in `pom.xml`.

#### 2. Exercise – Spring Core: Load Country from Spring Configuration XML
* **Objective**: Load a country bean defined in `country.xml` using Spring XML configuration.
* **Highlights**:
  * Demonstrates use of `ApplicationContext` to load Spring beans.
  * Reads multiple country beans (`IN`, `US`, `DE`, `JP`) from `country.xml`.
  * Uses SLF4J logging for output.

#### 3. Exercise – Hello World RESTful Web Service
* **Endpoint**: `GET /hello`
* **Objective**: Implement a simple REST controller that returns "Hello World!!".
* **Highlights**:
  * Controller: `HelloController`
  * Uses `@GetMapping` and returns plain text.
  * Includes `START` and `END` debug logs.

#### 4. Exercise – REST: Country Web Service
* **Endpoint**: `GET /country`
* **Objective**: Return India (`IN`) country details as JSON.
* **Highlights**:
  * Controller: `CountryController`
  * Loads country bean from XML config.
  * Uses Jackson for automatic JSON conversion.

#### 5. Exercise – REST: Get Country Based on Country Code
* **Endpoint**: `GET /countries/{code}`
* **Objective**: Return country by code in a case-insensitive manner.
* **Highlights**:
  * Retrieves country list from `country.xml`.
  * Filters using a case-insensitive match.
  * Returns matching `Country` object or `null`.

#### 6. Exercise – Create Authentication Service that Returns JWT
* **Endpoint**: `GET /authenticate`
* **Objective**: Generate and return a JWT token upon successful basic authentication.
* **Highlights**:
  * Controller: `AuthenticationController`
  * Uses Spring Security and JWT libraries.
  * Credentials passed via `curl -u username:password`.
  * Returns a valid JWT token in JSON format.

**Folder**: `Week 04-Spring REST using Spring Boot/spring-learn`  
**Key Files**:
- `SpringLearnApplication.java`
- `Country.java`, `country.xml`
- `controller/HelloController.java`, `CountryController.java`, `AuthenticationController.java`
- `service/CountryService.java`
- `config/SecurityConfig.java`
- `application.properties`

---

## Week 5 – Microservices Architecture

This week focuses on designing and implementing **independent microservices** using **Spring Boot** and RESTful principles.

### Module 08 – Microservices with Spring Boot

#### 1. Exercise – Create `account` and `loan` microservices

* **Objective**: Build two independent Spring Boot microservices to demonstrate microservice architecture.

* **Microservices**:
  - `account` service (port: 8080)
    - Endpoint: `GET /accounts/{accountNumber}`
    - Returns account details in JSON.
  - `loan` service (port: 8081)
    - Endpoint: `GET /loans/{loanNumber}`
    - Returns loan details in JSON.

* **Highlights**:
  - Each service has its own Spring Boot project, `pom.xml`, and `application.properties`.
  - Follows RESTful design:
    - Stateless interactions
    - Resource-oriented URLs
    - JSON-based responses
  - Demonstrates basic microservice principles:
    - Independent deployability
    - Separation of concerns
    - Lightweight HTTP communication

* **Folder Structure**:
```
Week 05-Microservices/  
├── account/  
│ ├── src/  
│ ├── pom.xml  
│ └── application.properties (port: 8080)  
├── loan/  
│ ├── src/  
│ ├── pom.xml  
│ └── application.properties (port: 8081)  
```
* **Discussion**:
  - Even though each service has only one or two endpoints, they are still **valid microservices** because they are independently deployable and focused on distinct business functions.
  - They qualify as **REST APIs** because they follow REST conventions: use of HTTP verbs, statelessness, and structured responses using JSON.

**Folder**: `Week 05-Microservices/`  

---
## Week 6 – Single Page Application Framework - React

This week focuses on building modern front-end applications using **ReactJS**. Exercises include basic rendering, routing, props, styling, lifecycle methods, and data fetching.

---

### Module 10 – Single Page Application Framework - React

#### 1. Exercise – My First React App

* **App Name**: `myfirstreact`
* **Objective**: Create a basic React app to render a welcome message.
* **Highlights**:
  * Create the app using `create-react-app`.
  * Modify `App.js` to display:
    ```jsx
    <h1>Welcome the first session of react</h1>
    ```

**Folder**: `Week 06-ReactJS/Module 10-SPA Framework - React/myfirstreact`

---

#### 2. Exercise – Student Management Pages

* **App Name**: `studentapp`
* **Objective**: Create and render multiple components (`Home`, `About`, `Contact`) with appropriate content.
* **Highlights**:
  * Each component displays:
    ```jsx
    <h3>Welcome to [page name] page of student management portal</h3>
    ```
  * Components imported and rendered in `App.js`.

**Folder**: `Week 06-ReactJS/Module 10-SPA Framework - React/studentapp`

---

#### 3. Exercise – Score Calculator with Styling

* **App Name**: `scorecalculatorapp`
* **Objective**: Create a styled component that calculates and displays a student's score.
* **Highlights**:
  * `CalculateScore.js` component in `components/`
  * Styling handled in `Stylesheets/CalculateScore.css`
  * Uses props: `name`, `school`, `total`, and `goal`
  * Calculates percentage dynamically and styles each section differently.

**Folder**: `Week 06-ReactJS/Module 10-SPA Framework - React/scorecalculatorapp`

---

#### 4. Exercise – Display Blog Posts with Lifecycle Hooks

* **App Name**: `blogapp`
* **Objective**: Fetch and display blog posts from an API using lifecycle methods.
* **Highlights**:
  * `Post.js` – Class definition for post data.
  * `Posts.js` – Class-based component.
    * Uses `componentDidMount()` to fetch from `https://jsonplaceholder.typicode.com/posts`
    * Displays title and body of each post.
    * Handles errors using `componentDidCatch()`.

**Folder**: `Week 06-ReactJS/Module 10-SPA Framework - React/blogapp`

---

#### 5. Exercise – Styling Cohort Dashboard with CSS Modules

* **App Name**: `cohorttracker`
* **Objective**: Style a React component using both CSS modules and inline styles.
* **Highlights**:
  * `CohortDetails.js` displays cohort info.
  * Uses `CohortDetails.module.css` for styling `.box` container and `<dt>` tags.
  * Inline styling applied to `<h3>`:
    - Green text for `status === "ongoing"`
    - Blue text otherwise

**Folder**: `Week 06-ReactJS/Module 10-SPA Framework - React/cohorttracker`

---

## Week 07 – React Projects

This week focuses on hands-on React.js development, covering component design, conditional rendering, event handling, UI styling, and modern dashboard layouts. Each exercise demonstrates a different aspect of React best practices.

### Exercise 1: CricketApp (`cricketapp`)
- **Features:**
  - Lists cricket players with scores and teams.
  - Demonstrates conditional rendering between components (List of Players, Indian Players).
  - Uses ES6 features: array map/filter, destructuring, and spread operator.
  - Includes left-aligned, clean UI with toggle functionality.

### Exercise 2: OfficeSpaceRentalApp (`officespacerentalapp`)
- **Features:**
  - Displays a list of office spaces with images, rent, and addresses.
  - Conditional CSS styling for rent values (red/green based on threshold).
  - Card-based layout using flexbox for modern appearance.

### Exercise 3: EventExamplesApp (`eventexamplesapp`)
- **Features:**
  - Interactive Counter component demonstrating state and event handling.
  - Currency Converter with input/select and conversion logic.
  - Demonstrates use of inline styles and controlled components.

### Exercise 4: TicketBookingApp (`ticketbookingapp`)
- **Features:**
  - Login/logout flow with User and Guest views.
  - Conditional rendering using multiple techniques.
  - Modern, centered UI with color themes and styled buttons.

### Exercise 5: BloggerApp (`bloggerapp`)
- **Features:**
  - Three-column dashboard layout for Course, Book, and Blog details.
  - Modern, responsive styling with CSS and flexbox.
  - Demonstrates component composition and UI structuring for dashboards.

----

Each project is self-contained in its respective folder under `Week 07-React/Exercise N/`, and can be run independently using `npm start` in the appropriate app directory. These exercises provide a comprehensive introduction to real-world React development and UI techniques.

---

## Notes

* All exercises follow object-oriented principles and modular Java practices.
* Maven is used for dependency and project management.
* Documentation and discussions are available as `.docx` files inside each module/folder.
* Git history is maintained with weekly and modular segregation (`Week1/`, `Week2/`, `Week3/`, `Week4/`, etc.).

---

*More modules and hands-on exercises will be added as the program progresses.*
