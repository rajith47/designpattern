package abstractfactory;

public class ColorFactory extends AbstractFactory {
	
	public  Color getColor(String color) {
		if(color.equalsIgnoreCase("Blue")) {
			return new Blue();
		}
		if(color.equalsIgnoreCase("Green")) {
			return new Green();
		}
		if(color.equalsIgnoreCase("Red")) {
			return new Red();
		}
		return null;
	}

	@Override
	public Shape getShape(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
