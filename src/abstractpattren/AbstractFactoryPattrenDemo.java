package abstractpattren;

public class AbstractFactoryPattrenDemo {
	public static void main(String[] args) {
		AbstractFactory shape = FactoryProduct.getChoice("shape");
		Shape circle = shape.getShape("circle");
		circle.draw();
		Shape rectangle = shape.getShape("Rectangle");
		rectangle.draw();
		Shape triangle = shape.getShape("Triangle");
		triangle.draw();

		System.out.println("___________________________");

		AbstractFactory color = FactoryProduct.getChoice("color");
		Color red = color.getColor("Red");
		red.fill();
		Color green = color.getColor("Green");
		green.fill();
		Color oragne = color.getColor("Orange");
		oragne.fill();

	}
}
