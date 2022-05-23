package classes;

//An simple class that holds and returns data
public class Memento {
    
    private String article;

    public Memento(String article) {
        this.article = article;
    }

    public String getArticle() {
        return article;
    }

}
