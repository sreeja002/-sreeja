package concurrentDemopackage;
import java.util.Map.Entry;
import java.util.concurrent.*;
public class SkipListMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentSkipListMap<String,String> skipList= new ConcurrentSkipListMap();
		skipList.put("P", "Petunia");
		skipList.put("C", "Cosmos");
		skipList.put("M", "Marigold");
		skipList.put("Z", "Zinnia");
		skipList.put("L", "Larksupr");
		skipList.put("A", "Calendula");
		skipList.put("G", "Germania");
		skipList.put("S", "Snapdragon");
		System.out.println(skipList);
		Entry<String,String> entry=skipList.firstEntry();
		System.out.println(entry);
		System.out.println(skipList.floorEntry("M"));
		System.out.println(skipList.ceilingEntry("P"));
		

	}

}
