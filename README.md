## 1️⃣ Creational Design Patterns

---

### 1.1 Factory Design Pattern

---

### 📖 Definition

The Factory Design Pattern is a creational pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

## 🗣️ In Simple Words: Instead of creating objects using `new`, you use a factory method to get the object you need. It hides the creation logic from the client.

---

### 🎯 Intent

> Define an interface for creating an object, but let subclasses decide which class to instantiate.

---

### 🔧 Example in This Project

In this project:

* `Vehicle` is the common interface.
* `Bike` and `Car` are concrete implementations.
* `VehicleFactory` is responsible for creating instances based on the input type.
* The client simply calls the factory method and uses the returned `Vehicle`.

---

### 🛠️ Key Components

| Class Name       | Role              | Description                                |
| ---------------- | ----------------- | ------------------------------------------ |
| `Vehicle`        | Product Interface | Common interface for all vehicle types     |
| `Bike`           | Concrete Product  | Implements Vehicle                         |
| `Car`            | Concrete Product  | Implements Vehicle                         |
| `VehicleFactory` | Factory           | Contains logic to instantiate correct type |
| `Client`         | Client            | Calls the factory and uses returned object |

---

🧪 **Example Output:**

```bash
Bike Started
Car has started
```

📌 In code:

```java
Vehicle vehicle = VehicleFactory.getVehicleObject("BIKE");
Vehicle vehicle1 = VehicleFactory.getVehicleObject("CAR");

//vehicle.start();  // Output: Bike Started
//vehicle1.start(); // Output: Car has started
```

---

### 1.2 Singleton Design Pattern

---

### 📖 Definition

The Singleton Design Pattern is a creational pattern that ensures a class has only one instance and provides a global point of access to it.

## 🗣️ In Simple Words: It’s like having a single president of a country — no matter how many people ask for the president, they always get the same one.

---

### 🎯 Intent

> Ensure a class has only one instance and provide a global point of access to it.

---

### 🔧 Example in This Project

In this project:

* `SingletonPattern` demonstrates the **eager initialization with synchronization**.
* `SingletonWithSynchronizedBlock` demonstrates the **double-checked locking** approach.
* Both implementations ensure that only one instance of the class is created, even in multithreaded environments.

---

### 🛠️ Key Components

| Class Name                       | Role      | Description                                        |
| -------------------------------- | --------- | -------------------------------------------------- |
| `SingletonPattern`               | Singleton | Uses synchronized method to ensure thread safety   |
| `SingletonWithSynchronizedBlock` | Singleton | Uses synchronized block and double-checked locking |
| `Client`                         | Client    | Calls the `getSingletonInstance()` multiple times  |

---

🧪 **Example Output:**

```bash
org.example.creationalpatterns.singletonpattern.scenarios.SingletonPattern@2c7b84de
org.example.creationalpatterns.singletonpattern.scenarios.SingletonPattern@2c7b84de
org.example.creationalpatterns.singletonpattern.scenarios.SingletonPattern@2c7b84de
org.example.creationalpatterns.singletonpattern.scenarios.SingletonPattern@2c7b84de
```

📌 In code:

```java
SingletonPattern instance1 = SingletonPattern.getSingletonInstance();
SingletonPattern instance2 = SingletonPattern.getSingletonInstance();
// Both instances point to the same object
```

---


## 2️⃣ Structural Design Patterns

---

### 2.1 Adapter Design Pattern

---

### 📖 Definition

The Adapter Design Pattern is a structural pattern that allows objects with incompatible interfaces to work together by wrapping one of the objects with an adapter class.

## 🗣️ In Simple Words: It acts like a converter or translator between two classes that can’t understand each other. The adapter makes them compatible by converting one format into another.

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

## 🗣️ In Simple Words: It’s like a remote control — you press one button and many things happen behind the scenes. You don’t need to know the internal complexities.

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

