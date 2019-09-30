import java.awt.Window.Type;

// Generic method 
// Generic Class
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generic types like T,K etc only allow reference types
		Integer[] intArray= {1,34,6,7,12,90,99};
		Double [] doubleArray= {12.0,12.0,56.89,89.9999};
		String[] strArray= {"One", "Two", "Three"};
		//System.out.println(intArray);
		/*
		printValue(10);
		printValue(10.9);
		printValue("Hello");
		int x=12;
		printValue(x);
		 */		
		/*printArray(strArray);
		printArray(intArray);
		printArray(doubleArray);
		printArray(new Integer[]{1,2,3,5});
		 */
		/*
		// Pass by value and Pass by reference
		int varA=10;
		Integer varB=100;
		Variable varC=new Variable();

		testMethod(varA);
		testMethod(varB);
		testMethod(varC);

		System.out.println("#: "+varA);
		System.out.println("#: "+varB);
		System.out.println("#: "+varC);
		 */
		
		Variable <Integer, String> v1=new Variable <Integer, String>(10,"Peter");
		
		System.out.println(v1);
		
	}

	// Generic Method
	public  static <T> void printValue(T var) {
		System.out.println("Value is: "+var+" Type is: "+ var.getClass());
	}

	//Generic Method
	public static <K> void printArray(K[] varArray) {
		System.out.print("[");
		for(K temp : varArray) {
			System.out.print(" "+ temp+"");
		}
		System.out.println("]");
	}

	// Not a Generic Method
	public static void testMethod(int x) {
		x=x+2;
		System.out.println(x);
	}

	// Not a Generic Method
	public static void testMethod(Integer x) {
		x=x+2;
		System.out.println(x);
	}

	/*
	// Not a Generic Method, arguement is passed as reference
	public static void testMethod(Variable x) {
		x.var=x.var+2;
		System.out.println(x.var);
	}
*/
}
// Generic Class
class Variable <T, K> {
	public T var1;
	public K var2;

	public Variable(T var1, K var2) {
		this.var1=var1;
		this.var2=var2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The value of Variable is: " + var1 + "   "+ var2;
	}
}
