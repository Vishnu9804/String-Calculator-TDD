﻿# String Calculator TDD

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
1.1 Return the number itself for a single number.  
1.2 Add two comma-separated numbers.  
2. Handle unknown amount of numbers.  
3. Handle newlines (`\n`) as additional delimiters along with commas.  
4. Support custom delimiters like `//;\n1;2`.  
5. Throw exception for negative numbers and include all of them in the error message.  
6. Ignore numbers greater than 1000.  
7. Allow single custom delimiters of **any length** like `//[***]\n1***2`.  
8. Allow **multiple custom delimiters** like `//[*][%]\n1*2%3`.  
9. Support multiple custom delimiters **with length longer than one character** like `//[**][%%%]\n1**2%%%3`.  

---

## 🧪 Test-Driven Development Strategy

Each functionality is developed in **two TDD steps**:

- **🔴:** Write a failing test first  
- **🟢:** Implement minimal code to pass the test

- **Refactor ⚙️:** Clean the implementation if needed

Each TDD step is committed separately, e.g.:

## 1 Empty string  
# 🔴 Failing test case for Empty String  
![Screenshot 2025-07-05 182600](https://github.com/user-attachments/assets/f5ac534f-725a-4575-9ca7-57b7f2cd45fa)  
# 🟢 Empty string test case passed  
![Screenshot 2025-07-05 182216](https://github.com/user-attachments/assets/53c64515-033b-4bad-89fa-532d2442ceff)  

## 1.1 Single number input  
# 🔴 Failing test case for single number input  
![Screenshot 2025-07-05 182149](https://github.com/user-attachments/assets/3d3b439c-6979-4627-bcc0-c2115f57687a)  
# 🟢 Test passed for single number input  
![Screenshot 2025-07-05 182100](https://github.com/user-attachments/assets/2b8b1db1-2be8-4b8c-9a05-6b2f530dbac1)  

## 1.2 Two number input  
# 🔴 Failing test case for input having two numbers  
![Screenshot 2025-07-05 182028](https://github.com/user-attachments/assets/bf535a3b-8209-4720-b0de-da4525601f36)  
# 🟢 Test passed for input having two numbers  
![Screenshot 2025-07-05 181901](https://github.com/user-attachments/assets/3e9c75ba-f8bf-4192-9786-b2d29221385e)  

# 2 Unknown amount amount of numbers  
# 🔴 Failing test case for unknown amount of numbers  
![Screenshot 2025-07-05 181835](https://github.com/user-attachments/assets/ad487704-00c3-4c1f-a013-da2cf0d28388)  
# 🟢 Test passed for input having unknown amount of numbers  
![Screenshot 2025-07-05 181720](https://github.com/user-attachments/assets/41f1b676-c13b-4f70-a19e-2769445ec559)  

# 3 Number separated by comma and newline  
# 🔴 Failing test case for input having numbers separated by comma and newline  
![Screenshot 2025-07-05 181553](https://github.com/user-attachments/assets/2a24c541-abef-4a44-b6be-e59a876b2207)  
# 🟢 Test passed for input having numbers separated by comma and newline  
![Screenshot 2025-07-05 181448](https://github.com/user-attachments/assets/b60dc1dc-1de3-4a9c-991f-7b63857b99cc)  

# 4 Custome delimiter  
# 🔴 Failing test case for custom delimiter  
![Screenshot 2025-07-05 181313](https://github.com/user-attachments/assets/f5234dee-7813-4958-a399-337fdb3d8d5e)  
# 🟢 Test passed for custome delimiter  
![Screenshot 2025-07-05 181202](https://github.com/user-attachments/assets/e9a783bd-821c-40e5-954b-7760a799a561)  

# 5 Exception for negative numbers  
# 🔴 Failing test case for input having negative numbers  
![Screenshot 2025-07-05 181123](https://github.com/user-attachments/assets/c5541c9d-2b9e-405e-ad60-0deba8bebd5e)  
# 🟢 Test passed for input having negative numbers  
![Screenshot 2025-07-05 173336](https://github.com/user-attachments/assets/ac4615f8-6b8e-4b0c-8f43-afb64631155b)  

# 6 Number greater than 1000  
# 🔴 Failing test case for input having number greater than 1000  
![Screenshot 2025-07-05 173301](https://github.com/user-attachments/assets/aabffd18-5019-4e88-9afc-d517bda8c001)  
# 🟢 Test passed for input having number greater than 1000  
![Screenshot 2025-07-05 173132](https://github.com/user-attachments/assets/7e50d205-1fd3-4e10-8b7c-63e1301e26b0)  

# 7 Delimiter of any length  
# 🔴 Failing test case for input having delimiter of any length  
![Screenshot 2025-07-05 173029](https://github.com/user-attachments/assets/e4ba307f-6f9f-4c75-874d-29f98c405350)  
# 🟢 Test passed for input having delimiter of any length  
![Screenshot 2025-07-05 172902](https://github.com/user-attachments/assets/acd785ab-c094-4caa-8a3c-b5e32c5ef62a)  

# 8 Multiple custom delimiter  
# 🔴 Failing test case for input having multiple custom delimiter  
![Screenshot 2025-07-05 172810](https://github.com/user-attachments/assets/7f582d9d-4c45-4269-99e0-3df28d81caad)  
# 🟢 Test case passed for input having multiple custom delimiter  
![Screenshot 2025-07-05 172611](https://github.com/user-attachments/assets/86416b14-cfe3-4c02-affa-55677b2f4de5)  

# 9 Mulitiple custome delimiter having length more than one character  
# 🔴 Failing test case for the input having mulitiple custome delimiter having length more than one character  
![Screenshot 2025-07-05 172338](https://github.com/user-attachments/assets/52a5d438-ab8b-473b-a545-4cf37edbc945)  
# 🟢 Test passed for the input having mulitiple custome delimiter having length more than one character  
![Screenshot 2025-07-05 172228](https://github.com/user-attachments/assets/8b527f71-5d87-4994-b683-22043c8c3150)  
