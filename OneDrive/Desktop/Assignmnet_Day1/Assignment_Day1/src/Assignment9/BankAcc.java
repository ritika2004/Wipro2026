package Assignment9;

public class BankAcc {
	
	int bal=1000;
	public synchronized void deposit(int am)
	{
		bal+=am;
		System.out.println(Thread.currentThread().getName()+" Deposited "+ am+" "+" Balance "+ bal);
	}
	public synchronized void withdraw(int am)
	{
		if(bal>=am) {
		bal-=am;
		System.out.println(Thread.currentThread().getName()+" Withdraw "+ am+"  "+"Balance "+ bal);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc ba=new BankAcc();
		Thread t1=new Thread(()->ba.deposit(500),"User1");
		Thread t2=new Thread(()->ba.withdraw(700),"User2");
		
		t1.start();
		t2.start();
		

	}

}
