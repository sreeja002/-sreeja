package terminalpackage;
import java.util.*;
import java.util.stream.*;
public class TerminalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> n=new ArrayList();
		n.add(12);
		n.add(11);
		n.add(19);
		n.add(23);
		n.add(45);
		n.add(56);
		n.add(78);
		n.add(89);
		
		Stream <Integer>stream = n.stream();
		//System.out.println(stream.anyMatch((a)->a>100));
		//System.out.println(stream.max((a,b)->a.compareTo(b)).get());
		System.out.println(stream.min((a,b)->a.compareTo(b)).get());
		
	}

}
