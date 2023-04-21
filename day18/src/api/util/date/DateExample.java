package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		// void 파라미터 호출 시 현재 시간
		Date date = new Date(); // java.etil.Data로 임포트
		System.out.println(date);
		
		// 현재시간 이외의  시간으로 입력하는 경우
		Date date2 = new  Date(123, 9 ,22, 14, 02, 30);
		System.out.println(date2);
		
		// 날짜 양식 바꾸기
		// 1. SimpleDateFormat 객체를 생성하는데, 표현양식을 넣어 생성한다
		// 예시) 2023년 4월 20일 10시 09분 28초 형식으로 양식 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		// sdf.format(Date타입변수); 을 넣어서 콘솔에 찍는다
		System.out.println(sdf.format(date2));
		
		// 오늘은 X요일 입니다. 오늘은 1년중 Y번째 날입니다.
		
		SimpleDateFormat quiz = new SimpleDateFormat("오늘은 E요일, 1년 중 D번째 날입니다. ");
		System.out.println(quiz.format(date2));
		
	}
}
