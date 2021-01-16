package abstractpattren;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		if (shape == null) {
			return null;
		} else if (shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		return null;
	}

	@Override
	Color getColor(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
