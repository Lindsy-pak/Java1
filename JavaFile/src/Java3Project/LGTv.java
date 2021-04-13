package Java3Project;

public class LGTv implements RemoteControl {
	private int volume;
	
	public void welcome() {
		System.out.println("LG Welcome!!");
	}
	
	@Override
	public void volumUp() {
		volume++;
		
	}

	@Override
	public void volumDown() {
		volume--;
		
	}

	@Override
	public void chkVolume() {
		System.out.println("volume : " + volume );
		
	}

}
