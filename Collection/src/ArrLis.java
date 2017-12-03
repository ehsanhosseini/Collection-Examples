import java.util.*;  
import java.util.Enumeration;
class ArrLis{  
public static void main(String args[]){  
  
//ArrayList<String> al=new ArrayList<String>();  

//al.add("Viru");  
//al.add("Saurav");  
//al.add("Mukesh");  
//al.add("Tahir");
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	al.add(Integer.valueOf(60));
	al.add(99);
	al.add(10);
	
Collections.sort(al); 

Iterator<Integer> itr=al.iterator();
while(itr.hasNext()){
	
	System.out.println(itr.next());
	
}


/*Enumeration<Integer> en=Collections.enumeration(al);
while(en.hasMoreElements()){  
System.out.println(en.nextElement());  
 }*/  
}  
} 