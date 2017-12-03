import java.util.*;
//import java.util.Map.Entry;
public class HashMapSyn {

	public static void main(String args[]){
		
		Map<Integer,String> m=new HashMap<Integer,String>();
		
		m.put(1,"Majed");
		m.put(2,"Jamshid");
		m.put(3,"Ehsan");
		
		Map<Integer,String> map=Collections.synchronizedMap(m);
		
		Set set=map.entrySet();
		
		synchronized(map){
		
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
		
		}
		}
		
	}
}
