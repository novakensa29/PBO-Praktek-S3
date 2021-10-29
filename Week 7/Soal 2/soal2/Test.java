package soal2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape();
		System.out.println("Shape," + "\n"
				+ "color=" + s1.getColor() + "\n"
				+ "filled=" + s1.isFilled() + "\n"
				+ s1.toString() + "\n\n");
		
		Circle c1 = new Circle();
		System.out.println("Circle," + "\n"
				+ "color=" + c1.getColor() + "\n"
				+ "filled=" + c1.isFilled() + "\n"
				+ "ridius=" + c1.getradius() + "\n"
				+ "area=" + c1.getArea() + "\n"
				+ "perimeter=" + c1.getPerimeter() + "\n"
				+ c1.toString() + "\n\n");
		
		Rectangle r1 = new Rectangle();
		System.out.println("Rectangle," + "\n"
				+ "color=" + r1.getColor() + "\n"
				+ "filled=" + r1.isFilled() + "\n"
				+ "width=" + r1.getWidth() + "\n"
				+ "length=" + r1.getLength() + "\n"
				+ "area=" + r1.getArea() + "\n"
				+ "perimeter=" + r1.getPerimeter() + "\n"
				+ r1.toString() + "\n\n");
		
		Square ss1 = new Square();
		System.out.println("Square," + "\n"
				+ "color=" + ss1.getColor() + "\n"
				+ "filled=" + ss1.isFilled() + "\n"
				+ "width=" + ss1.getWidth() + "\n"
				+ "length=" + ss1.getLength() + "\n"
				+ "side=" + ss1.getSide() + "\n"
				+ "area=" + ss1.getArea() + "\n"
				+ "perimeter=" + ss1.getPerimeter() + "\n"
				+ ss1.toString() + "\n\n");
	}

}
