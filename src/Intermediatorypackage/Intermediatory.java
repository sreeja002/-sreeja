package Intermediatorypackage;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Intermediatory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> n= new ArrayList<>();
		n.add(new Student("Erric",98));
		n.add(new Student("Joe",88));
		n.add(new Student("Max",40));
		n.add(new Student("Peach",58));
		Stream<Student> n1=n.stream();
		Comparator<Student> c=(a,b)->{
			if(a.marks==b.marks)
			{
				return 0;
			}
			else
			{
				if(a.marks>b.marks){
					return -1;
				}
				else{
					return 1;
				}
			}
				
		};
		//n1.sorted(c).forEach(System.out::println);
		Predicate<Student> n2=(a)->a.marks>50;
		n1.sorted(c).filter(n2).forEach(System.out::println);
		
	}

}
