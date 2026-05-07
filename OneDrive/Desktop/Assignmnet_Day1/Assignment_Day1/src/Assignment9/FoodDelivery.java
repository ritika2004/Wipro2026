package Assignment9;

public class FoodDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			int ordid=i;
			Thread t=new Thread(()->{
				System.out.println("Order "+ ordid + " is being delivered by "+ 
			   Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
					
				}catch(Exception e) {}
				System.out.println("Order " +ordid+" delivered");
			});
			t.start();
		}

	}

}
