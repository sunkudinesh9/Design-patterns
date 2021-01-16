package abstractpattren;

public abstract class AbstractFactory {
	abstract Shape getShape(String shape);
	abstract Color getColor(String shape);
}
