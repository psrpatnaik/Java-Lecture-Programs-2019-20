
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA=new A();
		B objB=new B();
		B objB1=objB;

		 /*System.out.println(objA.varA);
		System.out.println(new B().varB);
		 */
		/*System.out.println(objA.varAStatic);	
		System.out.println(A.varAStatic);
		//System.out.println(A.varA);
		 */
		new A().methodNonStaticA();
		
		A.methodStaticA();
	}

}

class A{
	int varA=0;
	static int varAStatic=10;
	void methodNonStaticA() {
		System.out.println("this "+this.varA);
		System.out.println("this static "+varAStatic);
	}
	static void methodStaticA() {
		int tempVar=0;
		System.out.println("static "+varAStatic);
	}
}

class B{
	int varB=10;
	static int varBStatic=0;
	void methodNonStaticB() {
		int localVar=0;
	}
	static void methodStaticB() {

	}

}


/*
int main() {
	static int x=0;
}

void foo() {
	int x=0;
}*/