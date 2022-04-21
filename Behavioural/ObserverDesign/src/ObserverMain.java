import Youtube.*;

public class ObserverMain {

    public static void main(String[] args) {

        Channel ch =  new Channel();
        Subscriber sub1 = new Subscriber("Telusko");
        Subscriber sub2 = new Subscriber("Bro Code");
        Subscriber sub3 = new Subscriber("Java");
        Subscriber sub4 = new Subscriber("Python");
        Subscriber sub5 = new Subscriber("HackerRank");

        ch.subscribe(sub1);
        ch.subscribe(sub2);
        ch.subscribe(sub3);
        ch.subscribe(sub4);
        ch.subscribe(sub5);

        ch.unsubscribe(sub3);

        sub1.subscribeChannel(ch);
        sub2.subscribeChannel(ch);
        sub3.subscribeChannel(ch);
        sub4.subscribeChannel(ch);
        sub5.subscribeChannel(ch);

        ch.upload("Programming 101");

    }

}
