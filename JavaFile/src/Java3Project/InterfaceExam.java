package Java3Project;

public class InterfaceExam {

	public static void main(String[] args) {
		/* 클래스명은 명사 메소드명은 동사 및 명사 인터페이스 명은 명사 -*/

		RemoteControl rc1 = new LGTv();
		RemoteControl rc2 = new SamsungTv();
//		rc.welcome();	//-> x	
		rc1.volumUp();
		rc2.volumUp();
		
		rc1.volumDown();
		rc2.volumDown();
		
		rc1.chkVolume();
		rc2.chkVolume();
		
		
		
	}

}
