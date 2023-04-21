package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoWinSimulatorBadCase {

	public static void main(String[] args) {
		// 로또복권 번호를 적재할 컬렉션 생성
		// 제네릭에는 int대신 Integer로 넣어야 함
		List<Integer> lottoWinNumbers = new ArrayList<>();
		
		// Random 크래스를 생성해서 난수 발생
		Random rn = new Random();
		
		// 번호 6개가 중복없이 당첨되려면 몇 바퀴를 돌아야 하는지 모르므로 while문을 사용
		while(lottoWinNumbers.size() < 6) {
			// 1~45 범위로 난수 발생해 변수에 저장
			Integer thisTimeGetNumber = rn.nextInt(1, 46);
			// 기존에 이미 뽑았던 숫자인지 확인한 후 
			if(!lottoWinNumbers.contains(thisTimeGetNumber)) {
				// 없는 번호면 적재
				lottoWinNumbers.add(thisTimeGetNumber);
			}
			// 번호 정렬
			Collections.sort(lottoWinNumbers);
			}
			// 2. 추첨번호 6개를 추가로 뽑아서 같은게 나얼때까지 비교 ->
		List<Integer> lottoTryNumbers = new ArrayList<>();
		
		int count = 0;
		
		// 추첨 번호와 당첨 번호를 비ㄱ해서 다르면 반복문 실행, 같으면 종료
		while(!lottoTryNumbers.equals(lottoWinNumbers)) {
			count ++;
			// 번호가 찬 채로 반복문이 진해오디므로, 다시 비워야함
			lottoTryNumbers.clear();
			while(lottoTryNumbers.size() < 6) {
			// 1~45 범위로 난수 발생해 변수에 저장
			Integer thisTimeGetNumber = rn.nextInt(1, 46);
			// 기존에 이미 뽑았던 숫자인지 확인한 후 
			if(!lottoTryNumbers.contains(thisTimeGetNumber)) {
				// 없는 번호면 적재
				lottoTryNumbers.add(thisTimeGetNumber);
			}
			// 번호 정렬
			Collections.sort(lottoTryNumbers);
			}		
			System.out.println("당첨번호 - " + lottoWinNumbers);
			System.out.println("내번호 - " + lottoTryNumbers);
			System.out.println("----------------------");
	}
		System.err.println("당신은 " + count +"장을 사고 당첨이 되었습니다.");

	}
}
