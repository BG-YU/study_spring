package polymorphism;

public class LgTV implements TV{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("lg power on");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("lg power off");
	}

	@Override
	public void volumeOn() {
		// TODO Auto-generated method stub
		System.out.println("lg volume on");
	}

	@Override
	public void volumeOff() {
		// TODO Auto-generated method stub
		System.out.println("lg volume off");
	}
}
