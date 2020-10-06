## When to use State Pattern ?

- When you have an object that behaves differently depending on its current state, the number of states is enormous, and the state-specific code changes frequently.
- When you have a class polluted with massive conditionals that alter how the class behaves according to the current values of the class’s fields.

## Advantages of State Pattern

- Single Responsibility Principle. Organize the code related to particular states into separate classes.
- Open/Closed Principle. Introduce new states without changing existing state classes or the context.

## Disadvantages of State Pattern

- Applying the pattern can be overkill if a state machine has only a few states or rarely changes.

### How to run ?

- Run `TestATMMachine.java`.
