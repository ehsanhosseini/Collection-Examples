import java.util.*;
public class Enum1 {
	enum days{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	};
	
	public static void main(String args[]){
		
		//Set<days> en= EnumSet.of(days.FRIDAY);
		Set<days> en=EnumSet.allOf(days.class);
		
	for(days d:en){
		
		System.out.println(d);
	}
		
		//Iterator<days> itr=en.iterator();
	//	while(itr.hasNext()){
		//	System.out.println(itr.next());
		//}
	}

}
