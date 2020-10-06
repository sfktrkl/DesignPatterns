## When to use Chain of Responsibility Pattern ?

- When your program is expected to process different kinds of requests in various ways, but the exact types of requests and their sequences are unknown beforehand.
- When it’s essential to execute several handlers in a particular order.
- When the set of handlers and their order are supposed to change at runtime.

## Advantages of Chain of Responsibility Pattern

- You can control the order of request handling can be controlled.
- Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform operations.
- Open/Closed Principle. You can introduce new handlers into the app without breaking the existing client code.

## Disadvantages of Chain of Responsibility Pattern

- Some requests may end up unhandled.

### How to run ?

- Run `TestChain.java`.
