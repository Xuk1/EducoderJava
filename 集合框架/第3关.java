package step3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HelloWorld {
	
	public HashSet getHashSet(){
		/********** Begin **********/
		HashSet hs = new HashSet();
		hs.add("www.educoder.net");
		return hs;
		/********** End **********/
	}
	
	public ArrayList getArrayList(){
		/********** Begin **********/
		ArrayList al = new ArrayList();
		al.add("www.educoder.net");
		return al;
		/********** End **********/
	}
	
	public LinkedList getLinkedList(){
		/********** Begin **********/
		LinkedList ll = new LinkedList();
		ll.add("www.educoder.net");
		return ll;
		/********** End **********/
	}
	
	public Map getHashMap(){
		/********** Begin **********/
		HashMap hm = new HashMap();
		hm.put("address", "www.educoder.net");
		return hm;
		/********** End **********/
	}	
	
}
