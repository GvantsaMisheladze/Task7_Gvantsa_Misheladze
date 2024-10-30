public class Main1 {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();
        NotificationService.sendAlert(emailNotification, "Hello!");
        NotificationService.sendAlert(smsNotification, "Hello!");
    }
}
