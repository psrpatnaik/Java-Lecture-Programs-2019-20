// Inheritance and Polymorphism
// C++
// 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Superclass s1=new Superclass();
			Subclass s2= new Subclass();
			/*
			// A
			s1.getName();
			s2.getName();
			((Superclass)s2).getName();
			*/
			
			/*// Polymorhism
			Superclass s3=null;
			s3=new Superclass();
			s3.getName();
			s3=new Subclass();
			s3.getName();
			*/
			/*
			System.out.println(s1.var);
			s1.var=9;
			System.out.println(s2.var);
			System.out.println(((Superclass)s2).var);
			*/
			
			System.out.println(s1.varStatic);
			s1.varStatic=199;
			System.out.println(((Superclass)s2).varStatic);
	}

}

class Superclass{
	public static int varStatic=19;
	public int var=10;
	public void getName() {
		System.out.println("Superclass");
	}
}

class Subclass extends Superclass
{
	public static int varStatic=1999;
	public int var=100; // data hiding
	// Java Annotations
	@Override
	public void getName() { // method overriding
		System.out.println("Subclass");
	}
}

