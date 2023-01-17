package concurrentHashMappackage;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentComputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<String,Integer> concurrent =new ConcurrentHashMap<>();
		concurrent.put("Thomas k Rough",12);
		concurrent.put("William R",32);
		concurrent.put("Samuel Brown",53);
		concurrent.put("Erric D Bald",62);
		concurrent.put("Maurice Wan",13);
		concurrent.put("Henry Shildon",23);
		Iterator<ConcurrentHashMap.Entry<String,Integer>> itr = concurrent.entrySet().iterator();
		while(itr.hasNext()){
			ConcurrentHashMap.Entry<String,Integer> entry = itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		concurrent.putIfAbsent("Jacob R Tanning", 14);
		System.out.println(concurrent);
		concurrent.compute("Erric D Bald", (a,b)->b+1000);
		System.out.println(concurrent);

	}

}
