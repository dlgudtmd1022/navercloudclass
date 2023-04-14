package example.overload;

	

public class Cat {

	public String kind;
	public String name;
	
	
	public Cat() { // void생성자 : 파라미터에 입력된 자료가 없는 경우
		kind = "품종을 적지 않았습니다";
		name = "이름을 입력하지 않았습니다";				
	}
	
	public void input (String k, String n) { 
		kind = k;
		name = n;
		
		System.out.println("지금부터 이 아이의 이름은 " + n + "입니다.");
	}
	
	public void call() {
		System.out.println("야옹아 일로와");
	}
	
	public void call(String name) { //String파라미터 메서드
		System.out.println(name + "이리와");	
	}
}
