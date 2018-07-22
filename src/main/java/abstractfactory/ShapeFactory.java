package abstractfactory;

public class ShapeFactory extends AbstractFactory{
	
	public  Shape getShape(String shape) {
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

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
