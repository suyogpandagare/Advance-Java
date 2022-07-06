package study.lambda;

public class LambdaEx {

	public static void main(String[] args) {

		//lambda expression = implement interface, override method+create object
		Runnable r1 = () -> {
			
			while(true) {
				System.out.println("hello");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};	
		
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
