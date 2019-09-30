// Wrapper Classes in Java (special)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		Integer i= new Integer(10);
		System.out.println(++x + 3);
		System.out.println(++i + 3);

		int y=0;
		Integer z= new Integer(0);

		y=i; //var (int) <---- obj (Integer)  // un-boxing
		z=x; // obj (Integer) <----- var (int) // boxing

		System.out.println("Y: "+y);
		System.out.println("Z: "+z);

		int var=12201;

		Integer varWrapper= new Integer(var);

		String varString=new StringBuilder(varWrapper.toString())
				.reverse()
				.toString();
		System.out.println("int palidrome ?: "+varWrapper.toString().equals(varString));

		int var2=Integer.parseInt("F",16);
		System.out.println(var2);
		System.out.println(varWrapper.floatValue());
	
	}




}

