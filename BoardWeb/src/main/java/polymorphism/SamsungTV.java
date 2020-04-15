package polymorphism;

public class SamsungTV implements TV{

	public SamsungTV() {
		System.out.println("===> SamsungTV °´Ã¼ »ý¼º");
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("samsung power on");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("samsung power off");
	}

	@Override
	public void volumeOn() {
		// TODO Auto-generated method stub
		System.out.println("samsung volume on");
	}

	@Override
	public void volumeOff() {
		// TODO Auto-generated method stub
		System.out.println("samsung volume off");
	}
}
