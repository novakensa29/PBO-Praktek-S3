
public class TetstCylinder {

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		System.out.println("Cylinder :" + "\n"
				+ "radius=" + c1.getRadius() + "\n"
				+ "height=" +c1.getHeight() + "\n"
				+ "color=" +c1.getColor()  + "\n"
				+ "To String=" + c1.toString() + "\n" //yang terpanggil yang di Cylinder.java
				+ "base area=" + c1.getArea() + "\n"
				+ "Volume=" + c1.getVolume() + "\n\n"
				);
		Cylinder c2 = new Cylinder(10.0);
		System.out.println("Cylinder :" + "\n"
				+ "radius=" + c2.getRadius() + "\n"
				+ "height=" +c2.getHeight() + "\n"
				+ "color=" +c2.getColor() + "\n"
				+ "To String=" + c2.toString() + "\n"
				+ "base area=" + c2.getArea() + "\n"
				+ "Volume=" + c2.getVolume() + "\n\n"
				);
		Cylinder c3 = new Cylinder(2.0,10.0,"green");
		System.out.println("Cylinder :" + "\n"
				+ "radius=" + c3.getRadius() + "\n"
				+ "height=" +c3.getHeight() + "\n"
				+ "color=" +c3.getColor() + "\n"
				+ "To String=" + c3.toString() + "\n"
				+ "base area=" + c3.getArea() + "\n"
				+ "Volume=" + c3.getVolume() + "\n\n"
				);
	}

}
