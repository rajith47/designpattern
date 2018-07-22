package abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryName) {
		if(factoryName.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		if(factoryName.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		}
		return null;
	}
}
