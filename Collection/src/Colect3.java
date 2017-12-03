import java.util.*;
public class Colect3 {
	public static void main(String args[]){
	
		//LinkedHashSet<String> set=new LinkedHashSet<String>();
		//HashSet<String> set=new HashSet<String>();
		TreeSet<String> set=new TreeSet<String>();
		set.add("Ehsan");
		set.add("Majed");
		set.add("Majed");
		set.add("Jamshid");
		
		

		Iterator<String> itr=set.iterator(); 
		
		System.out.println("Forward :::::>");
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		
	}

}
