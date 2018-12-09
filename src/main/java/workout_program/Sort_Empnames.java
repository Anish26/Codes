package workout_program;

import java.util.Iterator;
import java.util.TreeSet;

public class Sort_Empnames {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("John");
		ts.add("Pradeep");
		ts.add("Mary");
		ts.add("Ramya");
		//Sorting elements
		Iterator<String> iterator = ts.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		

	}

}
