package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListQuiz {

	public static void main(String[] args) {
		List<Integer> rotto = new ArrayList<>();
					
		for(int i = 0; i < 6 ; i++) {		
		int number = (int)(Math.random()*45) + 1;
		if(!rotto.contains(number)) {
			rotto.add(number);
			}		
		}			
		Collections.sort(rotto);		
		
		List<Integer> win = new ArrayList<>();
		
		while(win.size() < 6){
			int winNum = (int)(Math.random()*45 + 1);
			if(!win.contains(winNum)) {
				win.add(winNum);
			}		
		}		
		Collections.sort(win);
		
		while(!rotto.equals(win)) {	
			rotto.clear();
			while(rotto.size() < 6) {
				int number = (int) (Math.random() * 45) + 1;
				if (!rotto.contains(number)) {
                    rotto.add(number);
                    Collections.sort(rotto);	
				}				
			}		
		}
		System.out.println(rotto);
		System.out.println(win);
		System.out.println("당첨입니다.");
	}
}
