package day03r;

import java.util.Arrays;

public class Bitr {
	public static void main(String[] args) {
		int[] score;
		
		score = new int[5];
		System.out.println(score);
		
		score[0] = 12;
		score[3] = 103;
		score[4] = 1;
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		System.out.println(Arrays.toString(score));
		
		System.out.println(score.length);
		
		score = new int[7];
		
		System.out.println(score.length);
		
		int iArr[] = new int [7];
		System.out.println(Arrays.toString(iArr));
		
		int iArr2[] = {1, 10, 100, 1000};
		System.out.println(Arrays.toString(iArr2));
		
	}
}
