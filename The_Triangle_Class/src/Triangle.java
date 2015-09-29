
public class Triangle extends GeometricObject {

	// double data fields with default values 1.0 to denote 3 sides of the triangle
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	// a no-arg constructor that creates a default triangle
	public Triangle(){
		super();
	}
	
	// a constructor that creates a triangle with the specified side1 side2 and side3
	public Triangle(double side1, double side2, double side3){
		super();
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
	}
	
	// the accessor methods for all 3 data fields
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	
	// method that returns the area of this triangle
	public double getArea(){
		double s = 0.5 * (side1 + side2 + side3);
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), .5);
		return area;
	}
	
	// method that returns the perimeter of this triangle
	public double getPerimeter(){
		double perimeter = (side1 + side2 + side3);
		return perimeter;
	}
	
	// method that returns string description for the triangle
	public String toString(){
		return ("Triangle with side lengths " + side1 + ", " + side2 + ", and " + side3 + " has area " + getArea() + " and perimeter " + getPerimeter());
	}
	
}
