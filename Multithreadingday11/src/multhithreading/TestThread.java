package multhithreading;

public class TestThread  {
public static void main(String[] args) throws InterruptedException {
		

		System.out.println(" started main.....");
		
		
		Mythread t1=new Mythread("t1");
		Mythread t2=new Mythread("t2");
		//t1.setDaemon(true);
		//t2.setDaemon(true);
		t2.join();
		t1.start();
		//Thread.sleep(1000);
		//t1.join();
		t2.start();
		//System.currentTimeMillis();
		//Thread.sleep(1000);
		//for(int i=0;i<10;i++)
		//System.out.println(" existing  main.....");
	}
}