## When to use Prototype Pattern ?

- When your code shouldn’t depend on the concrete classes of objects that you need to copy.
- When you want to reduce the number of subclasses that only differ in the way they initialize their respective objects.
- When there are numerous potential classes that you want to only use if needed at runtime.

## Advantages of Prototype Pattern

- Being able to clone objects without coupling to their concrete classes.
- Getting rid of repeated initialization code in favor of cloning pre-built prototypes.

## Disadvantages of Prototype Pattern

- Cloning complex objects that have circular references might be very tricky.

### How to run ?

- Run `TestCloning.java`.
