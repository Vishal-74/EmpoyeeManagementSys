

# Employee Management System

## Overview

The **Employee Management System** is a Java-based application designed to manage employee records efficiently. It leverages Java Swing for a responsive user interface, Java JDBC for database interactions, and MySQL for data storage. The system provides a comprehensive solution for handling employee data with CRUD (Create, Read, Update, Delete) functionality.

## Architecture


![Capture](https://github.com/user-attachments/assets/c6a17b99-866a-4733-825a-e2c52a1fbbad)
![2](https://github.com/user-attachments/assets/bc929bba-7d0a-4488-9008-01d81a8b07fe)
![3](https://github.com/user-attachments/assets/4bd03703-b70b-4051-bb18-4a40ab12dabb)
![4](https://github.com/user-attachments/assets/32fc6c39-660d-4007-bbf2-66b723d4a51e)
![5](https://github.com/user-attachments/assets/139f5352-e13a-4f93-b850-a998fb50c24d)
![6](https://github.com/user-attachments/assets/b39e168c-0cbe-49bf-af97-53c658ddf133)
![7](https://github.com/user-attachments/assets/53636685-d29c-48c7-b6f2-36f70fbd9ae9)

### Presentation Layer
- **Technology:** Java Swing
- **Description:** Provides a user-friendly interface for interacting with the system. Includes forms and dialogs for managing employee information.

### Business Logic Layer
- **Description:** Contains core functionalities for processing and managing employee data. This layer ensures that business rules are applied and data integrity is maintained.

### Data Access Layer
- **Technology:** JDBC (Java Database Connectivity)
- **Description:** Manages interactions with the MySQL database. Handles all CRUD operations and ensures efficient data retrieval and updates.

### Database
- **Technology:** MySQL
- **Description:** Stores employee records. Designed to support efficient data management and retrieval.

## Features

- **Add New Employee:** Input employee details and save them to the database.
- **View Employee Records:** Retrieve and display employee information in a user-friendly format.
- **Update Employee Information:** Modify existing employee records as needed.
- **Delete Employee Records:** Remove employee records from the system.


## Prerequisites

- Java Development Kit (JDK) 8 or higher
- MySQL Server
- MySQL Connector/J (JDBC driver for MySQL)

