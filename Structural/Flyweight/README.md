## When to use Flyweight Pattern ?

- When your program must support a huge number of objects which barely fit into available RAM.

## Advantages of Facade Pattern

- Can save lots of RAM, assuming your program has tons of similar objects.

## Disadvantages of Facade Pattern

- You might be trading RAM over CPU cycles when some of the context data needs to be recalculated each time somebody calls a flyweight method.
- The code becomes much more complicated. New team members will always be wondering why the state of an entity was separated in such a way.

### How to run ?

- Run `FlyweightTest.java`.
