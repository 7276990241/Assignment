package assignment1;

public class Square {
	int sideLength;
	public Square(int sideLength)
	{
		this.sideLength = sideLength;
	}
	public int getArea()
	{
		int area = sideLength*sideLength;
		return area;
	}
	public int getPerimeter()
	{
		int perimeter = 4*sideLength;
		return perimeter;
	}
public static void main(String[] args)
{
	Square Square = new Square(5);
	int area = Square.getArea();
	int perimeter = Square.getPerimeter();
	System.out.println("Area of the square is:"+area);
	System.out.println("Perimeter of the square is:"+perimeter);
}
}
