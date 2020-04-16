package polymorphism;

public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker ��ü ����");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker volume down");
	}

}
