## When to use Strategy Pattern ?

- When you need to perform an operation on all elements of a complex object structure (for example, an object tree).
- When a behavior makes sense only in some classes of a class hierarchy, but not in others.

## Advantages of Strategy Pattern

- Open/Closed Principle. You can introduce a new behavior that can work with objects of different classes without changing these classes.
- Single Responsibility Principle. You can move multiple versions of the same behavior into the same class.
- A visitor object can accumulate some useful information while working with various objects. This might be handy when you want to traverse some complex object structure, such as an object tree, and apply the visitor to each object of this structure.

## Disadvantages of Strategy Pattern

- When a class gets added to or removed from the element hierarchy all visitors have to be updated.
- Visitors might lack the necessary access to the private fields and methods of the elements that they’re supposed to work with.

### How to run ?

- Run `TestVisitor.java`.