## 🗣️ In Simple Words: It’s like topping a pizza — you start with a plain pizza and wrap it with toppings (decorators) one by one, without touching the base pizza code.

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

🗣️ In Simple Words: It treats single items and collections of items the same way. For example, a number or a whole expression like (5 + (6 \* 7)) can be evaluated using the same interface.

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

### 2.5 Proxy Design Pattern

---

### 📖 Definition

The Proxy Design Pattern is a structural pattern that provides a surrogate or placeholder for another object to control access to it.

## 🗣️ In Simple Words: It’s like a security guard. Instead of accessing the object directly, you go through the proxy which checks permissions and then forwards the request.

### 🎯 Intent

> Provide a surrogate or placeholder for another object to control access to it.

---

### 🔧 Example in This Project

In this project:

* `EmployeeDao` is the main service interface.
* `EmployeeImpl` is the real object doing the work.
* `EmployeeProxy` controls access to `EmployeeImpl` based on the user’s role.

For example:

* Only `ADMIN` can create or delete an employee.
* `USER` can only view.

---

### 🛠️ Key Components

| Class Name      | Role        | Description                         |
| --------------- | ----------- | ----------------------------------- |
| `EmployeeDao`   | Subject     | Interface defining operations       |
| `EmployeeImpl`  | RealSubject | Actual implementation of operations |
| `EmployeeProxy` | Proxy       | Controls access to `EmployeeImpl`   |
| `ClientMain`    | Client      | Calls operations via Proxy          |

---

🧪 **Example Output:**

```bash
Employee Object Deleted
Employee Object Employee(name=Sajal, address=India)
```

If an unauthorized user tries to perform a restricted action:

```bash
Exception Encountered
```

---

### 2.6 Bridge Design Pattern

---

### 📖 Definition

The Bridge Design Pattern is a structural pattern that decouples an abstraction from its implementation so that the two can vary independently.

## 🗣️ In Simple Words: It's like separating the remote (interface) from the TV (implementation) so both can change independently.

### 🎯 Intent

> Decouple abstraction from implementation.

---

### 🔧 Example in This Project

In this project:

* The abstraction is `LivingThings`, which defines a breathing process.
* Implementations include `LandBreatheImplementation`, `TreeBasedImplementation`, and `WaterBasedImplementation`.
* `Dogs` is a refined abstraction using `LandBreatheImplementation`.

---

### 🛠️ Key Components

| Class Name                  | Role               | Description                                    |
| --------------------------- | ------------------ | ---------------------------------------------- |
| `LivingThings`              | Abstraction        | Base class containing reference to implementor |
| `BreatheProcessImplementor` | Implementor        | Interface defining `breatheProcess()`          |
| `LandBreatheImplementation` | ConcreteImpl       | Breathe through nose                           |
| `TreeBasedImplementation`   | ConcreteImpl       | Breathe through leaves                         |
| `WaterBasedImplementation`  | ConcreteImpl       | Breathe through gills                          |
| `Dogs`                      | RefinedAbstraction | Extends LivingThings using specific behavior   |
| `ClientMain`                | Client             | Instantiates abstraction with implementation   |

---

🧪 **Example Output:**

```bash
Breathe Through Nose
Inhales Oxygen
Exhales Carbondioxide
```

---

## 3️⃣ Behavioral Design Patterns

---

### 3.1 Iterator Design Pattern

---

### 📖 Definition

The Iterator Design Pattern provides a way to access the elements of a collection sequentially without exposing the underlying representation.

### 🗣️ In Simple Words:

It’s like a TV remote for your collection — it helps you move through the items one by one without knowing how they are stored.

---

### 🎯 Intent

> Provide a standard way to iterate over a collection of objects.

---

### 🔧 Example in This Project

In this example, we simulate a book collection. Instead of giving direct access to the list of books, we provide a `BookIterator` which allows you to go through the collection safely and uniformly.

