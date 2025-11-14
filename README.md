# Java Graph Algorithms & Programming Exercises

A collection of Java programming exercises demonstrating various data structures, algorithms, and object-oriented programming concepts.

## Overview

This repository contains implementations of several programming challenges including graph traversal, polymorphism, inheritance, file I/O, and data structure manipulation. The project was developed as part of Computer Science coursework.

## Features

### 1. Maze Navigation (Graph Traversal)
- Interactive maze game using graph data structure
- Navigate through connected rooms (nodes) using directional commands
- Demonstrates graph representation and traversal algorithms

### 2. Payment Processing System
- Cash payment handling
- Credit card payment processing
- Demonstrates inheritance and polymorphism concepts

### 3. Movie Management System
- Movie categorization (Comedy, Drama, Action)
- Late fee calculation based on movie type
- Movie comparison and duplicate detection
- Demonstrates polymorphism and method overriding

### 4. Shape Area Calculator
- Circle and Rectangle area calculations
- Polymorphic shape handling
- Demonstrates abstract concepts and interface usage

### 5. Movie Review System
- Reads movie ratings from file
- Processes and displays review data
- Demonstrates file I/O and data structure manipulation

### 6. Student Registration System
- Course registration tracking
- Uses HashMap for efficient data storage
- Demonstrates collection framework usage

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or command line tools

## Installation

1. Clone the repository:
```bash
git clone https://github.com/robertbiv/java-graph-algorithms.git
cd java-graph-algorithms
```

2. Compile the Java files:
```bash
javac src/*.java
```

## Usage

Run the main Tester class to execute all components:

```bash
cd src
java Tester
```

The program will sequentially execute:
1. Payment processing examples
2. Movie management demonstrations
3. Shape area calculations
4. Movie review processing
5. Student registration system (requires user input)
6. Interactive maze game (requires user input)

### Interactive Components

**Student Registration:**
- Enter student ID followed by course name
- Enter `-1` to stop input

**Maze Game:**
- Use N, S, E, W to navigate (North, South, East, West)
- Navigate from room A to room L to win

## Project Structure

```
java-graph-algorithms/
├── src/
│   ├── Action.java              # Action movie class
│   ├── CashPayment.java         # Cash payment implementation
│   ├── Circle.java              # Circle shape implementation
│   ├── Comedy.java              # Comedy movie class
│   ├── CreditCardPayment.java   # Credit card payment implementation
│   ├── Drama.java               # Drama movie class
│   ├── Maze.java                # Maze game implementation
│   ├── Movie.java               # Base movie class
│   ├── MovieReview.java         # Movie review processor
│   ├── Node.java                # Graph node for maze
│   ├── Payment.java             # Base payment class
│   ├── Rectangle.java           # Rectangle shape implementation
│   ├── RegistrationProblem.java # Student registration system
│   ├── Shape.java               # Base shape class
│   ├── Tester.java              # Main test runner
│   └── movieRatings.txt         # Sample movie ratings data
└── README.md                    # This file
```

## Key Concepts Demonstrated

- **Object-Oriented Programming**: Inheritance, polymorphism, encapsulation
- **Data Structures**: Graphs (nodes), HashMap, ArrayList
- **Algorithms**: Graph traversal, data processing
- **File I/O**: Reading and processing text files
- **Collections Framework**: HashMap, ArrayList usage

## Author

Robert Bennethum

## Notes

- The MovieReview component requires the `movieRatings.txt` file to be accessible
- Some file paths may need to be adjusted based on your system configuration
- The interactive components (Registration and Maze) require user input via console

## License

This project is available for educational purposes.
