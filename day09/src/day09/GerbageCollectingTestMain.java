package day09;

public class GerbageCollectingTestMain {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			GerbageCollectingTest test = new GerbageCollectingTest(i);
			test = null;
			
			// 쓰레기 수집 강제 실행 명령어 (쓸 필요 없음)
			System.gc();
			
		}
	}
}
