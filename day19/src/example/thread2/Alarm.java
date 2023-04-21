package example.thread2;

public class Alarm implements Runnable{

	@Override
	public void run() {
	 try {
		 for(int i = 1; i <= 100; i++) {
			 System.out.println("경고음 삑삑");
			 Thread.sleep(400);
		 }
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	}
}
