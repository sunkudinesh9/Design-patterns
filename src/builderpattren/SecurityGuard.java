package builderpattren;

public class SecurityGuard implements PersonialNotifications {

	@Override
	public void message(String booking) {
		System.out.println("Message sent to SecurityGuard" + booking);

	}

}
