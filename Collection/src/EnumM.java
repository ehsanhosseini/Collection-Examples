import java.util.*;



enum days{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
public class EnumM {
	

	
	public static void main(String args[]){
		Map<days,String> m=new EnumMap<days,String>(days.class);
		
		m.put(days.SUNDAY, "1");
		m.put(days.MONDAY, "2");
		m.put(days.FRIDAY, "3");
		
	for(Map.Entry<days,String> mp:m.entrySet()){
		System.out.println(mp.getKey()+" "+mp.getValue());
		
	}
		
		
	}

}
