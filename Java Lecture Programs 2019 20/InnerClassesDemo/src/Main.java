// Nested Classes
class LivingBeing{
	public boolean canWalk() {
		return true;
	}
}

interface Plants{
	public boolean canEat();
}


public class Main {
	
	
	static {
	}
	
	// multiple args in java methods
	public static int addNumbers(int... y) {
		int sum=0;
		for (int temp: y) {
			sum=sum+temp;
		}
		return sum;
	}
	
	public static int var=9;
	
	public static void main(String[] args) {
		
		System.out.println(addNumbers());
		
		
		/*	
		// Anonymous class extending class
		new LivingBeing() {
			
			public boolean canWalk() {
			return false;
			}
		}.canWalk();
		
		// Anonymous class implementing Interface
		new Plants() {
			public boolean canEat() {
				return true;
			}
		}.canEat();
	*/	
/*		System.out.println("Static Main method");
		System.out.println(Main.var);
		
		//System.out.println(x);
		Outer objO=new Outer();
		//creating object of non static inner class
		// you need object of outer class
		Outer.Inner objIn=  objO. new Inner();
		//creating object of static inner class
		// you do not need object of outer class

		Outer.InnerStaticClass objInstatic= 
				new Outer.InnerStaticClass();
*/		
	}

}
//

/*class Outer{
	int var=90;
	class Inner{
	
	}
	
	public void method() {
		class LocalInnerClass{
				
		}
		LocalInnerClass obj=new LocalInnerClass();
	}
	
	static class InnerStaticClass{
		
	}
}
*/
// Anonymous Local Inner Class


