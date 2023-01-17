package Intermediatorypackage;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Numbers {
	static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> n=Stream.generate(()->i++).limit(101);
		n.map((i)->i%2==0?"even detected":"odd detected").limit(50).forEach(System.out::println);
	}

}
