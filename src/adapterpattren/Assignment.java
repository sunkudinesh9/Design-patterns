package adapterpattren;

public class Assignment {
	private Pen pen;

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void startAssignment(String message) {
		getPen().wrire(message);
	}

	@Override
	public String toString() {
		return "Assignment [pen=" + pen + "]";
	}

}
