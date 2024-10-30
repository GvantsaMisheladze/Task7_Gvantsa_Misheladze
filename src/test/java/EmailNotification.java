public class EmailNotification extends Notification {
    @Override
    void sendNotification(String message) {
        System.out.println("Email Notification: " + message);
    }
}
