package study.anonymous;

public class Threads {

	public static void main(String[] args) {

		Runnable task = new Runnable() {
			int x;
			
			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {
					System.out.println("hello");
				}
			}
		};
		
		/*Thread th = new Thread(task);
        th.start();*/
		
		//first thread
		new Thread(task).start();
		
		
		//second thread   => this is shorthand of first thread written
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("hii");
				}
			}
		}).start();
		
	}//end of main

}//end of class
