
// Interfaces and Abstract Classes
public class Main {
	public static void main(String[] args) {
			//A1 a=new A1();
			A2 a2=new A2();
			/*System.out.println(a2.getA());
			a2.setA(19);
			System.out.println(a2.getA());
			*/
			System.out.println(a2.i1);
			System.out.println(a2.a);
			System.out.println(A2.i1);
			
	}
}

interface I1{
	public int i1=12;
	
	public void seti1();
	
	public int geti1();

}

abstract class A1{
	public int a=10;

	public int getA() {
		return a;
	}

	public abstract void setA(int a);	

}

class A2 extends A1 implements I1{

	public int a2=100;

	public int getA2() {
		return a2;
	}

	public void setA2(int a2) {
		this.a2 = a2;
	}

	@Override
	public void setA(int a) {
		// TODO Auto-generated method stub
		//System.out.println();
		this.a=a+a;
	}

	@Override
	public void seti1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int geti1() {
		// TODO Auto-generated method stub
		return 0;
	}
}



interface GeometricShape{
	public double getPerimeter();
	public double getArea();
}

interface ConicalShape{
	public double getPerimeter();
	public double getArea();
}

abstract class Quadrilateral implements GeometricShape{
	int s1=0;
	int s2=0;
	int s3=0;
	int s4=0;
	public double getPerimeter() {
		return (s1+s2+s3+s4);
	}
	public abstract double getArea();
}

class Square extends Quadrilateral{

	public Square(int side) {
		s1=s2=s3=s4=side;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return s1*s1;
	}
	
}

