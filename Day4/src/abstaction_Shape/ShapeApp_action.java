package abstaction_Shape;

public class ShapeApp_action {

	public static void main(String[] args) {
		Shape rect = new Rectangle(); // Gọi phương thức cha của tính đóng gói(cái tạo ra ban đầu) = new Cái con định thực thi
		// QUá trình Upcasting
		rect.setColor  ("Green");
		rect.draw();
		
		Shape circle = new Circle();
		circle.draw();
	}

}
