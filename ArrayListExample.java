import java.util.*;

public class ArrayListExample
{
	public static void main(String args[])
	{
		List<String> arr = new ArrayList<String>(Arrays.asList("a","b"));
		arr.add("d");
		System.out.println(arr);
		arr.add(2,"c");
		System.out.println(arr);
		arr.remove(1);
		System.out.println(arr.get(1));
		System.out.println(arr);
		arr.set(1,"n");
		System.out.println(arr);
		System.out.println(arr.indexOf("n"));
		System.out.println(arr.indexOf("z"));
		System.out.println(arr.subList(0,2));
		System.out.println(arr.size());
	}
}
