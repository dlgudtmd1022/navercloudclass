package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoWinSimulatorBadCase2 {

	public static void main(String[] args) {
		// 로또복권 번호를 적재할 컬렉션 생성
		// 제네릭에는 int대신 Integer로 넣어야 함
		List<Integer> powerWinNumbers = new ArrayList<>();
		
		// Random 크래스를 생성해서 난수 발생
		Random rn = new Random();
		
		// 번호 6개가 중복없이 당첨되려면 몇 바퀴를 돌아야 하는지 모르므로 while문을 사용
		while(powerWinNumbers.size() < 5) {
			// 1~45 범위로 난수 발생해 변수에 저장
			Integer thisTimeGetNumber = rn.nextInt(1, 70);
			// 기존에 이미 뽑았던 숫자인지 확인한 후 
			if(!powerWinNumbers.contains(thisTimeGetNumber)) {
				// 없는 번호면 적재
				powerWinNumbers.add(thisTimeGetNumber);
			}	
		}
		// 번호 정렬
		Collections.sort(powerWinNumbers);
		
		// 단일추첨 1 ~ 26 범위 하나 더 추가
		Integer powerWinNumber = rn.nextInt(1, 27);
		
		// 2. 추첨번호 6개를 추가로 뽑아서 같은게 나얼때까지 비교 ->
		List<Integer> powerTryNumbers = new ArrayList<>();
		Integer powerTryNumber = 0;
		int count = 0;
		
		// 추첨 번호와 당첨 번호를 비교해서 다르면 반복문 실행, 같으면 종료
		while(!(powerTryNumbers.equals(powerWinNumbers) && !powerWinNumber.equals(powerTryNumber))) {
			count ++;
			// 번호가 찬 채로 반복문이 진행되므로, 다시 비워야함
			powerTryNumbers.clear();
			while(powerTryNumbers.size() < 6) {
			// 1~45 범위로 난수 발생해 변수에 저장
			Integer thisTimeGetNumber = rn.nextInt(1, 46);
			// 기존에 이미 뽑았던 숫자인지 확인한 후 
			if(!powerTryNumbers.contains(thisTimeGetNumber)) {
				// 없는 번호면 적재
				powerTryNumbers.add(thisTimeGetNumber);			
				}				
			}
			powerTryNumber = rn.nextInt(1, 27);	
			// 번호 정렬
			Collections.sort(powerTryNumbers);
	}
		System.err.println("당신은 " + count +"장을 사고 당첨이 되었습니다.");

	}
}
