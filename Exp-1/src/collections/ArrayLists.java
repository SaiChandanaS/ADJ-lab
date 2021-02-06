package collections;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Nazma");
		al.add("Anjani");
		al.add("Gayathri");
		System.out.println("Array List elements inserted normally:"+al);
		al.add(1,"Hima");
		al.add(3,"Gowthami");
		System.out.println("ArrayList elements inserted based on index:"+al);
		al.remove("Gowthami");
		System.out.println("Array List element removed based on element:"+al);
		al.remove(1);
		System.out.println("Array List element removed based on their index:"+al);
	}
}
