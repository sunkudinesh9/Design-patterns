package abstractpattren;

public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Color getColor(String shape) {
		if (shape == null) {
			return null;
		} else if (shape.equalsIgnoreCase("Red")) {
			return new Red();
		} else if (shape.equalsIgnoreCase("Green")) {
			return new Green();
		} else if (shape.equalsIgnoreCase("Orange")) {
			return new Orange();
		}
		return null;
	}

}
