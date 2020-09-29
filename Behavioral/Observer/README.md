## When to use Observer Pattern ?

- When you need many other objects to receive an update when another object changes.
  > For example: Let's say we have a Subject (publisher) object that is going to represent thousands of individual stocks in the stock market. If you would need to send updates to multiple Observers (subscribers), you would use the Observer Pattern to do that.

## Advantages of Observer Pattern

- Loose coupling. Subject doesn't need to know anything about the observers.

## Disadvantages of Observer Pattern

- Subject may send updates that don't matter to observers.

### How to run ?

- Run `GrabStocks.java`.
