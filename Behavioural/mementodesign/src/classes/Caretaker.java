package classes;

import java.util.ArrayList;

public class Caretaker {
    
    ArrayList<Memento> savedArticles = new ArrayList<>();

    public void addMemento(Memento newMemento) {
        savedArticles.add(newMemento);
    }

    public Memento getMemento(int index) {
        return savedArticles.get(index);
    }

}
