# 🎯 Design Patterns in Java – Structural Patterns

This project demonstrates key **Design Patterns** in Java through practical, real-world examples. Each pattern encapsulates a different way of structuring your code to promote flexibility, reusability, and maintainability.

---

## 2️⃣ Structural Design Patterns

---

### 2.1 Adapter Design Pattern

---

### 📖 Definition

The **Adapter Design Pattern** is a **structural pattern** that allows objects with **incompatible interfaces** to work together by **wrapping** one of the objects with an adapter class.

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
* The adapter internally **converts pounds to kilograms** so that the client can consume the expected data format seamlessly.

---

### 🛠️ Key Components

| Class Name               | Role             | Description                             |
|--------------------------|------------------|-----------------------------------------|
| `WeighingMachineBabies`  | Adaptee          | Returns weight in pounds                |
| `WeighingMachineAdapter` | Target Interface | Expected by the client (returns kg)     |
| `AdapterImpl`            | Adapter          | Converts pounds to kilograms            |
| `ClientClass`            | Client           | Uses the adapter to access weight in kg |

---

### 📐 Conversion Formula

```

kilograms = pounds × 0.453592

````

---

🧪 **Example Output:**

```bash
Weight In kg: 20.41164
````

---

### 2.2 Facade Design Pattern

---

### 📖 Definition

The **Facade Design Pattern** is a **structural pattern** that provides a **simplified interface** to a complex subsystem. It hides the complexity of the system by encapsulating it behind a single unified interface.

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

The client only interacts with `HomeTheatreSystem` and doesn’t need to manage each component individually.

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
Press On key and starting watching movie
DVD Player On
Projector On
SoundSystem On
Home theatre is on
Press OFF key and turn off home theatre
Off Player
Off Projector
Off SoundSystem
Home theatre is off
```

---

## 🧠 Summary

| Pattern | Intent                                    | Simplifies                                 |
| ------- | ----------------------------------------- | ------------------------------------------ |
| Adapter | Convert one interface to another          | Communication between incompatible classes |
| Facade  | Provide a unified interface to subsystems | Subsystem usage for clients                |

---

## 🛠️ How to Run

1. Clone or download the project.
2. Open in your preferred Java IDE (e.g., IntelliJ, Eclipse).
3. Compile and run the `main()` methods in:

    * `ClientClass` (for Adapter)
    * `Client` (for Facade)

Or via terminal:

```bash
javac org/example/structuralpatterns/**/*/*.java
java org.example.structuralpatterns.AdapterPattern.ClientClass
java org.example.structuralpatterns.FacadePattern.Client.Client
```

---

## 👨‍💻 Author

Sajal Shrivastava

---

