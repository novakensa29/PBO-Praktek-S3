package soal1;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		super();
		height = 1.0;
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String color) {
		super(radius,color);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		height = height;
	}
	
	public double getVolume() {
		return super.getArea()*height;
	}
	
	public double getArea() {
		return super.getArea() + 2*super.getRadius()*Math.PI*height;
	}
	
	//overrides
	public String toString() { // in Cylinder class
		return "Cylinder: subclass of " + super.toString() // use Circle's toString()
		+ " height=" + height;

		}
}
