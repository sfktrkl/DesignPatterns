## When to use Iterator Pattern ?

- When your collection has a complex data structure under the hood, but you want to hide its complexity from clients
- To reduce duplication of the traversal code across your app.
- When you want your code to be able to traverse different data structures or when types of these structures are unknown beforehand.

## Advantages of Iterator Pattern

- Single Responsibility Principle. You can clean up the client code and the collections by extracting bulky traversal algorithms into separate classes.
- Open/Closed Principle. You can implement new types of collections and iterators and pass them to existing code without breaking anything.
- You can iterate over the same collection in parallel because each iterator object contains its own iteration state.
- For the same reason, you can delay an iteration and continue it when needed.

## Disadvantages of Iterator Pattern

- Applying the pattern can be an overkill if your app only works with simple collections.
- Using an iterator may be less efficient than going through elements of some specialized collections directly.

### How to run ?

- Run `RadioStation.java`.
