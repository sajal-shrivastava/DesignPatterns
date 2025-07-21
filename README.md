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
