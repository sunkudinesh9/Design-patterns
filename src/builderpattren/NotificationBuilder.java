package builderpattren;

public class NotificationBuilder {
	public static AbstractNotificationClass getNotification(String booking) {
		if (booking.equalsIgnoreCase("member")) {
			return memberBooking(booking);
		} else if (booking.equalsIgnoreCase("coaching")) {
			return coaching(booking);
		} else if (booking.equalsIgnoreCase("premium")) {
			return preminum(booking);
		}
		return null;

	}

	public static AbstractNotificationClass memberBooking(String booking) {
		AbstractNotificationClass notification = new AbstractNotificationClass();
		notification.booking = booking;
		notification.membersList.add(new SecurityGuard());
		notification.membersList.add(new Member());
		return notification;
	}

	public static AbstractNotificationClass coaching(String booking) {
		AbstractNotificationClass notification = new AbstractNotificationClass();
		notification.booking = booking;
		notification.membersList.add(new SecurityGuard());
		notification.membersList.add(new Member());
		notification.membersList.add(new Coach());
		return notification;
	}

	public static AbstractNotificationClass preminum(String booking) {
		AbstractNotificationClass notification = new AbstractNotificationClass();
		notification.booking = booking;
		notification.membersList.add(new SecurityGuard());
		notification.membersList.add(new Member());
		notification.membersList.add(new Coach());
		notification.membersList.add(new FecilitateManager());
		return notification;
	}
}
