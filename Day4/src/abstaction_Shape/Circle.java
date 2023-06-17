package abstaction_Shape;

public class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Use color is " + super.getColor() + " to draw Circle");
	}
}
