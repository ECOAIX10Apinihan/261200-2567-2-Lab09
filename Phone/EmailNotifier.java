package Phone;

public class EmailNotifier implements Notifier {
    @Override
    public void notify(String message) {
        System.out.println("Sending Email: " + message);
    }
}
