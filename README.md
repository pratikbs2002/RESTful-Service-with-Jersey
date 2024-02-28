# RESTful Service with Jersey

This project provides a simple example of building a RESTful service using the Jersey framework in Java.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)


## Introduction

This project demonstrates the implementation of a RESTful web service using Jersey, which is a framework for developing RESTful Web Services in Java that provides support for JAX-RS APIs and serves as a JAX-RS (JSR 311 & JSR 339) Reference Implementation.

## Features

- **CRUD Operations**: Implements basic CRUD operations (Create, Read, Update, Delete) for managing student records.
- **Jersey Framework**: Utilizes the Jersey framework for implementing RESTful web services.
- **HTTP Methods**: Demonstrates handling HTTP methods such as GET, POST, PUT, and DELETE.
- **JSON Representation**: Uses JSON (JavaScript Object Notation) for representing student resources.

## Installation

To run this project locally, follow these steps:

1. Clone this repository:

   ```bash
   git clone https://github.com/pratikbs2002/RESTful-Service-with-Jersey.git
   ```

2. Navigate to the project directory:

   ```bash
   cd RESTful-Service-with-Jersey
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Run the project:

   ```bash
   mvn exec:java
   ```

## Usage

Once the project is running, you can access the RESTful endpoints using tools like cURL, Postman, or any HTTP client. Here are the basic endpoints:

- `GET /students`: Retrieve all students.
- `GET /students/{id}`: Retrieve a specific student by ID.
- `POST /students`: Create a new student.
- `PUT /students/{id}`: Update an existing student.
- `DELETE /students/{id}`: Delete a student by ID.

Make sure to replace `{id}` with the actual ID of the student.
