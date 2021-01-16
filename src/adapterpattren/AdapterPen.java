package adapterpattren;

public class AdapterPen implements Pen {

	UnKnownImplementationForPen uifp = new UnKnownImplementationForPen();

	@Override
	public void wrire(String wrirte) {
		uifp.wrire(wrirte);
	}

}
