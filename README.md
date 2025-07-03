# String-Calculator-TDD

# Standard Mevan Folder Structure

├── src <br>
&emsp;├── main/java/org/example/calculator <br>
&emsp;&emsp;├── StringCalculator.java <br>
&emsp;├── test/java/org/example/calculator <br>
&emsp;&emsp;├── StringCalculatorTest.java <br>

This project is an implementation of the classic **String Calculator Kata**, developed using **Test-Driven Development (TDD)** practices. The goal is to incrementally build a calculator that can parse and sum numbers in a string with varying delimiters and constraints.

---

## ✅ Features (Incrementally Built)

1. Return `0` for empty string input.
2. Return the number itself for a single number.
3. Add two comma-separated numbers.
4. Support any number of comma-separated values.
5. Handle newlines (`\n`) as additional delimiters.
6. Support custom delimiters like `//;\n1;2`.
7. Throw exception on negative numbers.
8. Include **all** negative numbers in the exception message.

---

## 🧪 Test-Driven Development Strategy

Each functionality is developed in **two TDD steps**:
-Write a failing test first
-Implement minimal code to pass the test
-Refactor the implementation if needed

Each TDD step is committed separately
