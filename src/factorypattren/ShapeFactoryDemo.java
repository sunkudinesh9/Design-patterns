package factorypattren;

public class ShapeFactoryDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		Shape rectangle = shapeFactory.getShape("Rectangle");
		rectangle.draw();
		Shape triangle = shapeFactory.getShape("Triangle");
		triangle.draw();
	}
}
