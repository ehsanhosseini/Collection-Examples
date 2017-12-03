

public class Student  implements Comparable<Student>  {

	int id;
	String name;
	int age;
	Student(int id,String name,int age){
	this.id=id;
	this.name=name;
	this.age=age;
	}
	
	/*public int compareTo(Student s){
		if(age>s.age){
			return 1;
		}
		if(age<s.age){
			return -1;
		}
		return 0;
	}*/

	public int compareTo(Student st){
		
		if(age>st.age){
			return 1;
		}
		if(age<st.age){
			return -1;
		}
		else
			return 0;
	
	}
	
}