import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*Integer[] intArray= new Integer[3];
			intArray[0]=0;
			intArray[1]=0;
			intArray[2]=0;
			// malloc, calloc, realloc [--- memory]
			//ArrayList <Integer> arrayIntList=new ArrayList<Integer>();
			LinkedList <Integer> arrayIntList=new LinkedList<Integer>();
			System.out.println(arrayIntList.size());
			
			arrayIntList.add(1);
			arrayIntList.add(10);
			arrayIntList.add(12);
			System.out.println("============");
			System.out.println(arrayIntList.size());
			System.out.println(arrayIntList);
			arrayIntList.remove(2);
			System.out.println("============");
			System.out.println(arrayIntList.size());
			System.out.println(arrayIntList);
			arrayIntList.add(1);
			arrayIntList.add(10);
			arrayIntList.add(12);
			System.out.println(arrayIntList);
			Collections.sort(arrayIntList);
			System.out.println("-------------");
			System.out.println(arrayIntList);
			
			System.out.println(
					Collections.binarySearch(arrayIntList, 2));
*/
	
			//Student [] studtentArry=new Student[5];
			ArrayList<Student> studentArry=new ArrayList<Student>();
			studentArry.add(new Student(12, "Peter"));
			studentArry.add(new Student(21, "Roger"));
			studentArry.add(new Student(11, "Alex"));
			studentArry.add(new Student(24, "David"));
			/*System.out.println("Before Sort");
			System.out.println(studentArry);
			Collections.sort(studentArry);
			System.out.println("After Sort");
			System.out.println(studentArry);
			
			//Collections.sort(studentArry,new StudentComaparator());
			
			Collections.sort(studentArry, 
					new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					return o2.getName().compareTo(o1.getName());
				}
			});
			
			System.out.println("After Sort using Comparator");
			System.out.println(studentArry);
			*/
			
			for(Student std : studentArry) {
				System.out.println(std);
			}
			
			System.out.println("===============");
			
			Iterator<Student> i=studentArry.iterator();
			
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			
			
	}

}

// 1) Comparable
// 2) Comparator
/*
class StudentComaparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
	}
	
}
*/
class Student implements Comparable<Student>{
	private Integer roll=0;
	private String name="";
	
	
	public Student(Integer roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.roll < o.getRoll()) {
			return -1;	
		}
		else {
			if(this.roll > o.getRoll()) {
				return 1;
			}else {
				return 0;
			}
		}
		
	}
}

