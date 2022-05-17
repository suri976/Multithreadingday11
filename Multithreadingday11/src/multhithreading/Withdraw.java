package multhithreading;

import multhithreading.Main.Table;

public class Withdraw  extends Thread {
	
	Table t;  
//	MyThread2(Table t){  
//	this.t=t;  
//	}  
	public void run(){  
	t.printTable(100);  
	}  

}
