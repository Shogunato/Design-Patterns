package Youtube;

//Methods that trigger an display for the user
public interface IObserver {
    
    void update();
    void subscribeChannel(Channel channel);

}
