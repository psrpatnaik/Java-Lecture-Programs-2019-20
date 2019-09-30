public class Main {
	public static void main(String[] args) {
		/*
		 // static non static and object references
		Student s1= new Student("Alex", 9);
		Student s11= new Student("Alex", 9);
		
		Student s2= new Student("Peter", 19);
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		Student s3 = s2; // NULL in C
		//System.out.println(s3.getName());
		//System.out.println(new Student("David", 29).getName());
		//System.out.println(s1.getRoll());
		s1=null;
		s2=null;
		s3=null; // s3=s2;
		 	
		System.out.println(s1); // prints HashCode
		System.out.println(s2);
		System.out.println(s3);

		if(s1==s11) {
			System.out.println("###");
		}

		if(s2==s3) {
			System.out.println("@@@");
		}
		
		// mutability of objects: mutable and immutable 
		String str1="Hello";
		String str4="Hello";
		String str2=new String("Hello");
		String str3=new String("Hello");
		System.out.println(10);
		if(str1==str2) {
			System.out.println("##");
		}
		
		if(str2==str3) {
			System.out.println("$$");
		}
		
		if(str1==str4) {
			System.out.println("&&");
		}
*/		
	/*	String strA=new String("Hello");
		System.out.println(strA.hashCode());
		
		String strB=new String("Java");
		strA=strA.concat(strB);
		
		System.out.println(strA.hashCode());
	*/	
		//StringBuffer (synchronized) older alternative to StringBuilder 
		
		/*
		StringBuilder strA=new StringBuilder("Hello");
		System.out.println(strA.hashCode());
		
		StringBuilder strB=new StringBuilder("Java");
		strA=strA.append(strB);
		
		System.out.println(strA.hashCode());
		*/
		
		// checking palindrome of a String using StringBuilder.
		String strOriginal="aaaaa";
		
		System.out.println(strOriginal
				.equals(new StringBuilder(strOriginal)
						.reverse()
						.toString()));

		Student s1= new Student("Alex", 9);
		System.out.println(s1);
	}		
}

// Object === JRE hasCode, toString, equals
class Sample{
	
}
class Student{
	// public, private, protected, default (no-access specifier)
	private String name="";
	private int roll=0;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}

	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
	

}
