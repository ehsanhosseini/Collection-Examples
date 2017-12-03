import java.util.*;

public class Map2 {
	public static void main(String args[]){
		TreeMap<Integer,Student> hm=new TreeMap<Integer,Student>();
		
		Student s1=new Student(100,"Ehsan",40);
		Student s2=new Student(99,"Majed",35);
		Student s3=new Student(103,"Jamshid",37);
		
		hm.put(2,s2);
		hm.put(3,s3);
		hm.put(1,s1);
		
		for(Map.Entry<Integer,Student> m:hm.entrySet()){
			//int key=(int) m.getKey();
			Student st=m.getValue();
			//System.out.print(key+"=>");
			System.out.println(st.id+" "+st.name+" "+st.age);
		}
	}

}
