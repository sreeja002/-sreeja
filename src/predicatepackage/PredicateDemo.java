package predicatepackage;
import java.util.*;
import java.util.function.*;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> pre=(a)->{
			String[] arr= a.split("-");
			if(arr[0].equals("admin") && arr[1].equals("password123")){
				return true;
			}
			else{
				return false;
			}
		};
		List<String> n=new ArrayList();
		n.add("Sam-pass123");
		n.add("Peter-pass123");
		n.add("admin-password123");
		for(String i:n){
			{
				if(pre.test(i)){
					System.out.println(i);
				}
				else{
					System.out.println("Not Found");
				}
			}
		}
		
		
	}

}
