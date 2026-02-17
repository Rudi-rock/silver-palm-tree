# OOPS Banner Application - Use Cases Documentation

## Overview
This project demonstrates progressive Java programming concepts through four use cases (UC1-UC4), each building upon previous implementations to create an "OOPS" banner display with increasing levels of sophistication and code optimization.

---

## Branches
Each use case has a dedicated branch for version control:
- **uc1/print-statement**: UC1 - Basic Print Statement
- **uc2/string-concatenation**: UC2 - ASCII Art with String Concatenation
- **uc3/string-join**: UC3 - ASCII Art with String.join()
- **uc4/arrays-loops**: UC4 - Arrays and Enhanced For-Loops

---

## Use Case Details

### UC1: Print "OOPS" - Foundational Step
**Branch**: `uc1/print-statement`  
**What was done:**
- Created a basic Java class with the `main()` method
- Demonstrated fundamental Java concepts:
  - Class as a container for logic
  - Main method as the application entry point
  - Static keyword and method invocation
  - String literals and `System.out.println()`
- Output: Simple "OOPS" text

**Key Learning:**
- Introduction to Java program structure
- Understanding how Java executes code from the main method
- Basic console output using `System.out.println()`

**Output:**
```
OOPS
```

---

### UC2: OOPS Banner with ASCII Art
**Branch**: `uc2/string-concatenation`  
**What was done:**
- Extended UC1 to create a visual ASCII art banner spelling "OOPS"
- Rendered a 7-line grid of asterisks (*) and spaces
- Used manual string concatenation with the `+` operator
- Sequential print statements for precise alignment
- Multi-line console banner formatting

**Key Learning:**
- String concatenation and manipulation
- ASCII art rendering concepts
- Precision formatting for console output
- Understanding character-based UI design

**Output:**
```
OOPS

 ****  ****  ***** ***** 
*    **    **    **     
*    **    **    **     
*    **    ****  ***** 
*    **    *         *
*    **    *         *
 ****  ****  *      ***** 
```

---

### UC3: ASCII Art Banner with String.join()
**Branch**: `uc3/string-join`  
**What was done:**
- Refactored UC2 to use the `String.join()` method instead of manual concatenation
- Improved code readability and maintainability
- Used `String.join(" ")` for lines with spaces between elements
- Used `String.join("")` for lines with no spaces between elements
- Eliminated redundant `+` operators

**Key Learning:**
- Introduction to the `String.join()` utility method
- Benefits of using built-in methods over manual string concatenation
- Cleaner and more professional code formatting
- String method selections based on requirements

**Output:**
```
OOPS

 ****   ****   *****   ***** 
*     **    **    **     
*     **    **    **     
*     **    *****  ***** 
*     **    *          *
*     **    *          *
 ****   ****  *      ***** 
```

---

### UC4: OOPS Banner with Arrays and Loops
**Branch**: `uc4/arrays-loops`  
**What was done:**
- Refactored UC3 to use arrays and enhanced for-loops
- Created a `String[] bannerLines` array to store all 7 banner lines
- Used enhanced for-loop (`for-each` loop) to iterate and print each line
- Improved modularity and code reusability
- Significantly reduced code repetition
- Better separation of data from logic/presentation

**Key Learning:**
- Collection data structures (Arrays)
- Enhanced for-loops and iterative control flow
- Modularity and code organization principles
- Data-driven programming approach
- Scalability for future enhancements

**Code Structure:**
```java
String[] bannerLines = {
    // 7 banner lines stored centrally
};

for (String line : bannerLines) {
    System.out.println(line);
}
```

**Output:**
```
OOPS

 ****   ****   *****   ***** 
*    **    **    **     
*    **    **    **     
*    **    *****  ***** 
*    **    *          *
*    **    *          *
 ****   ****  *      ***** 
```

---

## Progression Summary

| Aspect | UC1 | UC2 | UC3 | UC4 |
|--------|-----|-----|-----|-----|
| **Concept** | Basic Print | String Concat | String.join() | Arrays & Loops |
| **Code Lines** | 4 | 8 | 8 | 15+ |
| **Maintainability** | ⭐ | ⭐⭐ | ⭐⭐⭐ | ⭐⭐⭐⭐ |
| **Reusability** | Low | Low | Medium | High |
| **Scalability** | No | No | Limited | Excellent |

---

## How to Run Each UC

```bash
# Compile all Java files
javac *.java

# Run specific use case
java UC1
java UC2
java UC3
java UC4
```

---

## Switching Between Branches

```bash
# Switch to a specific branch
git checkout uc1/print-statement
git checkout uc2/string-concatenation
git checkout uc3/string-join
git checkout uc4/arrays-loops

# View which branch you're on
git branch -v

# See all branches
git branch -a
```

---

## Learning Objectives Achieved

✅ **UC1**: Java basics - class structure, main method, output  
✅ **UC2**: String manipulation and concatenation  
✅ **UC3**: Java utility methods (String.join())  
✅ **UC4**: Collections (Arrays), iterative statements, modularity  
✅ **Overall**: Progressive software design and code optimization

---

## Author
Developer  
Version: 1.0  
Date: February 2026
