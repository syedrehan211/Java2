class GFG {
// Method m1 with 0 parameter.
	public void m1()
	{
		System.out.println("No parameter method");
	}
// Method m1 with 1 integer parameter.
	public void m1(int i)
	{
		System.out.println("Int Parameter");
	}

	// Method m1 with 1 string parameter.
	public void m1(String s)
	{
		System.out.println("String Parameter");
	}
}

// Main Class
public class Main {

	public static void main(String[] args)
	{
		// Creating object for GFG class.
		// g is object of GFG class.
		GFG g = new GFG();

		// Here, m1 called with string parameter.
		// m1(String s) method will be called.
		g.m1("A");
	}
}


Output :
String Parameter
 
