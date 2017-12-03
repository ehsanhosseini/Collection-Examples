import java.util.Map;
import java.util.*;

enum num{
	one,two,three;
	}

public class EnumM1 {

	public static void main(String args[]){
		Map<num,Student> m=new EnumMap<num,Student>(num.class);
		
		Student s1=new Student(102,"Ehsan",50);
		Student s2=new Student(100,"Jamshid",54);
		Student s3=new Student(99,"Mohammad",55);
		
		
		m.put(num.one,s1);
		m.put(num.two,s2);
		m.put(num.three,s3);
		
		for(Map.Entry<num,Student> mp:m.entrySet()){
			Student s=mp.getValue();
			num n=mp.getKey();
			System.out.println("details::> "+n);
			System.out.println(s.id+" "+s.name+" "+s.age);
			
		}
	
		
		
		
		
		
		
	}
	
}
