<div align="center">

# 🔗 JDBC Practice

[![GitHub stars](https://img.shields.io/github/stars/Shubh2-0/JDBC-Practice?style=for-the-badge&logo=github&color=yellow)](https://github.com/Shubh2-0/JDBC-Practice/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Shubh2-0/JDBC-Practice?style=for-the-badge&logo=github&color=blue)](https://github.com/Shubh2-0/JDBC-Practice/network/members)
[![GitHub issues](https://img.shields.io/github/issues/Shubh2-0/JDBC-Practice?style=for-the-badge&logo=github&color=red)](https://github.com/Shubh2-0/JDBC-Practice/issues)

<img src="https://www.baeldung.com/wp-content/uploads/2021/01/jdbc-1024x512-1.jpg" alt="JDBC" width="500"/>

### Master Java Database Connectivity

*From CRUD basics to DAO pattern - complete JDBC learning path*

[Projects](#-projects) · [Get Started](#-getting-started) · [Learn JDBC](#-jdbc-concepts)

</div>

---

## 📖 Table of Contents

- [About](#-about)
- [Projects](#-projects)
- [JDBC Concepts](#-jdbc-concepts)
- [Technologies](#-technologies)
- [Getting Started](#-getting-started)
- [Contributing](#-contributing)
- [Contact](#-contact)

---

## 🎯 About

This repository provides hands-on practice with **JDBC (Java Database Connectivity)**. Learn how to connect Java applications to databases, perform CRUD operations, and implement the DAO (Data Access Object) pattern for clean architecture.

### What You'll Learn

- 🔌 **Database Connection** - Connect Java to MySQL/PostgreSQL
- 📝 **CRUD Operations** - Create, Read, Update, Delete
- 🏗️ **DAO Pattern** - Clean data access architecture
- 🔒 **Prepared Statements** - Prevent SQL injection
- 📊 **ResultSet Handling** - Process query results

---

## 📁 Projects

### 📚 Student Management Application

Basic JDBC implementation covering:

| Feature | Description |
|---------|-------------|
| Add Student | Insert new records |
| View Students | Query all records |
| Update Student | Modify existing data |
| Delete Student | Remove records |

### 🏛️ Student Management with DAO Pattern

Advanced implementation with clean architecture:

| Component | Responsibility |
|-----------|----------------|
| **Model** | Student entity class |
| **DAO Interface** | Contract for data operations |
| **DAO Implementation** | JDBC implementation |
| **Service Layer** | Business logic |

---

## 💡 JDBC Concepts

### Connection Flow

```
┌─────────────────┐
│  Java Application │
└────────┬────────┘
         │ 1. Load Driver
         ▼
┌─────────────────┐
│   JDBC Driver   │
└────────┬────────┘
         │ 2. Get Connection
         ▼
┌─────────────────┐
│   Connection    │
└────────┬────────┘
         │ 3. Create Statement
         ▼
┌─────────────────┐
│   Statement     │
└────────┬────────┘
         │ 4. Execute Query
         ▼
┌─────────────────┐
│    ResultSet    │
└─────────────────┘
```

### Code Example

```java
// Establish connection
Connection conn = DriverManager.getConnection(url, user, password);

// Create statement
PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE id = ?");
ps.setInt(1, studentId);

// Execute and process
ResultSet rs = ps.executeQuery();
while(rs.next()) {
    System.out.println(rs.getString("name"));
}
```

---

## 🛠️ Technologies

<div align="center">

| Technology | Purpose |
|:----------:|:-------:|
| <img src="https://skillicons.dev/icons?i=java" width="50"/> | Java 8+ |
| <img src="https://skillicons.dev/icons?i=mysql" width="50"/> | MySQL Database |
| <img src="https://skillicons.dev/icons?i=maven" width="50"/> | Maven Build |
| <img src="https://skillicons.dev/icons?i=eclipse" width="50"/> | Eclipse IDE |

</div>

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8+
- MySQL Server
- Maven (optional)
- IDE (Eclipse/IntelliJ)

### Setup

```bash
# Clone repository
git clone https://github.com/Shubh2-0/JDBC-Practice.git
cd JDBC-Practice

# Create database
mysql -u root -p
CREATE DATABASE student_db;

# Update connection details in code
# Run the application!
```

---

## 🤝 Contributing

Contributions welcome! Add more JDBC examples, improve documentation, or fix bugs.

---

## 📬 Contact

<div align="center">

**Shubham Bhati** - Java Developer

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/shubham-bhati-787319213/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:shubhambhati226@gmail.com)
[![WhatsApp](https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](https://wa.me/+916232133187)

</div>

---

<div align="center">

### ⭐ Star this repository if it helped you learn JDBC!

**Keywords:** JDBC Java MySQL Database CRUD DAO-Pattern PreparedStatement Connection SQL

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=60&section=footer"/>

</div>



