//import java.util.Hashtable;
//import java.util.Map;
import java.util.*;
public class Hasht {
	public static void main(String args[]){
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(101,"Ehsan");
		ht.put(102,"Jamshid");
		ht.put(109,"Mohammad");
		
		for(Map.Entry<Integer,String> m:ht.entrySet()){
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
