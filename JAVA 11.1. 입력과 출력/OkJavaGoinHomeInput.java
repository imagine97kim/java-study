import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavaGoinHomeInput {

	public static void main(String[] args) {

	    String id = JOptionPane.showInputDialog("Enter an ID");
	    Double bright = Double.parseDouble(JOptionPane.showInputDialog("Enter a brightness"));
		// Elevator call
		Elevator myElevator = new Elevator(id); // 데이터 타입이 Elevator 인 변
		myElevator.callForUp(1); // 엘리베이터를 1층으로 호출 
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off(); // 보안 해제 

		// Light on
	    Lighting hallLamp = new Lighting(id + " / Hall Lamp");
	    hallLamp.on(); // hall lamp 켜기 
	    
	    Lighting floorLamp = new Lighting(id + " / Floor Lamp");
	    floorLamp.on(); // floor lamp 켜기 	    
		
	    DimmingLights moodLamp = new DimmingLights(id + " / Mood Lamp");
	    moodLamp.setBright(bright);
	    moodLamp.on();
	}

}
