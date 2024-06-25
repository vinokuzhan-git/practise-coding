package datastructure.algorithm.hashtable;

import java.util.Hashtable;

public class HashtableSting {
	
	public static void main(String[] args) {
    Hashtable<String,String> ht = new Hashtable<String,String>(10);
		
    ht.put("109", "English");
	ht.put("113", "Science");
	ht.put("211", "Tamil");
	ht.put("224", "Social");
	ht.put("235", "Maths");
	ht.put("109", "Botany");
	
	for(String key : ht.keySet())
	{
		System.out.println("HashCode : "+key.hashCode()+" Index : "+key.hashCode()%ht.size()+" key : "+key+" Value : "+ht.get(key));
	}
	}

}
