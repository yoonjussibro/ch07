package ch07;

public class IPTV extends Television {

	
	void turnOnVOD() {
		System.out.println("VOD 채널을 활성화 합니다.");
	}
	
	void turnOffVOD() {
		System.out.println("VOD 채널을 비활성화 합니다.");
		volume = 0;
		channel = 0;
	}
	
	void changeVolume(int volume) {
		this.volume = volume;
		System.out.println(this.volume + "만큼 볼륨 조절합니다.");
	}
	
	void changeVOD(int channel) {
		this.channel = channel;
		System.out.println(this.channel + "번 채널로 이동합니다.");
	}
	
	void changeupVOD() {
		channel++;
		System.out.println("VOD 채널을 다음 채널로 이동합니다." + "\n현재 VOD 채널 : " + channel);
	}
	
	void changedownVOD() {
		channel--;
		System.out.println("VOD 채널을 이전 채널로 이동합니다." + "\n현재 VOD 채널 : " + channel);
	}
	
	void maxvolume() {
		if (volume > 25) {
			System.out.println("현재 볼륨은 : " + volume + "입니다. \n 최대 볼륨은 25까지입니다. \n 최대볼륨으로 조절합니다.");
			volume = 25;
			System.out.println("조절한 볼륨은" + volume + "입니다.");
		}
		else {
			
		}
	}
	
	void maxchannel() {
		if (channel > 15) {
			System.out.println("현재 VOD 채널은 : " + channel + "입니다. \n 최대 채널은 15까지입니다. \n 최대 채널로 이동합니다.");
			channel = 15;
			System.out.println("이동한 채널은 : " + channel + "입니다.");
		}
		
		else {
			
		}
	}
	
}

