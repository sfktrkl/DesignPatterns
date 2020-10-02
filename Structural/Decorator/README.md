## When to use Decorator Pattern ?

- When you need to be able to assign extra behaviors to objects at runtime without breaking the code that uses these objects.
- When it’s awkward or not possible to extend an object’s behavior using inheritance.

## Advantages of Decorator Pattern

- Being able to extend an object’s behavior without making a new subclass.
- Being able to add or remove responsibilities from an object at runtime.
- Allows combining several behaviors by wrapping an object into multiple decorators.

## Disadvantages of Decorator Pattern

- It’s hard to remove a specific wrapper from the wrappers stack.
- It’s hard to implement a decorator in such a way that its behavior doesn’t depend on the order in the decorators stack.
- The initial configuration code of layers might look pretty ugly.

### How to run ?

- Run `PizzaMaker.java`.
