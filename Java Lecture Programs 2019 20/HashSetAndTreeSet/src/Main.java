import java.util.HashSet;
import java.util.TreeSet;

//HashSet
//TreeSet

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashSet<Integer> hs =new HashSet<Integer>();
		System.out.println(hs.add(11));
		System.out.println(hs.add(21));
		System.out.println(hs.add(3));
		System.out.println(hs.add(11));
		System.out.println(hs);
		
		TreeSet<Integer> ts =new TreeSet<Integer>();
		System.out.println(ts.add(11));
		System.out.println(ts.add(21));
		System.out.println(ts.add(3));
		System.out.println(ts.add(11));
		System.out.println(ts);
		*/

		HashSet<Student> hstudents =new HashSet<Student>();
		System.out.println(hstudents.add(new Student(12, 22)));
		System.out.println(hstudents.add(new Student(13, 23)));
		System.out.println(hstudents.add(new Student(14, 23)));
		System.out.println(hstudents.add(new Student(14, 23)));
		
		System.out.println(hstudents);
	
		TreeSet<Student> tstudents =new TreeSet<Student>();
		System.out.println(tstudents.add(new Student(12, 22)));
		System.out.println(tstudents.add(new Student(13, 25)));
		System.out.println(tstudents.add(new Student(14, 23)));
		System.out.println(tstudents.add(new Student(14, 23)));
		
		System.out.println(tstudents);
	
		
	}

}
class Student implements Comparable<Student>{
	private int roll=0;
	private int age=0;
	
	public Student(int roll, int age) {
		super();
		this.roll = roll;
		this.age = age;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + roll;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.age < o.getAge()) {
			return -1;
		}else {
			if(this.age > o.getAge()) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}
	
	
}