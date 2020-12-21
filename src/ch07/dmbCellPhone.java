package ch07;

// CellPhone 클래스를 상속 받음
public class dmbCellPhone extends CellPhone {
//	DmbCellPhone에는 model, color 멤버 변수가 존재하지 않음
//	멤버 변수 model과 color는 CellPhone 클래스에서 상속받아 
//	DmbCellPhone 클래스에서 구현하지 않아도 멤버 변수를 사용가능함
	int channel;
	
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
