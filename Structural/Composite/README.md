## When to use Composite Pattern ?

- When you have to implement a tree-like object structure.
- When you want the client code to treat both simple and complex elements uniformly.

## Advantages of Composite Pattern

- You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage.
- Open/Closed Principle. You can introduce new element types into the app without breaking the existing code, which now works with the object tree.

## Disadvantages of Composite Pattern

- It might be difficult to provide a common interface for classes whose functionality differs too much. In certain scenarios, you’d need to overgeneralize the component interface, making it harder to comprehend.

### How to run ?

- Run `SongListGenerator.java`.
