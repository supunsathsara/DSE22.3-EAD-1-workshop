# Question 1: Object-Oriented Programming Concepts

## Classes

### School
- Attributes:
  - `name`: Name of the school.
  - `town`: Town where the school is located.

### Student
- Attributes:
  - `name`: Name of the student.
  - `school`: Instance of the `School` class to which the student belongs.

## Implementation

This section outlines the basic Object-Oriented Programming (OOP) concepts applied in the code:

1. **Encapsulation:**
   - The `School` and `Student` classes encapsulate relevant attributes within themselves, promoting data integrity.

2. **Association:**
   - The `Student` class is associated with the `School` class through the `school` attribute, representing the relationship between students and schools.

## Example Usage

```java
School s = new School("DPS","Delhi");
        Student st = new Student("Ravi",s);
        st.printDetails();
```




# Question 2: Circle and Shape Implementation

## Classes

### Circle
- Attributes:
  - `radius`: The radius of the circle.

- Methods:
  - `printArea()`: Prints the area of the circle using the formula π * r * r.

- Package:
  - Belongs to the `Shape` package.

### ShapeImpl
- Main Class:
  - `main()`: Entry point for the application.

## Implementation

This section outlines the key features and functionalities of the `Circle` and `ShapeImpl` classes:

1. **Circle Class:**
   - The `Circle` class represents a circle with a given radius.
   - It includes a method `printArea()` to calculate and print the area of the circle.

2. **Shape Package:**
   - The `Circle` class is organized within the `Shape` package, promoting a structured project layout.

3. **ShapeImpl Class:**
   - The `ShapeImpl` class serves as the main class with a `main()` method, acting as the entry point for the application.

## Example Usage

```java
// Creating a Circle instance
Circle myCircle = new Circle(radius: 5);

// Printing the area of the circle
myCircle.printArea();
```
