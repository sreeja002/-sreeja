package executorpackage;
import java.util.concurrent.*;
public class MyNumber implements Runnable{
		public void run()
		{
			for(int i=0;i<5;i++)
			{
				if(i%2==0){
					System.out.println(i);
					}
			    try{
				Thread.sleep(2000);
			}
			catch(Exception e){
				
			}
		}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber r=new MyNumber();
		ExecutorService n1=Executors.newFixedThreadPool(2);
		for(int i=0;i<10;i++){
			n1.execute(r);
		}

	}

}

