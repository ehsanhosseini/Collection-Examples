import java.util.*;
class Colect6 {
	public static void main(String args[]){
		
		Student s1=new Student(100,"Ehsan",32);
		Student s2=new Student(101,"Jamshid",30);
		Student s3=new Student(102,"Majed",29);
		
	
		PriorityQueue<Student> q=new PriorityQueue<Student>();
		q.add(s1);
		q.add(s2);
		q.add(s3);
	
		Iterator<Student> itr=q.iterator();
		System.out.println("Before removing : ");
		while(itr.hasNext()){
			Student st=(Student)itr.next();
			System.out.println(st.id+" "+st.name+" "+st.age);
		}
		
		q.remove();
		System.out.println("After removing : ");
		for(Student st2:q){
			System.out.println(st2.id+" "+st2.name+" "+st2.age);
			
		}
	}

}