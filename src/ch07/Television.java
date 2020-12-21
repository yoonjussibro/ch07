package ch07;

public class Television {
	int channel;
	int volume;
	
//	final : 초기화 이전까지 절대 변하지 않음
	
//	최대 및 최소 볼륨 지정
//	final int maxVolume = 25;
//	final int minVolume = 0;
	
//	최대 및 최소 채널 지정
//	final int maxChannel = 15;
//	final int minChannel = 1;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println(this.channel + "번 채널을 변경합니다.");
	}
	
	void channelUp() {
		channel++;
		System.out.println(this.channel + "번 채널로 변경합니다.");
	}
	
	void channelDown() {
		channel--;
		System.out.println(this.channel + "번 채널로 변경합니다.");
	}
	
	void volumeUp() {
		volume++;
		System.out.println("볼륨을 1 올립니다. \n 현재 볼륨 " + volume);
	}
	
	void volumeDown() {
		volume--;
		System.out.println("볼륨을 1 내립니다. \n 현재 볼륨" + volume);
	}
}
