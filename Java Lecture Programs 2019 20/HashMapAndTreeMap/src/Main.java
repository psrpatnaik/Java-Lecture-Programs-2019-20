import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
// Map  key--->value
// enum in C
// Domain and Range  
// f(x1)=y    1----> "A"  "B"   value(1)
// f(x2)=y
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashMap<Integer, String> hmap
			 			=new HashMap<Integer,String>();

			hmap.put(1, "One");
			hmap.put(2, "Two");
			hmap.put(3, "Three");
			hmap.put(3, "THREE");

			//System.out.println(hmap);
			System.out.println(hmap.get(3));

			System.out.println();

			Set kset=hmap.keySet();

			for(Object temp : kset) {
				System.out.println((Integer)temp);
			}

			System.out.println("+++++++++");

			Iterator<Integer> i=kset.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		 */			

/*		Integer [] intArray
		= {1, 1, 2, 3, 1, 2, 4, 4, 5, 1, 0, 0, 0};

		HashMap <Integer, Integer> hmap
		=new HashMap<Integer, Integer>();

		HashSet<Integer> hs= new HashSet<Integer>();

		// O(n)
		for(Integer temp : intArray) {
			if(hs.add(temp)) {
				hmap.put(temp, 1);
			}else {
				hmap.put(temp, hmap.get(temp)+1);
			}
		}

		System.out.println(hmap);
*/
		Deque<Integer> stack= new LinkedList<Integer>();
		
		//Deque stack= new ArrayDeque()<>();
		
		stack.addFirst(1);
		stack.addLast(2);
		stack.addLast(3);
		System.out.println(stack);
		stack.removeLast();
		stack.removeFirst();
		System.out.println(stack);
		
		/*Stack
		aF 3 2 1 
		rF 3 3 1 
		
		Queue
		aF rL
		aL rF
		*/
		
		
		
		
		
	}
}
