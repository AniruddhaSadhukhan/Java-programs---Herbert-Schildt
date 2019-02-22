import java.util.*;

public class MapExample
{
	public static void main(String args[])
	{
		Map<String, Integer> map = new HashMap<>();
		System.out.println(map);
		map.put("One",1);
		map.put("Two",2);
		map.put("Three",3);
		System.out.println(map);		
		System.out.println(map.size());		
		System.out.println(map.keySet());		
		System.out.println(map.values());		
		System.out.println(map.get("Two"));		
		System.out.println(map.containsKey("One"));		
		System.out.println(map.containsValue(3));		
		map.put("Two",4);
		System.out.println(map);	
		map.remove("Two");
		System.out.println(map);			
		System.out.println(map.get("Ten"));	
		map.clear();
		System.out.println(map.isEmpty());							
	}
}
