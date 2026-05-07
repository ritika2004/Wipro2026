package Assignment9;

public class PrintSeq {
	
	int state=0;
	 public synchronized void printA() {
	        for (int i = 0; i < 5; i++) {
	            while (state != 0) {
	                try { wait(); } catch (Exception e) {}
	            }
	            System.out.print("A ");
	            state = 1;
	            notifyAll();
	        }
	    }

	    public synchronized void printB() {
	        for (int i = 0; i < 5; i++) {
	            while (state != 1) {
	                try { wait(); } catch (Exception e) {}
	            }
	            System.out.print("B ");
	            state = 2;
	            notifyAll();
	        }
	    }

	    public synchronized void printC() {
	        for (int i = 0; i < 5; i++) {
	            while (state != 2) {
	                try { wait(); } catch (Exception e) {}
	            }
	            System.out.print("C ");
	            state = 0;
	            notifyAll();
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintSeq ps=new PrintSeq();
		Thread t1=new Thread(()->ps.printA());
		Thread t2=new Thread(()->ps.printB());
		Thread t3=new Thread(()->ps.printC());
		t1.start();
		t2.start();
		t3.start();

	}

}
