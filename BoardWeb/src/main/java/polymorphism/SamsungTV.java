package polymorphism;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice 호출");
		this.price = price;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("samsung power on (price : " + price + ")");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("samsung power off");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
