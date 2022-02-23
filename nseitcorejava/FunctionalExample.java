package nseitcorejava;

interface Area

{
	public int FindArea(int length,int breadth);
	
}
class FindArea implements Area
{
	public int FindArea(int length,int breadth)
	{
	System.out.println("Area Is :");
	return length*breadth;
	}

}
public class FunctionalExample
{

	public static void main(String[] args) 
	{
		FindArea a1=new FindArea();
		System.out.println(a1.FindArea(5, 7));

	}

}
