package classes;

//The manipulator of the mementor
public class Originator {
    
    private String article;

    public void setArticle(String newArticle){

        System.out.println("From originator: Current version of article \n"+newArticle);
        article = newArticle;

    }

    public Memento storeMemento() {

        System.out.println("From originator: Saving to memento");
        return new Memento(article);

    }

    public String restoreFromMemento(Memento memento) {
        article = memento.getArticle();

        System.out.println("From originator: previous article saved from memento"+article);
        return article;
    }

}