* `Aggregate` — Interface for creating an iterator.
* `ConcreteAggregate` — Implements Aggregate and holds the book collection.
* `BookIterator` — Interface for the iterator.
* `ConcreteIterator` — Concrete implementation of the iterator.
* `Book` — The object we are iterating over.
* `ClientMain` — Uses the iterator to access books.

---

### 🛠️ Key Components

| Class Name          | Role               | Description                                         |
| ------------------- | ------------------ | --------------------------------------------------- |
| `Aggregate`         | Abstraction        | Defines interface to create an iterator             |
| `ConcreteAggregate` | Collection         | Holds a list of `Book` and returns a `BookIterator` |
| `BookIterator`      | Iterator Interface | Defines `hasNext()` and `next()`                    |
| `ConcreteIterator`  | Iterator           | Implements the iteration logic                      |
| `Book`              | Element            | Represents a book object                            |
| `ClientMain`        | Client             | Demonstrates iteration using `BookIterator`         |

---

### 🧪 Example Output:

```bash
Book(title=Design Patterns, author=Erich Gamma)
Book(title=The Pragmatic Programmer, author=Andy Hunt)
Book(title=Refactoring, author=Martin Fowler)
Book(title=Java Concurrency in Practice, author=Brian Goetz)
Book(title=Head First Design Patterns, author=Eric Freeman)
Book(title=Domain-Driven Design, author=Eric Evans)
```

---


## 🧠 Summary

| Pattern   | Type       | Intent                                     | Simplifies                                         |
| --------- | ---------- | ------------------------------------------ | -------------------------------------------------- |
| Factory   | Creational | Instantiate objects without exposing `new` | Decouples object creation logic from client        |
| Singleton | Creational | One instance, global access                | Resource management, caching, configuration        |
| Adapter   | Structural | Convert one interface to another           | Communication between incompatible classes         |
| Facade    | Structural | Provide a unified interface to subsystems  | Subsystem usage for clients                        |
| Decorator | Structural | Add functionality without changing code    | Dynamically enrich behavior of an object           |
| Composite | Structural | Treat group of objects like single object  | Part-whole hierarchies (e.g., tree-based)          |
| Proxy     | Structural | Control access to real objects             | Add security, lazy init, logging etc.              |
| Bridge    | Structural | Decouple abstraction from implementation   | Change implementation without touching abstraction |
| Iterator  | Behavioral | Sequential access to collection elements   | Looping without exposing internal structure        |

---

## 🛠️ How to Run

1. Clone or download the project.
2. Open in your preferred Java IDE (e.g., IntelliJ, Eclipse).
3. Compile and run the `main()` methods in:

    * `Client` (for Factory)
    * `Client` (for Singleton)
    * `ClientClass` (for Adapter)
    * `Client` (for Facade)
    * `PizzaStore` (for Decorator)
    * `ClientCalculator` (for Composite)
    * `ClientMain` (for Proxy)
    * `ClientMain` (for Bridge)
    * `ClientMain` (for Iterator)

Or via terminal:

```bash
javac org/example/creationalpatterns/**/*/*.java
java org.example.creationalpatterns.factorypattern.client.Client
java org.example.creationalpatterns.singletonpattern.client.Client

javac org/example/structuralpatterns/**/*/*.java
java org.example.structuralpatterns.AdapterPattern.Client.ClientClass
java org.example.structuralpatterns.FacadePattern.Client.Client
java org.example.structuralpatterns.DecoratorPattern.Client.PizzaStore
java org.example.structuralpatterns.CompositePattern.Client.ClientCalculator
java org.example.structuralpatterns.ProxyPattern.Client.ClientMain
java org.example.structuralpatterns.BridgePattern.Client.ClientMain

javac org/example/behavioralpatterns/**/*/*.java
java org.example.behavioralpatterns.iteratorpattern.client.ClientMain
```

---
## 👨‍💻 Author

Sajal Shrivastava
