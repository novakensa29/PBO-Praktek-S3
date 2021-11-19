package soal1;

//menulis abstract class Shape (sebagai superclass)
abstract class Shape {
	//membuat object/variable shapeName
	private String shapeName;
	
	//membuat costructor pada class Shape
	//constructor adalah suatu method yang berfungsi untuk memberikan 
	//nilai pada suatu objek yang dibuat
	public Shape(String Name)
	{
		shapeName = Name;
	}
	
	//membuat abstract method area
	abstract public double area();
	
	//membuat method toString yang akan memngembalikan nama dari shape
	//method ini nantinya akan dipanggil lagi di subclass (overriding)
	public String toString()
	{
		return shapeName;
	}
}

