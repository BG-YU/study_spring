package polymorphism;

public class SonySpeaker implements TV{
	
	private SonySpeaker speaker;
	
	public SonySpeaker() {
		System.out.println("===> SonySpeaker ��ü����");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SonySpeaker powen on");
	}

	@Override
	public void powerOff() {
		System.out.println("SonySpeaker powen off");
	}

	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker volume down");
	}
	
}
