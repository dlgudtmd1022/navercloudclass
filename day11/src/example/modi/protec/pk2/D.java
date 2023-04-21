package example.modi.protec.pk2;

import example.modi.protec.pk1.A;

public class D extends A {

	public D() {
//		 A a = new A();
//		 a.s = "hi";
//		 a.method();
		 
		 /*
		  * protected는 패키지가 다를 경우
		  * 두 클래스 사이에 상속관계가 이싸면
		  * super 키워드를 이용해 부모쪽 참조를 허용합니다.
		  */
		 
		 super(); // super() 생성자는 무조건 첫 줄에 위치해야함.
		 super.s = "hi";
		 super.method();
	}
}
