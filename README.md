# 🧾 Employees Salary using Java

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java)](https://www.oracle.com/java/)
[![Build](https://img.shields.io/badge/Build-Manual-lightgrey)](https://github.com/Saadix-1/Employees-Salary-using-Java)

A simple object-oriented Java program that models employee salary calculations using inheritance and polymorphism.

---

## 📌 Project Description

This project demonstrates how to use **inheritance** and **class hierarchy** in Java to manage different types of employees and compute their salaries accordingly.

---

## 🎯 Objectives

- Apply the concept of **inheritance** to model employee types.
- Use **polymorphism** to calculate salaries dynamically based on employee contracts.
- Practice clean class design and object-oriented thinking.
- Understand how to design flexible and reusable software components.

---

## 📦 Project Structure

```plaintext
📁 Employees-Salary-using-Java
│
├── Employee.java     // Base class for all employees
├── Contract.java     // Subclass for contract-based employees
├── FullTime.java     // Subclass for full-time employees
├── Test.java         // Entry point to create and test employee objects
└── README.md
````

---

## 👷‍♂️ Classes Overview

* **Employee (abstract class)**
  Contains common attributes (name, ID) and an abstract method `calculateSalary()`.

* **FullTime (extends Employee)**
  Represents a full-time employee with fixed salary logic.

* **Contract (extends Employee)**
  Represents a contract employee paid based on hourly rate and hours worked.

* **Test.java**
  Creates employee objects, demonstrates polymorphic salary computation, and prints results.

---

## 🛠️ How to Run

Make sure you have **Java 17+** installed.

```bash
# Compile all files
javac *.java

# Run the test program
java Test
```

---

## 🧠 Concepts Used

* Inheritance
* Polymorphism
* Abstract classes and methods
* Method overriding
* Object instantiation and dynamic dispatch

---

## 🚀 Possible Extensions

* Add part-time or freelance employee types
* Save/load employee data from files
* Use interfaces instead of abstract base class
* Add unit tests for salary calculation

---

## Screenshots

<img width="1512" height="278" alt="Screenshot 2025-07-18 at 11 43 50" src="https://github.com/user-attachments/assets/754ea2b1-fae5-4a6c-a77c-5f593ff067e7" />

---

## 🙋‍♂️ Author

👤 **Saad Mehamdi**
📫 GitHub: [@Saadix-1](https://github.com/Saadix-1)

---
