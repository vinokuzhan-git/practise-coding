package datastructure.algorithm.hashtable;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashtableDemo {
	
	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>(10);
		
		ht.put(109, "English");
		ht.put(113, "Science");
		ht.put(211, "Tamil");
		ht.put(224, "Social");
		ht.put(235, "Maths");
		ht.put(109, "Botany");
		
		for(Integer key : ht.keySet())
		{
			System.out.println("HashCode : "+key.hashCode()+" Index : "+key%10+" key : "+key+" Value : "+ht.get(key));
		}
		
	}
}
