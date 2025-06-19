# Digital-Nurture-4.0-6372771

## Cognizant DN 4.0 - Java FSE Deepskilling Hands-On

This repository contains all the mandatory hands-on exercises completed as part of the **Cognizant Digital Nurture 4.0 (Java Full Stack Engineer)** Deepskilling program.

---

## Week 1 – Core Java and Design Principles

### Module 1: Design Patterns & Principles

---

### 1. Singleton Pattern
- **Exercise**: Logger implementation using the Singleton Design Pattern.
- **Objective**: Ensure that only one instance of the logger exists across the application.
- **Highlights**:
  - Thread-safe double-checked locking.
  - Lazy initialization.
  - Log methods with timestamp support.

 Folder: `Week1/Module1/Exercise1-SingletonPattern`  
 Key File: `Logger.java`, `LoggerTest.java`

---

### 2. Factory Method Pattern
- **Exercise**: Document creation using the Factory Method Design Pattern.
- **Objective**: Abstract the document creation logic for different types like Word, PDF, Excel.
- **Highlights**:
  - Common `Document` interface.
  - Factory classes for each document type.
  - Centralized testing through a factory-based instantiation approach.

Folder: `Week1/Module1/Exercise2-FactoryMethodPattern`  
Key Files: `Document.java`, `DocumentFactory.java`, `WordDocumentFactory.java`, etc.

---

## Module 2: Algorithmic Thinking & Java Implementation

---

### 3. E-commerce Platform Search Function
- **Exercise**: Implementation of search functionalities using Linear and Binary search.
- **Objective**: Develop efficient search for products in an e-commerce platform.
- **Highlights**:
  - `Product` class with fields: `productId`, `productName`, `productCategory`, `price`.
  - Linear search methods by ID, Name, Category, and Price.
  - Binary search methods with sorted arrays for optimized performance.
  - Hybrid binary + linear approach for price range queries.

Folder: `Week1/Module2/Exercise2-ECommercePlatformSearch`  
Key Files: `Product.java`, `ProductLinearSearch.java`, `ProductBinarySearch.java`, `ProductSearchTest.java`  
Discussion: `Exercise 02-discussion.docx`

---

### 4. Financial Forecasting
- **Exercise**: Predict future financial value using recursion.
- **Objective**: Forecast future value based on initial value and growth rate.
- **Highlights**:
  - Recursive implementation for compound growth.
  - Handles invalid inputs (negative values, unrealistic rates).
  - Clean and extensible design with Javadoc and validation.

Folder: `Week1/Module2/Exercise7-FinancialForecast`  
Key Files: `FinancialForecast.java`, `FinancialForecastTest.java`  
Discussion: `Exercise 07-discussion.docx`

---

## Notes:
- All exercises follow **OOP principles**, and the code is written using clean, modular Java.
- Discussions and complexity analyses are documented in `.docx` files inside respective folders.
- Git commits are maintained weekly with clear structure (`Week1/`, `Week2/`, ...).

---

 *More modules and hands-on exercises will be added as the program progresses.*
