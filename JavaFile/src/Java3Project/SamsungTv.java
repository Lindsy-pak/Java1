package Java3Project;

public class SamsungTv implements RemoteControl {
	private int sound;
	
	@Override
	public void volumUp() {
		sound += 2;
		
	}

	@Override
	public void volumDown() {
		sound -= 2;
		
	}

	@Override
	public void chkVolume() {
		System.out.println("sound : " + sound );
		
	}

}
