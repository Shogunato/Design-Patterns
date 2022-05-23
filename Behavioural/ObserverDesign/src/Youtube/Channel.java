package Youtube;

import java.util.List;
import java.util.ArrayList;

//To be observed
public class Channel implements ISubject {

    private String title;
    private List<Subscriber> subs = new ArrayList<>();

    @Override
    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }
    
    @Override
    public void unsubscribe(Subscriber sub) {
        subs.remove(sub);
    }

    @Override
    public void notifySubscribers() {
        subs.forEach(sub -> sub.update());
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscribers();
    }
    
    public String getTitle() {
        return title;
    }

}
