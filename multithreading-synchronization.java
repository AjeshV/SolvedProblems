public class Multithreading {

	private int balance = 0;
	
	public static void main(String[] args) {
		Multithreading m = new Multithreading();
		m.maps();
	}
	
	public void maps() {
		Thread t1 = new Thread(new Runnable() {
		
			public void run() {
				for (int i = 0; i < 100; i++) {
					add();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
		
			public void run() {
				for (int i = 0; i < 100; i++) {
					subtract();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Balance: " + balance);
	}
	
	public synchronized void add() {
		balance++;
	}
	
	public synchronized void subtract() {
		balance--;
	}
}
	