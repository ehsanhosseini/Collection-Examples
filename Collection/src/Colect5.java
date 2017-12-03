import java.util.*;
public class Colect5 {
	public static void main(String args[]){
	
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("Ehsan");
		q.add("Majed");
		q.add("Majed");
		q.add("Jamshid");
		
		q.remove();
		//q.poll();
		
		Iterator<String> itr=q.iterator(); 
		
	
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		
	}

}
