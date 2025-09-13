# Employee Management System (Java + JDBC + MySQL)

A console-based Java project that manages employee records using JDBC and MySQL.

## Features
- Add new employees
- View all employees
- Update employee salary
- Delete employee records

## Concepts Used
- Java OOP (Classes, Encapsulation, Abstraction)
- JDBC for database interaction
- Exception handling
- CRUD operations

## Tech Stack
- Java
- MySQL
- JDBC

## Setup Instructions
1. Create the database:
   ```sql
   CREATE DATABASE employee_db;
   USE employee_db;
   CREATE TABLE employees (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(100) NOT NULL,
       department VARCHAR(50),
       salary DOUBLE
   );
