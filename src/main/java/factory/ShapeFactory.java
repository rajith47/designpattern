package factory;

public class ShapeFactory {
	
	public static Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		if(shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		if(shape.equalsIgnoreCase("Squre")) {
			return new Squre();
		}
		return null;
	}

}
