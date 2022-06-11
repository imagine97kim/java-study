import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class Ok_javaGoinHome {

	public static void main(String[] args) {

		// Elevator call
		Elevator myElevator = new Elevator("JAVA APT 507"); // 데이터 타입이 Elevator 인 변
		myElevator.callForUp(1); // 엘리베이터를 1층으로 호출 
		
		// Security off
		Security mySecurity = new Security("JAVA APT 507");
		mySecurity.off(); // 보안 해제 

		// Light on
	    Lighting hallLamp = new Lighting("JAVA APT 507 / Hall Lamp");
	    hallLamp.on(); // hall lamp 켜기 
	    
	    Lighting floorLamp = new Lighting("JAVA APT 507 / Floor Lamp");
	    floorLamp.on(); // floor lamp 켜기 
		
	    // 변수를 사용해서 중복 제거하기 
	    String id = "JAVA APT 507";
		// Elevator call
		Elevator myElevator2 = new Elevator(id); // 데이터 타입이 Elevator 인 변
		myElevator.callForUp(1); // 엘리베이터를 1층으로 호출 
		
		// Security off
		Security mySecurity2 = new Security(id);
		mySecurity.off(); // 보안 해제 

		// Light on
	    Lighting hallLamp2 = new Lighting(id + " / Hall Lamp");
	    hallLamp.on(); // hall lamp 켜기 
	    
	    Lighting floorLamp2 = new Lighting(id + " / Floor Lamp");
	    floorLamp.on(); // floor lamp 켜기 	    
		
	}

}
