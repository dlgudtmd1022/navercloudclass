package example.modi.member.pk2;

import example.modi.member.pk1.A;

public class C {

	public C() {
	A a = new A();
	
	 a.a = 1;  // public 어디서나 가능
//	 a.b = 2;  // default 패키지가 다르면  x
//	 a.c = 3;  // private 파일이 다르면 x
	 
	 a.method1(); // public 
//	 a.method2(); // default
//	 a.method3(); // private
	}
}
