import java.util.Hashtable;
import java.util.*;
public class Hasht2 {
public static void main(String args[]){
	
	Student s1=new Student(201,"Ehsan",35);
	Student s2=new Student(200,"Jamshid",95);
	Student s3=new Student(190,"Omid",38);
	
	Map<Integer,Student> ht=new Hashtable<Integer,Student>();
	
	ht.put(1,s1);
	ht.put(2, s2);
	ht.put(3,s3);
	
	for(Map.Entry<Integer,Student> m:ht.entrySet()){
		int key=m.getKey();
		Student st=m.getValue();
		
		//System.out.println(" ::>Details "+key);
		System.out.println(key+" "+st.id+" "+st.name+" "+st.age);
		
	}
}
}
