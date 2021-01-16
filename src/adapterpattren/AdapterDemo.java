package adapterpattren;

public class AdapterDemo {
	public static void main(String[] args) {
		Assignment assignment = new Assignment();
		AdapterPen pen = new AdapterPen();
		assignment.setPen(pen);
		assignment.startAssignment("Started Assignemnt");
	}
}
