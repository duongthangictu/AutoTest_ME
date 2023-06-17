package abstaction_Shape;

public abstract class Shape {
	private String color = "red";
	
	public abstract void draw();
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
}
