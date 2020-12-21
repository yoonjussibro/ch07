package ch07;

// CellPhone 클래스를 상속 받음
public class dmbCellPhone extends CellPhone {
//	DmbCellPhone에는 model, color 멤버 변수가 존재하지 않음
//	멤버 변수 model과 color는 CellPhone 클래스에서 상속받아 
//	DmbCellPhone 클래스에서 구현하지 않아도 멤버 변수를 사용가능함
	int channel;
	
//	자손 객체의 생성자가 없을 경우 컴파일러가 자동으로 생성자를 추가함
//	자동으로 추가된 기본 생성자의 첫줄에 super()를 자동으로 입력하여 부모 객체의 생성자를 호출함
	
//	자손 객체의 생성자를 명시하였을 경우 컴파일러가 super()를 사용하여 
//	부모 객체의 생성자를 자동으로 호출(부모 객체의 생성자가 기본 생성자였을 경우)
//	부모 객체의 생성자가 매개변수를 가지고 있는 생성자였을 경우 자손 객체에서 부모 객체의
//	생성자를 명시적으로 호출해야 함
	
	dmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
//	부모 클래스인 CellPhone에서 상속받은 메서드, 상속 받은 메서드는 이미 구현되어 있기 때문에
//	자식 클래스가 구현할 필요가 없음
	
//	자식 클래스인 DmbCellPhone 의 자체 멤버 메서드, 자체 멤버 메서드이기 때문에 구현하여야 함
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
