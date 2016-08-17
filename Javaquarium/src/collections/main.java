package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

public class main {
	
	public static void main(String[] args) {
		List l = new LinkedList();
			l.add(12); 
			l.add("toto !");
			l.add(12.20f);

			
		System.out.println("=== LINKED LIST === ");
		for(int i = 0; i < l.size(); i++) 
			System.out.println("\t Elements à l'index " + i + " = " + l.get(i));
		
		System.out.println("\n \t = Parcours avec un itérateur = ");
		
		ListIterator li = l.listIterator();
		
		while(li.hasNext())
			System.out.println("\t"+li.next());
	
		System.out.println("\n === ARRAY LIST === ");
		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add("Une chaine !");
		al.add('d');
		al.add(12.20f);
		
		for(int i = 0; i<al.size(); i++) 
		{
			System.out.println("\t Elements à l'index " + i + " = " + al.get(i));
		}
		
		System.out.println("\n === HASHTABLE === ");
		
		Hashtable ht = new Hashtable();
		ht.put(1,"printemps");
		ht.put(11, "été");
		ht.put(21, "automne");
		ht.put(31, "hiver");
		
		Enumeration e = ht.elements();
		
		while(e.hasMoreElements())
			System.out.println("\t" + e.nextElement());
		
		System.out.println("\n === HASHSET === ");
		
		HashSet hs = new HashSet();
		hs.add("toto");
		hs.add(12);
		hs.add('d');
		
		System.out.println("\n \t = Parcours avec un itérateur = ");
		Iterator it = hs.iterator();
		while(it.hasNext())
			System.out.println("\t" + it.next());
		
		System.out.println("\n \t = Parcours avec un tableau d'objet = ");
		
		Object[] obj = hs.toArray(); 
		for(Object o : obj) 
			System.out.println("\t" + o);
		
	}
}
	

