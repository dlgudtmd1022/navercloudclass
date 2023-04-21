package api.lang.object;

public class ObjectInformation {

	// toString 오버라이딩 후 Sysout으로 객체변수 조회 시 
	// 해당 인스턴스의 클래스 경로와 주소값 대신
	// toString이 리턴하는 값으로
	// 바뀌어 콘솔에 찍힘니다,
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "정보은닉";
	}
}
