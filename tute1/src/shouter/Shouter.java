package shouter;

public class Shouter {
    private String message;

    public Shouter(String message) {
        this.message = message;
    }

    public String allCaps() {
        return message.toUpperCase();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("Welcome to COMP2511!");
        System.out.println(s.allCaps());
    }
}
