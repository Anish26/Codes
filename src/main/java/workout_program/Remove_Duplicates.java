package workout_program;

import java.util.ArrayList;
import java.util.Iterator;

public class Remove_Duplicates {

	public static void main(String[] args, Object element) {
//		ArrayList<Object> al = new ArrayList<Object>(); 
//		al.add(1, element);
//		al.add(2, element);
//		al.add(2, element);
//		al.add(6, element);
//		al.add(7, element);
//		al.add(3, element);
//		al.add(4, element);
//		al.add(4, element);
//		al.add(5, element);
//		al.add(5, element);
//		al.add(6, element);
//		al.add(7, element);
//		System.out.println("Before Remove Duplicate elements:"+al);
//		for (int i = 0; i <al.size(); i++) {
//			for (int j = 0; j <al.size(); j++) {
//				if(al.get(i).equals(al.get(j))) {
//					al.remove(j);
//					j--;
//				}
//							
//			}
//			
//		}
//		System.out.println("After Remove Duplicate elements:"+al);
		
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		ArrayList a3 = new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(2);
		a1.add(6);
		a1.add(7);
		a1.add(3);
		a1.add(4);
		a1.add(4);
		a1.add(5);
		a1.add(5);
		a1.add(6);
		a1.add(7);
		System.out.println(a1);
		Iterator i1 = a1.iterator();
		a1.removeDuplicate();
		
		
		}

}
