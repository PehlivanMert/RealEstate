
## 🔧 Technologies Used

- Java 21
- OOP (Object-Oriented Programming)
- Pure Java (No Frameworks)

## 📁 Class Structure

### 1. `House` (Abstract Class)
- Contains common properties: price, square meters, number of rooms, number of living rooms.

### 2. `Home`, `Villa`, `SummerHouse`
- Subclasses that extend the `House` class.
- Each represents a specific type of house.

### 3. `HouseRepository`
- Contains test data.
- Provides lists of houses, villas, and summer houses.

### 4. `HouseService`
- Performs operations such as:
    - Total price calculation
    - Average square meter calculation
    - Filtering by room and living room count

### 5. `Main`
- Entry point of the application.
- All methods are called here and results are printed to the console.

## 🧮 Application Features

- Calculate total prices for all types of houses
- Calculate average square meters for each house type
- Filter by room and living room count
- List all houses

---
