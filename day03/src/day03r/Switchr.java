package day03r;

import java.util.Scanner;

public class Switchr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] foods = {"밥", "쌀", "누룽지", "죽"};
		
		int idx = ((int)(Math.random() * 4));
		System.out.println(idx);
		
		switch(foods[idx]) {
		
		
		case "밥" : 
			System.out.println("쿠쿠");
			break;
		case "누룽지" :
			System.out.println("뚝배기");
			break;
		default : 
			System.out.println("맛있다");
		}
	}
}
