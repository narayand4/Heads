
public class Main {
	public static void main(String[] args) {
		TapeDeck t = new TapeDeck();
		t.cannRecord = true;
		t.playTape();
		
		if(t.cannRecord==true){
			t.recordTape();
		}
		
		DVDPlayer d = new DVDPlayer();
		d.cannRecord = true;
		d.playDVD();
		
		if(d.cannRecord==true){
			d.recordDVD();
		}
		
		EchoTestDrive e = new EchoTestDrive();
		e.testEcho();
	}
}
