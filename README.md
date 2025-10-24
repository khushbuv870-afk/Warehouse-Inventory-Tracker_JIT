Warehouse Inventory Tracker
📘 About the Project

The Warehouse Inventory Tracker is a Java-based application designed to manage and monitor warehouse stock in real-time.
It automatically updates inventory when shipments are received or customer orders are fulfilled.
The system also generates alerts when any product’s stock level falls below the minimum quantity.

⚙️ Key Features

Add multiple products to warehouse inventory

Receive shipments to increase stock

Fulfill customer orders and update quantity

Display all product details

Trigger alerts when stock goes below minimum

Uses Observer Design Pattern for real-time notifications

🧩 Classes and Their Roles
Class Name	Description
Product.java	Defines product details (ID, name, quantity, minimum stock).
Warehouse.java	Manages inventory — add, update, and notify observers.
AlertService.java	Observer class that handles low-stock alerts.
Main.java	The driver class where the whole process is executed.
🧠 Java Concepts Used

Object-Oriented Programming (OOP)

Classes & Objects

Encapsulation

Observer Design Pattern (for alert notification)

Event-driven Programming

Method Calling & Data Handling

Conditional Logic and Loops

▶️ How to Run

Open terminal or command prompt in your project folder

Compile all Java files:

javac *.java


Run the project:

java Main

💡 Sample Output
⚠️ Restock Alert: Low stock for Laptop – only 3 left!
⚠️ Restock Alert: Low stock for Smartphone – only 2 left!
⚠️ Restock Alert: Low stock for Tablet – only 3 left!
