#   Basic University Database Management System

  This project is basic a basic University database management system.\
It aims to manage university-connected information like
students, lecturers and any person.\
It uses object-oriented programming with inheritance.\
It also shows JDBC usage for basic database operations and connectivity.\
The project is still under development, but most of it is available for testing.

---
##  Technologies used
+ Java,
+ PostGre SQL,
+ JDBC,
+ IntelliJ IDEA,
+ PGAdmin.
---
##    Project Structure
+ Main class - Main entry, used for implementation of the methods.
+ Person - Represents a person and contains shared attributes,
+ Student - Represents a student extends person class,
+ Lecturer - Represents a lecturer, currently under development,
+ Util - Contains utility methods for the application,
+ dbUtil - Contains utility methods for database connectivity and actions.
---
##    Database
The project uses PostGre SQL as its main database system.
The connection is established through JDBC.
User <ins>must provide</ins> their own database connection when running the app:
+ Database URL,
+ Username,
+ Password.
---
##    How to run:
1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure the PostGre SQL is installed.
4. Configure pgAdmin
5. Create required database table
6. Ensure there is JDBC
7. Run Main.java
8. Enter your own database details
---
##    Testing

The Main method is created for any form of black box style test.
It allows to call methods for any output chosen.

---
##    Development status

Work in progress.\
Most of the core functionality is implemented and ready for testing.\
Lecturer class requires future development.\
Additional functions might be introduced in future updates.

---
##    Future improvements

- [ ] Complete the Lecturer class,
- [ ] Expand database management functionality,
- [ ] Improve input validation and error handling,
- [ ] Add further testing,
- [ ] Improve database information storage,
- [ ] Add methods allowing for the user to access more information,
- [ ] Improve database transaction handling.


###    Author

[Zofia-Kro](https://github.com/Zofia-Kro)
