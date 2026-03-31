[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Library Management System using Java

## Problem Statement (max 150 words)

Managing a library manually is a complex and time-consuming task that involves maintaining records of books, tracking issued books, and managing user information. Traditional methods are prone to errors, data loss, and inefficiency. This project aims to develop a Library Management System using Java and Object-Oriented Programming (OOP) concepts to automate these operations. The system allows users to add books, view available books, issue books to students, and return them efficiently. It ensures better data organization, reduces manual effort, and improves overall system reliability.

## Target User

Librarians
Students
Educational Institutions
Colleges and Universities

## Core Features

Add books
View books
Issue books
Return books
User roles
  
## OOP Concepts Used

🔹 Encapsulation

All data members in classes like Book are private and accessed using getter/setter methods.

🔹 Abstraction

Abstract class User is used to define common properties of users.

🔹 Inheritance

Student and Librarian classes inherit from the User class.

🔹 Polymorphism

Method overriding is used to define different behaviors for Student and Librarian.

🔹 Exception Handling

Used to handle invalid inputs and runtime errors.

🔹 Collections

ArrayList is used to store and manage book records dynamically.


## Proposed Architecture Description

The project follows a layered architecture:

🔸 Model Layer

Contains core classes like:

Book
User
Student
Librarian
🔸 Service Layer

Handles business logic:

LibraryService (book operations)
🔸 Utility Layer

Handles helper functions like file handling (optional).

🔸 Main Layer

Entry point of the program:

Main.java

This structure ensures modularity, maintainability, and scalability.

## How to Run

Open terminal or IDE
Navigate to project folder

Compile the program:

javac src/Main.java

Run the program:

java src/Main

## Git Discipline Notes

This project has been developed following proper Git discipline practices as required:

✔️ The repository maintains the required folder structure (src/, docs/, report/, slides/)
✔️ Development is carried out through multiple meaningful commits
✔️ Each commit represents a specific feature or improvement
✔️ Commit messages are clear and descriptive
✔️ Work is distributed over multiple stages (not uploaded all at once)
✔️ Incremental development approach is followed
✔️ No bulk upload at the final stage 

 Commit Strategy Followed
Initial project setup
Model classes implementation
OOP concepts integration (Inheritance, Abstraction)
Service layer development
Feature additions (Add, Issue, Return Book)
Improvements and validation
Documentation updates

This ensures transparency, proper version control, and adherence to best software development practices.

Added Git discipline notes section in README
