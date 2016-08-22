import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class SetMainClass {

	public static void main(String[] args) {

		String[] array = { "sri", "shyam", "Sri","sri","Gopi","Shyam ","shyam","Blake" };
		MySet setObj = new MySet(Arrays.asList(array));
		HashMap MapObj= new HashMap<>(setObj.getMyMap());
		for(Object key: MapObj.keySet())
		{
			System.out.println(key);
		}
		//To test contains method in My set class
		System.out.println(setObj.contains("sri"));
		
		System.out.println("-------"); // Separator
		
		//To test set implementation of my own class - you can compare with Hashset ( i am getting same out for both)
		HashSet set= new HashSet<>(Arrays.asList(array));
		Iterator itr1 = set.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
}

