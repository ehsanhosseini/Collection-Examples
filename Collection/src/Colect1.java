import java.util.*;  
import java.io.*;
class Colect1  {
	public static void main(String args[]){
		
		//Student s1=new Student(100,"Ehsan",32);
	//	Student s2=new Student(101,"Jamshid",30);
	//	Student s3=new Student(102,"Majed",29);
		
		ArrayList<Student> list=new ArrayList<Student>();
		//LinkedList<Student> list=new LinkedList<Student>();
		list.add(new Student(100,"Majed",32));
		list.add(new Student(101,"Ehsan",30));
		list.add(new Student(102,"Ehsan",29));
		
		//Iterator<Student> itr=list.iterator();
		
		//while(itr.hasNext()){
			//Student st=(Student)itr.next();
			
			//System.out.println(st.id+" "+st.name+" "+st.age);
		//}
		//Collections.sort(list);
		
		
		System.out.println("Sorting by Age::");
		Collections.sort(list, new AgeComparator());
		for(Student obj:list){
			System.out.println(obj.id+" "+obj.name+" "+obj.age);
		}
		
		System.out.println("Sorting by Name::");
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext()){
			Student st=itr.next();
			System.out.println(st.id+" "+st.name+" "+st.age);
		}
		
		
		/*Collections.sort(list,new NameComparator());
		for(Student obj:list){
			System.out.println(obj.id+" "+obj.name+" "+obj.age);
		}*/
	}

}
