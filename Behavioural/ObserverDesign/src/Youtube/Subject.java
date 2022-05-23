package Youtube;

public interface Subject {
    
    //Methods to be displayed for the user
    void subscribe(Subscriber sub);
    void unsubscribe(Subscriber sub);
    void notifySubscribers();
    void upload(String title);

}
