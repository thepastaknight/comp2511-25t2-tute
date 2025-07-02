package youtube;

public class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribeTo(Producer user) {
        // user.addSubscriber(this);
    }

    public void alertNewVideo(Video video) {
        System.out.println(name + ": A new video " + video.getName() + " was just posted from "
                + video.getProducer() + "!");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void notify(Video v) {
        
    }
}
