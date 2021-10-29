package soal2;

public class Shape {
	protected String color = "red";
	protected boolean filled = true;
	
	public Shape() {
		color = "green";
		filled = true;
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		if (isFilled() == true) {
			return "A Shape with color of " + color + " and " + "filled";
		} else {
			return "A Shape with color of " + color + " and " + "not filled";
		}		
	}
}
