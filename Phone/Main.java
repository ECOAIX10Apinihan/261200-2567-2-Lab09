package Phone;

public class Main {
    public static void main(String[] args) {
        OrderProcessor emailOrder = new OrderProcessor(new EmailNotifier());
        emailOrder.processOrder(); // ใช้ EmailNotifier

        OrderProcessor smsOrder = new OrderProcessor(new SMSNotifier());
        smsOrder.processOrder(); // ใช้ SMSNotifier
    }
}
