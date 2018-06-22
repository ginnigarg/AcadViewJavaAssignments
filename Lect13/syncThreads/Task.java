package syncThreads;

public class Task implements Runnable{

	public synchronized void run() {
		// TODO Auto-generated method stub
		int i=1;
		while(i<1000) {
			System.out.println(Thread.currentThread().getName()+" "+ i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		
	}

}
