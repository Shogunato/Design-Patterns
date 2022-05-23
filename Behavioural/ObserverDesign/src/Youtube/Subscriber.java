package Youtube;


//The observer
public class Subscriber implements IObserver {
    
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey "+name+" Video Uploaded: "+channel.getTitle());
    }

    @Override
    public void subscribeChannel(Channel ch) {
        this.channel = ch;
    }

    public Channel getChannel() {
        return channel;
    }

}
