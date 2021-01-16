package builderpattren;

public class Coach implements PersonialNotifications {
	@Override
	public void message(String booking) {
		System.out.println("Message sent to Coach" + booking);

	}

}
