package soal1;

//membuat class sphere yang merupakan turunan dari class Shape
//maka harus dilakukan extends dari Sphere dengan superclass yaitu Shape
//descendant of SHape
public class Sphere extends Shape 
{
	private double radius;
	
	public Sphere(double r)
	{
		super("Sphere");
		radius = r;
	}
	
	public double area()
	{
		return 4*Math.PI*radius*radius;
	}
	
	public String toString()
	{
		return super.toString() + " of radius " + radius;
	}

}
