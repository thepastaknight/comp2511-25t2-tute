package youtube;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Subscriber {
    private String name;
    private List<Video> videos = new ArrayList<Video>();
    private List<Subscriber> subscribers = new ArrayList<>();

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void subscribe(Subscriber u) {
        subscribers.add(u);
    }

    public void unsubscribe(Subscriber u) {
        subscribers.remove(u);
    }

    public void post(Video v) {
        subscribers.stream().forEach(s -> s.notify(v));
    }

    @Override
    public void notify(Video v) {
        
    }
}
