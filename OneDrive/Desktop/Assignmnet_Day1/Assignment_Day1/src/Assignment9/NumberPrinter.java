package Assignment9;

public class NumberPrinter {
	int num=1;
	int limit =100;
	
	public synchronized void printOdd()
	{
		while(num<=limit)
		{
			if(num%2==0)
			{
				try {
					wait();
				}
				catch(Exception e){}
			}
			else {
				
			System.out.println("Odd: "+num++);
			notify();
			}
		}

	}

    public synchronized void printEven() {
        while (num <= limit) {
            if (num % 2 != 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.println("Even: " + num++);
                notify();
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPrinter np=new NumberPrinter();
		Thread t1=new Thread(()->np.printOdd());
		Thread t2=new Thread(()->np.printEven());
		t1.start();
		t2.start();

	}

}
