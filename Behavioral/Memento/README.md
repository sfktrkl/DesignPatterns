## When to use Memento Pattern ?

- When you want to produce snapshots of the object’s state to be able to restore a previous state of the object.
- When direct access to the object’s fields/getters/setters violates its encapsulation.

## Advantages of Memento Pattern

- Snapshots of the object’s state can be produced without violating its encapsulation.
- The originator’s code can be simplified by letting the caretaker maintain the history of the originator’s state.

## Disadvantages of Memento Pattern

- The app might consume lots of RAM if clients create mementos too often.
- Caretakers should track the originator’s lifecycle to be able to destroy obsolete mementos.
- Most dynamic programming languages, such as PHP, Python and JavaScript, can’t guarantee that the state within the memento stays untouched.

### How to run ?

- Run `TestMemento.java`.
