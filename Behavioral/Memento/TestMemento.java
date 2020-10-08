public class TestMemento {

    static int saveFiles = -1, currentArticle = -1;

    // Create a caretaker that contains the ArrayList
    // with all the articles in it. It can add and
    // retrieve articles from the ArrayList
    static Caretaker caretaker = new Caretaker();

    // The originator sets the value for the article,
    // creates a new memento with a new article, and
    // gets the article stored in the current memento
    static Originator originator = new Originator();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nCommand: show/save/undo/redo/list");
            String input = System.console().readLine();
            if (input.matches("save")) {

                // saveFiles monitors how many articles are saved
                // currentArticle monitors the current article displayed
                saveFiles++;
                currentArticle = saveFiles;

                // Get the input
                String text = System.console().readLine("> ");

                // Set the value for the current memento
                originator.set(text);

                // Add new article to the ArrayList
                caretaker.addMemento(originator.storeInMemento());

            } else if (input.matches("undo")) {

                if (currentArticle >= 1) {

                    // Decrement to the current article displayed
                    currentArticle--;

                    // Restore the article
                    originator.restoreFromMemento(caretaker.getMemento(currentArticle));
                }

            } else if (input.matches("redo")) {

                if ((saveFiles - 1) >= currentArticle) {

                    // Increment to the current article displayed
                    currentArticle++;

                    // Restore the article
                    originator.restoreFromMemento(caretaker.getMemento(currentArticle));
                }

            } else if (input.matches("show")) {

                if (currentArticle >= 0) {
                    // Show current article index
                    System.out.println("\nCurrent memento: " + currentArticle);

                    // Show current memento
                    originator.restoreFromMemento(caretaker.getMemento(currentArticle));
                }

            } else if (input.matches("list")) {

                // Show current article index
                System.out.println("\nCurrent memento: " + currentArticle);

                // Restore the article
                for (int i = 0; i <= saveFiles; i++) {
                    System.out.println("\nSaved memento: " + i);
                    originator.restoreFromMemento(caretaker.getMemento(i));
                }
            }
        }

    }

}
