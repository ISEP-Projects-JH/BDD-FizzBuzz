# FizzBuzz – TDD & BDD Example

[![CI](https://github.com/ISEP-Projects-JH/BDD-FizzBuzz/actions/workflows/ci.yml/badge.svg?branch=main)](https://github.com/ISEP-Projects-JH/BDD-FizzBuzz/actions/workflows/ci.yml)

## 📘 Overview

This project is a simple **student exercise** demonstrating the use of **TDD (Test-Driven Development)**   
and **BDD (Behavior-Driven Development)** through a classic example: **FizzBuzz**.

The implementation uses:

* **Java 21**
* **Cucumber (BDD)**
* **JUnit 4**
* **GitHub Actions CI**
* **TDD Cycle: Red → Green → Blue**

The project starts by defining behavior in **Gherkin**, generating failing tests (Red), implementing minimal solutions (
Green), and finishing with refactoring (Blue).

---

## 🧪 FizzBuzz Rules

* Multiples of **3** → `"Fizz"`
* Multiples of **5** → `"Buzz"`
* Multiples of **15** → `"FizzBuzz"`
* Otherwise, → return the number as a string

All behaviors are fully covered by Gherkin scenarios (`fizz_buzz.feature`).

---

## 👤 Author

**Zhenghan PEI**

---

## 🎯 Purpose

This repository serves as:

* A hands-on example of **TDD workflow**
* A demonstration of **BDD using Cucumber**
* A minimal, easy-to-understand template for students learning automated testing
