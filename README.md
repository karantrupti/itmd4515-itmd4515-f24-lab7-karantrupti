Lab 7 - User Authentication and Role Management with JSF
------------------------------------------------------------------------------------------------------------------------------------------------------------
Overview
This project is part of Lab 7 for ITMD 4515 and focuses on implementing user authentication and role management using Jakarta EE and JSF (JavaServer Faces). It replaces previous Servlet/JSP implementations with JSF-based solutions to provide a more robust and modern approach to building enterprise-level applications.

---

Objectives
1. Implement user authentication using JSF.
2. Manage role-based access control with `User` and `Group` entities.
3. Integrate with a relational database for persistent data storage.
4. Provide error handling for invalid logins and unauthorized access.

---

Features
- User login functionality using managed beans and JSF forms.
- Role-based access control to restrict or allow access to specific pages.
- Database-backed `User` and `Group` entities for managing authentication and roles.
- Friendly error pages for unauthorized access or login failures.

---

Technologies Used
- Jakarta EE 10: For building the application.
- JSF (JavaServer Faces): For front-end design and server-side logic.
- Payara Server: For deploying the application.
- MySQL/PostgreSQL: For database management.
- Maven: For dependency management and build automation.

---

 Project Structure
- Entities:
  - `User.java`: Represents users in the system.
  - `Group.java`: Represents roles/groups associated with users.
- Managed Beans:
  - `UserController.java`: Handles user login and session management.
- JSF Pages:
  - `index.xhtml`: The main entry point of the application.
  - `login.xhtml`: User login page.
  - `error.xhtml`: Page for displaying error messages.
- Configuration Files:
  - `beans.xml`: Enables CDI (Contexts and Dependency Injection).
  - `persistence.xml`: Configures database connection and entity persistence.
  - `web.xml`: Defines deployment descriptors and welcome files.

---
