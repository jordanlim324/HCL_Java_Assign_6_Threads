
public class Day6_Q02 {
	/*
	 * 2. Write a program to create two threads a) First thread to print even
	 * numbers b) Second thread to print odd numbers
	 */
	public static void main(String[] args) {
		
		//Thread for even numbers
		evenThread objEven = new evenThread();
		Thread t1 = new Thread(objEven);
		t1.setPriority(7);
		t1.start();
		
		
		//Thread for odd numbers
		oddThread objOdd = new oddThread();
		Thread t2 = new Thread(objOdd);
		t2.setPriority(5);
		t2.start();
	}

}

class evenThread implements Runnable {
	public void run() {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}

		}

	}
}

class oddThread implements Runnable {
	public void run(){
		System.out.println(" ");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {

				System.out.print(i + " ");
			}
		}
	}
}
