Adapter Design Pattern
Definition:
The Adapter Design Pattern is a structural pattern that allows objects with incompatible interfaces to work together by wrapping one of the objects with an adapter class.

Intent:
Convert the interface of a class into another interface that clients expect.

Example in This Project:
WeighingMachineBabies returns weight in pounds, but the client expects weight in kilograms.
To bridge this mismatch, AdapterImpl adapts WeighingMachineBabies to the WeighingMachineAdapter interface, converting the value internally.

Key Classes:

WeighingMachineBabies – Adaptee (returns pounds)

WeighingMachineAdapter – Target interface (expects kg)

AdapterImpl – Adapter (converts pounds to kg)

ClientClass – Client using the adapter

Formula used: kg = pounds * 0.453592

