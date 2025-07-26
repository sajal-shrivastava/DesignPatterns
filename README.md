---

## 2️⃣ Structural Design Patterns

---

### 2.1 Adapter Design Pattern

---

### 📖 Definition

The Adapter Design Pattern is a structural pattern that allows objects with incompatible interfaces to work together by wrapping one of the objects with an adapter class.

🗣️ In Simple Words:
It acts like a converter or translator between two classes that can’t understand each other. The adapter makes them compatible by converting one format into another.
---

### 🎯 Intent

> Convert the interface of a class into another interface that clients expect.

---

### 🔧 Example in This Project

In this project:

* `WeighingMachineBabies` returns weight in **pounds**
* The client expects weight in **kilograms**

To resolve this mismatch:

* `AdapterImpl` adapts `WeighingMachineBabies` to the `WeighingMachineAdapter` interface.
* The adapter internally **converts pounds to kilograms** so the client gets the expected format.

---

### 🛠️ Key Components

| Class Name               | Role             | Description                             |
| ------------------------ | ---------------- | --------------------------------------- |
| `WeighingMachineBabies`  | Adaptee          | Returns weight in pounds                |
| `WeighingMachineAdapter` | Target Interface | Expected by the client (returns kg)     |
| `AdapterImpl`            | Adapter          | Converts pounds to kilograms            |
| `ClientClass`            | Client           | Uses the adapter to access weight in kg |

---

### 📐 Conversion Formula

```
kilograms = pounds × 0.453592
```

---

🧪 **Example Output:**

```bash
Weight In kg: 20.41164
```

---

### 2.2 Facade Design Pattern

---

### 📖 Definition

The Facade Design Pattern is a structural pattern that provides a simplified interface to a complex subsystem. It hides the complexity of the system by encapsulating it behind a single unified interface.

🗣️ In Simple Words:
It’s like a remote control — you press one button and many things happen behind the scenes. You don’t need to know the internal complexities.
---

### 🎯 Intent

> Provide a unified interface to a set of interfaces in a subsystem. The Facade defines a higher-level interface that makes the subsystem easier to use.

---

### 🔧 Example in This Project

In this project:

* The home theatre system includes **three subsystems**:

    * `DVDPlayer`
    * `SoundSystem`
    * `Projector`

To simplify their usage:

* `HomeTheatreSystem` acts as a **facade** that wraps these subsystems.
* It exposes simple methods:

    * `turnOnTheatre()` → Turns on all devices
    * `turnOffTheatre()` → Turns off all devices

The client interacts only with `HomeTheatreSystem` and not individual components.

---

### 🛠️ Key Components

| Class Name          | Role      | Description                                    |
| ------------------- | --------- | ---------------------------------------------- |
| `DVDPlayer`         | Subsystem | Manages DVD operations (on, off, play)         |
| `SoundSystem`       | Subsystem | Manages audio system operations                |
| `Projector`         | Subsystem | Manages projector operations                   |
| `HomeTheatreSystem` | Facade    | Wraps all subsystems behind a single interface |
| `Client`            | Client    | Interacts only with the Facade class           |

---

🧪 **Example Output:**

```bash
Press On key and start watching movie
DVD Player On
Projector On
SoundSystem On
Home theatre is on
Press OFF key and turn off home theatre
DVD Player Off
Projector Off
SoundSystem Off
Home theatre is off
```

---

### 2.3 Decorator Design Pattern

---

### 📖 Definition

The Decorator Design Pattern is a structural pattern that allows you to dynamically add new behavior or responsibilities to an object without modifying its code.

🗣️ In Simple Words:
It’s like topping a pizza — you start with a plain pizza and wrap it with toppings (decorators) one by one, without touching the base pizza code.
---

### 🎯 Intent

> Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

---

### 🔧 Example in This Project

In this project:

* `Pizza` is the core component interface.
* `FarmhousePizza` is a concrete implementation.
* `CheeseDecorator`, `OliveDecorator`, etc., are decorators that add toppings dynamically without changing the original pizza code.

---

### 🛠️ Key Components

| Class Name        | Role                | Description                           |
| ----------------- | ------------------- | ------------------------------------- |
| `Pizza`           | Component           | The core abstraction                  |
| `FarmhousePizza`  | Concrete Component  | The base pizza                        |
| `Decorator`       | Decorator Interface | Implements Pizza, wraps another Pizza |
| `CheeseDecorator` | Concrete Decorator  | Adds cheese topping                   |
| `PizzaStore`      | Client              | Builds pizza using decorators         |

---

🧪 **Example Output:**

```bash
Pizza's Cost: 320
```

*Here, base pizza = ₹300 and cheese topping = ₹20.*

---

### 2.4 Composite Design Pattern

---

### 📖 Definition

The Composite Design Pattern is a structural pattern used to treat individual objects and groups of objects uniformly by building a tree-like structure.

🗣️ In Simple Words:
It treats single items and collections of items the same way. For example, a number or a whole expression like (5 + (6 * 7)) can be evaluated using the same interface.


---

### 🎯 Intent

> Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions uniformly.

---

### 🔧 Example in This Project

In this project:

* The calculator evaluates arithmetic expressions using a tree structure.
* Leaf nodes are simple numbers (`Number` class).
* Composite nodes are operations (`Expression` class) like Add, Subtract, Multiply, Divide.

---

### 🛠️ Key Components

| Class Name             | Role      | Description                                         |
| ---------------------- | --------- | --------------------------------------------------- |
| `ArithmeticExpression` | Component | Interface with `evaluate()` method                  |
| `Number`               | Leaf      | Represents a single integer value                   |
| `Expression`           | Composite | Represents a binary operation (ADD, MULTIPLY, etc.) |
| `Operation`            | Enum      | Specifies the type of operation                     |
| `ClientCalculator`     | Client    | Builds and evaluates the expression tree            |

---

🧪 **Example Output:**

```bash
Addition result  11
Add Multiply Result  47
```

📌 In code:

```java
// (5 + 6) → 11
// (6 * 7) + 5 → 47
```

---

## 🧠 Summary

| Pattern   | Intent                                    | Simplifies                                 |
| --------- | ----------------------------------------- | ------------------------------------------ |
| Adapter   | Convert one interface to another          | Communication between incompatible classes |
| Facade    | Provide a unified interface to subsystems | Subsystem usage for clients                |
| Decorator | Add functionality without changing code   | Dynamically enrich behavior of an object   |
| Composite | Treat group of objects like single object | Part-whole hierarchies (e.g., tree-based)  |

---

## 🛠️ How to Run

1. Clone or download the project.
2. Open in your preferred Java IDE (e.g., IntelliJ, Eclipse).
3. Compile and run the `main()` methods in:

    * `ClientClass` (for Adapter)
    * `Client` (for Facade)
    * `PizzaStore` (for Decorator)
    * `ClientCalculator` (for Composite)

Or via terminal:

```bash
javac org/example/structuralpatterns/**/*/*.java
java org.example.structuralpatterns.AdapterPattern.Client.ClientClass
java org.example.structuralpatterns.FacadePattern.Client.Client
java org.example.structuralpatterns.DecoratorPattern.Client.PizzaStore
java org.example.structuralpatterns.CompositePattern.Client.ClientCalculator
```

---

## 👨‍💻 Author

Sajal Shrivastava

---