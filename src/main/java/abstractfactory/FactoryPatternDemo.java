package abstractfactory;

public class FactoryPatternDemo {
		
	public static void main(String[] args) {
		ColorFactory cf = (ColorFactory)FactoryProducer.getFactory("color");
		Color c =cf.getColor("red");
		c.fill();
	}
		
}
