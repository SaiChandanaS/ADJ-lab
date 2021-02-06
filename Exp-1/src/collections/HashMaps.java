package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1227, "Gayathri");
		hm.put(1233, "Anjani");
		hm.put(1235, "Gowthami");
		hm.put(1236, "Sai");
		hm.put(1237, "Hima");
		hm.put(1238, "Nazma");
		hm.put(1239, "Mobina");
		
		Set keys = hm.entrySet();
		Iterator itr = keys.iterator();
		
		System.out.println("HashMap after insertion:");
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
		
		hm.remove(1235);
		System.out.println("HashMap after deletion:");
		Iterator itr1 = keys.iterator();
		while(itr1.hasNext()) {
			Map.Entry me = (Map.Entry)itr1.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
		
		hm.replace(1227,"Achutha");
		System.out.println("HashMap after replace operation:");
		Iterator itr2 = keys.iterator();
		while(itr2.hasNext()) {
			Map.Entry me = (Map.Entry)itr2.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
	}
}
