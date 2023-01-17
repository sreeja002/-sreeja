package callablepackage;
import java.util.*;
import java.util.concurrent.*;
//import java.util.concurrent.Future;
public class TextCallable implements Callable{
	List<String> itemlist=new LinkedList();
	public Object call() throws Exception
	{
		itemlist.add("Coffee");
		itemlist.add("Tea");
		itemlist.add("Espresso");
		itemlist.add("Capuccino");
		return itemlist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService e1= Executors.newFixedThreadPool(4);
		TextCallable n=new TextCallable();
		Future f=e1.submit(n);
				try{
			System.out.println(f.get());
		}
		catch(Exception e){
			System.out.println(e);
		}

	}
}
