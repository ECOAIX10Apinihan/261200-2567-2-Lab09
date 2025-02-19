package Phone;

public class OrderProcessor {
    private final Notifier notifier;

    // Dependency Injection
    public OrderProcessor(Notifier notifier) {
        this.notifier = notifier;
    }

    public void processOrder() {
        System.out.println("Processing order...");
        notifier.notify("Order processed");
    }
}
