## When to use Mediator Pattern ?

- When it’s hard to change some of the classes because they are tightly coupled to a bunch of other classes.
- When you can’t reuse a component in a different program because it’s too dependent on other components.
- When you find yourself creating tons of component subclasses just to reuse some basic behavior in various contexts.

## Advantages of Mediator Pattern

- Single Responsibility Principle. You can extract the communications between various components into a single place, making it easier to comprehend and maintain.
- Open/Closed Principle. You can introduce new mediators without having to change the actual components.
- Coupling between components of the program can be reduced.

## Disadvantages of Mediator Pattern

- Over time a mediator can evolve into a god object(object that knows too much or does too much).

### How to run ?

- Run `TestStockMediator.java`.
