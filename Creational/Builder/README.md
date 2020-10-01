## When to use Builder Pattern ?

- When you want to build an object made up from other objects.
- When you want the creation of these parts to be independent of the main object.

## Advantages of Builder Pattern

- You can construct objects step-by-step, defer construction steps or run steps recursively.
- You can reuse the same construction code when building various representations of products.
- Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.

## Disadvantages of Builder Pattern

- The overall complexity of the code increases since the pattern requires creating multiple new classes.

### How to run ?

- Run `TestRobotBuilder.java`.
