package polymorphism;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 梓端 持失");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 梓端 持失");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 梓端 持失");
		this.speaker = speaker;
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
