package builderpattren;

import java.util.ArrayList;
import java.util.List;

public class AbstractNotificationClass {

	List<PersonialNotifications> membersList = new ArrayList<>();
	String booking;

	public void notification() {
		for (PersonialNotifications member : membersList) {
			member.message(booking);
		}
	}

}
