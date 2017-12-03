import java.util.*;

class Colect4 {
	public static void main(String args[]){
		
		Student s1=new Student(105,"Ehsan",32);
		Student s2=new Student(101,"Majed",30);
		Student s3=new Student(102,"Jamshid",29);

		TreeSet<Student> set=new TreeSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		//Iterator<Student> itr=set.iterator();
		
		
		for(Student obj:set){
			System.out.println(obj.id+" "+obj.name+" "+obj.age);
		}
	}

}
