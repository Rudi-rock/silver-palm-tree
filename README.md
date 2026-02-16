# OOPS Banner App

A progressive Java learning project demonstrating core concepts through incremental use cases focused on the "OOPS" ASCII banner generation.

## 📌 Project Overview

This project implements three separate use cases, each building on the previous one to teach Java fundamentals, string concatenation, and memory optimization techniques.

---

## 🎯 Use Cases

### **UC1: Print "OOPS" - Java Fundamentals**
- **File:** `UC1.java`
- **Concepts:** Class structure, main method, System.out.println(), static keyword
- **Output:** Simple text output
- **Command:** 
  ```bash
  javac UC1.java
  java UC1
  ```
- **Branch:** `feature/UC1-PrintOOPS`

**Output:**
```
OOPS
```

---

### **UC2: OOPS Banner with String Concatenation**
- **File:** `UC2.java`
- **Concepts:** ASCII art, string concatenation with `+` operator, multi-line output
- **Output:** Decorative 7-line OOPS banner
- **Command:**
  ```bash
  javac UC2.java
  java UC2
  ```
- **Branch:** `feature/UC2-ASCIIBanner`

**Output:**
```
OOPS

 ****  **** ***** ***** 
*    **    **    **     
*    **    **    **     
*    **    ****** ***** 
*    **    **          *
*    **    **          *
 ****  **** *     ***** 
```

---

### **UC3: OOPS Banner with String.join() - Memory Optimization**
- **File:** `UC3.java`
- **Concepts:** String.join() method, memory efficiency, string immutability, static methods
- **Output:** Same banner as UC2, but with optimized string construction
- **Command:**
  ```bash
  javac UC3.java
  java UC3
  ```
- **Branch:** `feature/UC3-StringJoinOptimization`

**Key Improvement:** Replaces multiple `+` concatenations with `String.join()` to reduce intermediate String objects in memory.

---

## 📂 Project Structure

```
OOPSbannerapp/
├── UC1.java                    # Use Case 1: Basic OOPS print
├── UC2.java                    # Use Case 2: ASCII banner with +
├── UC3.java                    # Use Case 3: ASCII banner with String.join()
├── oops.java                   # Original implementation (legacy)
├── HelloWorld.java             # Legacy file
├── .gitignore                  # Git ignore patterns
├── .git/                       # Git repository
└── README.md                   # This file
```

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Git

### Compilation & Execution

**Compile all files:**
```bash
cd OOPSbannerapp
javac UC1.java UC2.java UC3.java
```

**Run individual use cases:**
```bash
java UC1     # Run UC1
java UC2     # Run UC2
java UC3     # Run UC3
```

---

## 🌿 Git Branches

The project follows a feature branch workflow:

```
main (latest stable)
  ↓
dev (development branch)
  ├── feature/UC1-PrintOOPS (merged)
  ├── feature/UC2-ASCIIBanner (merged)
  └── feature/UC3-StringJoinOptimization (merged)
```

### Viewing Branch History
```bash
git log --oneline --graph --all
```

---

## 📚 Key Concepts

### UC1: Java Fundamentals
- **Class:** Container for methods and data
- **Main Method:** Entry point of the program
- **Static Keyword:** Method belongs to the class, not instances
- **String Literals:** Text enclosed in quotes

### UC2: String Concatenation
- **Concatenation Operator:** `+` joins strings
- **Drawback:** Creates intermediate String objects (memory inefficient)
- **ASCII Art:** Visual representation using characters

### UC3: Memory Optimization
- **String.join():** Efficient concatenation of multiple strings
- **String Immutability:** Each `+` operation creates new String objects
- **Performance:** `String.join()` reduces temporary objects significantly
- **Use:** Better for performance-critical code

---

## 💡 Learning Path

1. **Start with UC1** → Understand basic Java structure
2. **Move to UC2** → Learn ASCII art and string operations
3. **Progress to UC3** → Understand memory optimization and best practices

---

## 📝 Documentation

Each Java file includes:
- **JavaDoc comments** for class and method documentation
- **@author** tag for developer attribution
- **@version** tag for version tracking
- **Detailed comments** explaining key concepts

Example:
```java
/**
 * UC1: Print "OOPS" - Foundational Step
 * 
 * Use Case 1 demonstrates Java fundamentals:
 * - Class as a container for logic
 * - Main method as the application entry point
 * - Static keyword and method invocation
 * 
 * @author Developer
 * @version 1.0
 */
```

---

## 🔧 Development Workflow

### Creating a New Use Case
1. Create feature branch: `git checkout -b feature/UC{N}-{Description}`
2. Write code in `UC{N}.java`
3. Test: `javac UC{N}.java && java UC{N}`
4. Commit: `git add UC{N}.java && git commit -m "UC{N}: Description"`
5. Switch to dev: `git checkout dev`
6. Merge: `git merge feature/UC{N}-{Description}`

---

## 📦 Next Steps

### To Push to Remote Repository
```bash
git remote add origin https://github.com/your-username/OOPSbannerapp.git
git push -u origin dev
git push -u origin main
```

### UC4 and Beyond
The project can be extended with additional use cases focusing on:
- Arrays and loops for banner generation
- Methods and code reusability
- Classes and object-oriented design
- Error handling and input validation

---

## 📄 License

This is an educational project. Feel free to use and modify.

---

## ✅ Summary

| UC | File | Focus | Status |
|----|------|-------|--------|
| 1 | UC1.java | Java Fundamentals | ✅ Complete |
| 2 | UC2.java | String Concatenation | ✅ Complete |
| 3 | UC3.java | Memory Optimization | ✅ Complete |

All use cases are **compiled, tested, and merged into the dev branch**.
