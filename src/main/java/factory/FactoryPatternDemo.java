package factory;

public class FactoryPatternDemo {
		
	public static void main(String[] args) {
		Shape shape1 = ShapeFactory.getShape("circle");
		shape1.draw();
	}
		
}
