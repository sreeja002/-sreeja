package Intermediatorypackage;
import java.util.*;
import java.util.stream.*;

public class FlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List n= Arrays.asList("Cat","Lion","Tiger","Leapord","Cheetah");
		List n1= Arrays.asList("Dog","Wolf","Fox","Bear");
		List n2=Arrays.asList("Wolf","Lion","Tiger","Bear");
		Stream<List<String>> a=Stream.of(n,n1,n2);
		a.flatMap((b)->b.stream()).sorted().distinct().forEach(System.out::println);
		

	}

}
