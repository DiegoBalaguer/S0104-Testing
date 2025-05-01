# S01.04-Testing

---

## 📋 Description

- Use **Eclipse** or **IntelliJ** for all exercises.
- Follow the **best practices** document from **Sprint 0** to meet delivery requirements on GitHub repositories.
- You may create **Maven**, **Gradle**, or plain **Java** projects.
- ✍️ **Code in English**

---

# 🎯 Objectives

- Learn to work with the JUnit and AssertJ assertion libraries, as well as get introduced to Test-Driven Development (TDD).


---

## 🔹 Level 1: JUnit

### 📘 Exercise 1 - Library Management

Create a Java class to manage a collection of books in a library. The class should support the following operations:

- Add books to the collection
- Retrieve the full list of books
- Get the title of a book by its position
- Insert a book at a specific position
- Remove a book by title

🧪 Write JUnit tests to validate:

- The book list is not null after creating a new object
- The list has the expected size after adding several books
- The list contains a specific book at the correct position
- No duplicate titles exist in the list
- You can retrieve a book title by a specific position
- Adding a book correctly updates the list
- Removing a book decreases the list size
- The list remains sorted alphabetically after adding/removing books

---

### 📘 Exercise 2 - DNI Letter Calculation

- Create a class `CalculoDni` that calculates the corresponding letter for a DNI number.
- Create a parameterized JUnit test to verify the calculation against 10 predefined DNI numbers.

---

### 📘 Exercise 3 - Exception Handling

- Create a class with a method that throws an `ArrayIndexOutOfBoundsException`.
- Verify this behavior using a JUnit test.

---

## 🔹 Level 2: AssertJ

Create Java classes and/or tests demonstrating the following assertions:

### 📘 Exercise 1

- Assert that two integers are equal
- Assert that two integers are not equal

#### 📘 Exercise 2

- Assert that two object references are the same
- Assert that two object references are different

### 📘 Exercise 3

- Assert that two integer arrays are identical

### 📘 Exercise 4

- Create an ArrayList containing objects of different types (custom objects)
- Assert the order of objects in the list as inserted
- Assert the list contains the objects in any order
- Assert one object is included only once
- Assert that an element not added does not exist in the list

### 📘 Exercise 5

- Create a map and assert that it contains a specific key

### 📘 Exercise 6

- Throw an `ArrayIndexOutOfBoundsException` and assert it is thrown correctly

### 📘 Exercise 7

- Create an empty `Optional` and assert that it is indeed empty

---

## 🔹 Level 3: Test-Driven Development (TDD)

### 📘 Exercise 1 - Calculator

Develop a `Calculator` class following TDD:

- Create a test class `CalculatorTest`
- Write tests for `add`, `subtract`, `multiply`, and `divide` methods
- Run the tests (they should fail at first)
- Implement the methods in the `Calculator` class
- Re-run the tests and make them pass
- Iterate: improve the functionality, refactor code, and expand tests using the TDD cycle

---

# 💻 Technologies Used

- Java
- JUnit
- AssertJ
- Maven or Gradle
- Git & GitHub

---

# 📋 Requirements

To run this project, you need:

- Java Development Kit (JDK) 21 or higher
- An IDE like IntelliJ IDEA, Eclipse, or VS Code with Java and Maven/Gradle support
- Git

---

# 🛠️ Installation

1. Ensure **JDK 21** or higher is installed.
2. Clone this repository:
   ```sh
   git clone <https://github.com/your-username/S0104-Testing.git>
   ```
3. Open the project in your preferred IDE.
4. Run the test classes using the IDE or command line.

---

# ▶️ Execution

1. To run tests from the command line (Maven):
   ```sh
   mvn test
   ```

2. To run tests in your IDE:
   - Navigate to the test classes
   - Right-click and select **Run tests**

---

# 🌐 Deployment

This project is intended for local development and testing purposes. No deployment is necessary.

---

## ▶️ Execution


To run the project:

    Locate the class with the main() method.

    Right-click and run it, or use terminal:
```bash
    java Main
	```

💡 Make sure main() is correctly set as the entry point, especially when using build tools.

---

## 📦 Repository

You can find the source code on GitHub:
🔗 https://github.com/DiegoBalaguer/S0104-Testing.git

---

## ✅ Author Notes

These exercises will help you understand and practice working with Java Collections.
Fork it, test it, and extend it as much as you want!

Happy coding! 🚀"# S0104-Testing" 
