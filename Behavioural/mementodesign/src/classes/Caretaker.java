package classes;

import java.util.ArrayList;

//A class that stores the memento as a sort of "database"
public class Caretaker {
    
    ArrayList<Memento> savedArticles = new ArrayList<>();

    public void addMemento(Memento newMemento) {
        savedArticles.add(newMemento);
    }

    public Memento getMemento(int index) {
        return savedArticles.get(index);
    }

}
