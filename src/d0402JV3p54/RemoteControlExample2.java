package d0402JV3p54;

public class RemoteControlExample2 {

	public static void main(String[] args) {
//			RemoteControl rc = new RemoteControl();
		
		RemoteControl rc1 = new Audio();
		rc1.turnOn();
		rc2.turnOff();
		
		RemoteControl rc2 = new RemoteControl() {
			
			public void turnOn() {
				System.out.println("RemoteControl - turnOn()");
			}

			public void turnOff() {
				System.out.println("RemoteControl - turnOff()");
			}
			

			public void setVolume(int volume) {
//				System.out.println("RemoteControl - volume()");
			}

		};
		rc2.turnOn();
		rc2.turnOff();
	}
}
	
	
	
