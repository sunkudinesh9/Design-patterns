package builderpattren;

public class BuilderClasssDemo {
	public static void main(String[] args) {
		AbstractNotificationClass notification = NotificationBuilder.getNotification("premium");
		notification.notification();
	}
}
