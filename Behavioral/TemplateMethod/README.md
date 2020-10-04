## When to use Template Method Pattern ?

- When you want to let clients extend only particular steps of an algorithm, but not the whole algorithm or its structure.
- When you have several classes that contain almost identical algorithms with some minor differences. As a result, you might need to modify all classes when the algorithm changes.

## Advantages of Template Method Pattern

- Clients can override only certain parts of a large algorithm, making them less affected by changes that happen to other parts of the algorithm.
- Duplicate codes can be pulled into a superclass.

## Disadvantages of Template Method Pattern

- Some clients may be limited by the provided skeleton of an algorithm.
- You might violate the Liskov Substitution Principle by suppressing a default step implementation via a subclass.
- Template methods tend to be harder to maintain the more steps they have.

### How to run ?

- Run `SandwichSculptor.java`.
