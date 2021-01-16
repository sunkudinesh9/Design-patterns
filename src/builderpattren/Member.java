package builderpattren;

public class Member implements PersonialNotifications {
	@Override
	public void message(String booking) {
		System.out.println("Message sent to Member" + booking);

	}

}
