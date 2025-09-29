# BDA Lab 1: Layered Architecture Implementation in Java

## Project Description

This repository contains the Java implementation for Lab 1 of the Building Database Applications course. The project demonstrates the construction of a clean, multi-layered software architecture using Java and Maven. It models a simplified e-commerce cart system, emphasizing separation of concerns, maintainability, and the use of core software design patterns such as the Repository and Service patterns.

## Architecture & Design Patterns

The application is structured into four distinct logical layers, each with a well-defined responsibility:

*   **Domain Layer (`com.bda.models`)**: Defines the core business entities (`Cart`, `Article`) that represent the data structure of the application.
*   **Data Access Layer (`com.bda.repositories`)**: Abstracts the data source using the **Repository Pattern**. The `CartRepository` provides a consistent API for data retrieval, currently implemented with in-memory mock data.
*   **Business Logic Layer (`com.bda.services`)**: Encapsulates the application's business rules and logic. The `CartService` orchestrates data access and performs critical calculations, such as aggregating the total value of a cart.
*   **Presentation Layer (`com.bda.views`)**: Handles the user interface and presentation logic. The `CartView` class acts as the entry point for the application, coordinating between the user and the underlying services.


