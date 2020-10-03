## When to use Adapter Pattern ?

- When you want to use some existing class, but its interface isn’t compatible with the rest of your code.
- When you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass.

## Advantages of Adapter Pattern

- Single Responsibility Principle. You can separate the interface or data conversion code from the primary business logic of the program.
- Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.

## Disadvantages of Adapter Pattern

- The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code.

### How to run ?

- Run `TestEnemyAttackers.java`.
