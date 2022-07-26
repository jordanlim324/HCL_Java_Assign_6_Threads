public class Day6_Q03 {
	/*
	 * 3. Write a program for a synchronization example
	 */
	public static void main(String[] args) {
		bankSys no1BankSystem = new bankSys();
		bankSysThread t1 = new bankSysThread(no1BankSystem);
		t1.start();
		bankSysThread t2 = new bankSysThread(no1BankSystem);
		t2.start();
	}

}

class bankSys {

	int balance = 1000;

	public synchronized void deposit(int amount) {
		System.out.println("Balance is: " + balance);
		balance += amount;
		System.out.println("Deposited: " + amount);
		try {
			System.out.println("Calculating...");
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("New balance: " + balance);
	}
}

class bankSysThread extends Thread {

	bankSys bankSys = null;

	bankSysThread(bankSys bankSys) {
		this.bankSys = bankSys;
	}

	public void run() {
		bankSys.deposit(100);
	}
}