package tempfunctions;
import java.util.*;
import java.util.function.*;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> n=new ArrayList<>();
		n.add(100);
		n.add(104);
		n.add(98);
		n.add(97);
		n.add(99);
		n.add(98);
		n.add(96);
		n.add(99);
		Consumer<Integer> c=(a)->
		{
			if(a>=100){
				System.out.println("Temperature above 100");
			}
			else{
				System.out.println("Temperature is normal");
			}
		};
		for(Integer i:n){
			c.accept(i);
	}
	}
}
