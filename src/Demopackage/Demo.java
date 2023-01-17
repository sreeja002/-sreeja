package Demopackage;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> n=new ArrayList<>();
		n.add(new Product("Ball",50,8));
		n.add(new Product("Buses",500,6));
		n.add(new Product("Toy car",100,3));
		Stream<Product> n1=n.stream();
		List<Product> str=n1.collect(Collectors.toList());
		System.out.println(str);
		
		
	}

}
