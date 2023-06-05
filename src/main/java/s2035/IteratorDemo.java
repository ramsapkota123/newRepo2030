package s2035;

import java.util.ArrayList;
import java.util.Iterator;



public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> c=new ArrayList<String>();
		c.add("ram");
		c.add("usa");
		c.add("nepal");
		c.add("nepal");
		c.add("srilnka");
		
		Iterator<String>i=c.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.hasNext());
//	while(i.hasNext()){
//		System.out.println(i.hasNext());
//		
//	}

	}

}
