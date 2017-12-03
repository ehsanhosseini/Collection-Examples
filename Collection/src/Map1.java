import java.util.*;
public class Map1 {
	public static void main(String args[]){
		
		TreeMap<Integer,String> m=new TreeMap<Integer,String>();
		
		m.put(106,"Ehsan");
		m.put(107,"Ehn");
		m.put(102,"Mohammad");
		//m.remove(100);
		
		for(Map.Entry mp:m.entrySet()){
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
		
		
	}

}
