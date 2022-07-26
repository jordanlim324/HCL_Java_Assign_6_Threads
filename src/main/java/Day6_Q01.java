
public class Day6_Q01 {
	/*
	 * 1. Write a program for printing 1-50 from a thread
	 */
	public static void main(String[] args) {
		numThread t1 = new numThread();
		t1.start();

	}

}

class numThread extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.print(i + " ");
		}
	}
}
