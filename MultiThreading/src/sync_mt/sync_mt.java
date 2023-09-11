package sync_mt;


class car implements Runnable{
	public void run(){
		
		
		try {
		System.out.println(Thread.currentThread().getName()+" Has entered the parking lot");
			Thread.sleep(2000);
			
			synchronised(this){
			System.out.println(Thread.currentThread().getName()+" Has took the car");
			Thread.sleep(2000);
			
			System.out.println(Thread.currentThread().getName()+" Has went for a drive");
			Thread.sleep(2000);
			
			System.out.println(Thread.currentThread().getName()+" Has returned into into parking lot");
			Thread.sleep(2000);
			
		}
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
	
	}

public class sync_mt {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		car c1 = new car();
		car c2 = new car();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.setName("Merss");
		t2.setName("Mark");
		
		t1.start();
		t2.start();
		

	}

}
