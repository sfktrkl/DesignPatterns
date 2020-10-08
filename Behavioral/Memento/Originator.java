// Memento Design Pattern
public class Originator {

    private String article;

    // Sets the value for the article
    public void set(String newArticle) {
        System.out.println("New Version of Article\n" + newArticle);
        this.article = newArticle;
    }

    // Creates a new Memento with a new article
    public Memento storeInMemento() {
        return new Memento(article);
    }

    // Gets the article currently stored in memento
    public String restoreFromMemento(Memento memento) {
        article = memento.getSavedArticle();
        System.out.println("Article Saved in Memento\n" + article);
        return article;
    }

}
