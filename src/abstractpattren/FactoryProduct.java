package abstractpattren;

public class FactoryProduct {
	public static AbstractFactory getChoice(String choice) {
		if (choice == null) {
			return null;
		} else if (choice.equals("shape")) {
			return new ShapeFactory();
		} else if (choice.equals("color")) {
			return new ColorFactory();
		}
		return null;
	}
}
