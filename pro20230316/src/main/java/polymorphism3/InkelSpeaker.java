package polymorphism3;

public class InkelSpeaker implements Speaker{
	public InkelSpeaker()
	{
		System.out.println("InkelSpeaker 생성됨");
	}
	@Override
	public void volumeUp() {
		System.out.println("InkelSpeaker...소리 높임");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("InkelSpeaker...소리 줄임");
		
	}

}
