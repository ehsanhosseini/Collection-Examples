import java.util.*;
public class Map3 {

	public static void main(String args[]){
		
		Map<Integer,String> m=new HashMap<Integer,String>();
		
		m.put(1,"Ehsan");
		m.put(2,"Majed");
		m.put(3,"Jamshid");
		
		
		
		for(Map.Entry<Integer, String> st:m.entrySet()){
		String s=st.getValue();
		int key=st.getKey();
		System.out.println(key+"::> "+s);
		
		}
	}
	
}
