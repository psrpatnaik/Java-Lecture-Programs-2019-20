
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x=9;
		/*System.out.println(addNumbes(10, 11));
		System.out.println(addNumbes(10.0f, 11.0f));
		System.out.println(addNumbes(10.00, 11.00));
		 */

		//Superclass objA=new Superclass();
		//Subclass objB=new Subclass(10);

		//System.out.println(objB.var2);
		//objB.var2=23;

		// Singleton classes
	
		Superclass objC=Superclass.createObject();
		System.out.println(objC.var);
		Superclass objD=Superclass.createObject();
		objC.var=199;
		System.out.println("---------");
		System.out.println(objD.var);
		//System.out.println(objA.var);

		//objA.var=20;

	}

	public static <T extends Number ,K extends Number> 
	K addNumbes(T x, T y) {
		K z;
		double temp = x.doubleValue() + y.doubleValue();
		z = (K) new Double(temp);
		return z;
	}

}


interface I1{
	public int var2=19;
}

class Superclass{

	static Superclass ref=null;

	private Superclass() {
		//super();
		System.out.println("Default constructor of Superclass");
	}

	public Superclass(int x) {
		//super();
		System.out.println("Parameterized constructor of Superclass");
	}

	public final void sampleMethod() {
		System.out.println("Sample Method");
	}

	public int var=99;

	public static Superclass createObject() {
		if(ref==null) {

			ref= new Superclass();
			return ref;	
		}
		{
			return ref;
		}

	}
}
/*
class Subclass extends Superclass implements I1{

	public Subclass() {
		//super();
		System.out.println("Default constructor of Subclass");
	}

	public Subclass(int x) {
		super(x);
		System.out.println("Parameterized constructor of Subclass");

	}

	public void sampleMethod() {
		System.out.println("Sample Method");
	}
}*/

// Inner classes