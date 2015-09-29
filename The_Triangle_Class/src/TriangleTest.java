import junit.framework.TestCase;

public class TriangleTest extends TestCase {

	private Triangle triangle1 = new Triangle(7, 5.6, 8.9);
	private Triangle triangle2 = new Triangle(5.8, 4, 8);
	private Triangle triangle3 = new Triangle(73, 92, 75);
	private Triangle triangle4 = new Triangle(16, 12, 14);
	
	// test cases for area
	public void test_Area(){
		assertEquals(19.6, triangle1.getArea(), .1);
		assertEquals(11.03, triangle2.getArea(), .01);
		assertEquals(2665.8, triangle3.getArea(), .1);
		assertEquals(81.3, triangle4.getArea(), .1);
	}
	
	// test cases for perimeter
	public void test_Perimeter(){
		assertEquals(21.5, triangle1.getPerimeter(), .1);
		assertEquals(17.8, triangle2.getPerimeter(), .1);
		assertEquals(240, triangle3.getPerimeter(), .1);
		assertEquals(42, triangle4.getPerimeter(), .1);
	}	
	
}
