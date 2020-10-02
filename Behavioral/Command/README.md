## When to use Command Pattern ?

- When you want to parametrize objects with operations.
- When you want to queue operations, schedule their execution, or execute them remotely.
- When you want to implement reversible operations.

## Advantages of Command Pattern

- Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform these operations.
- Open/Closed Principle. You can introduce new commands into the app without breaking existing client code.
- Undo/Redo operations can be implemented.
- You can implement deferred execution of operations.

## Disadvantages of Command Pattern

- The code may become more complicated since you’re introducing a whole new layer between senders and receivers.

### How to run ?

- Run `PlayWithRemote.java`.
