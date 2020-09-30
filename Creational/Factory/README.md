## When to use Factory Pattern ?

- When a method returns one of the several possible classes that share a common super class.
  > For example: Let's say we want to create a new enemy in a game. The factory can return the enemy which is assigned to a specific number by taking this number from a random number generator. This allows us to have classes chosen during the runtime.
- When you don't know ahead of time what class object you need.
- When all of the potential classes are in the same subclass hierarchy.
- To encapsulate the object creation.

## Advantages of Factory Pattern

- Avoiding tight coupling between the creator and the concrete products.
- Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.

## Disadvantages of Factory Pattern

- The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern.

### How to run ?

- Run `EnemyShipTesting.java`.
