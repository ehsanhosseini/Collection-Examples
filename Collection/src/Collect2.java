//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.*;
public class Collect2 {
	public static void main(String args[]){
		
ArrayList<String> list=new ArrayList<String>();
		list.add("Ehsan");
		list.add("Majed");
		list.add("Majed");
		list.add("Jamshid");
		list.add(2,"Sachin");
		
	//	ArrayList<String> list2=new ArrayList<String>();
		//list2.add("Mohammad");
		//list2.add("Sara");
		//list2.add("Ehsan");
		//list.addAll(list2);
		//list.removeAll(list2);
		//list.retainAll(list2);
		
		System.out.println("second position : "+list.get(2));
		
		//Iterator itr=list.iterator();
		ListIterator<String> itr=list.listIterator(); 
		
		System.out.println("Forward :::::>");
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		System.out.println("backward <:::: ");
		while(itr.hasPrevious()){
			
			System.out.println(itr.previous());
		}
	}

}
