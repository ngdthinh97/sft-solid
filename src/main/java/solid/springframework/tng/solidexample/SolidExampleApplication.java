package solid.springframework.tng.solidexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidExampleApplication {
	// interface la Switch.java Switchable.java
	//
	//	interface Switch.java {
	//		boolean isOn();
	//	    void press();
	//	}
	//	public interface Switchable {
	//	    void turnOn();
	//	    void turnOff();
	//	}
	public static void main(String[] args) {
		SpringApplication.run(SolidExampleApplication.class, args);
		   Switchable switchableBulb=new LightBulb();		// module lon khong phu thuoc vao module nho - solid
	       Switch bulbPowerSwitch=new ElectricPowerSwitch(switchableBulb);		
	       bulbPowerSwitch.press();
	       bulbPowerSwitch.press();
	       
	       // 
	       
	       Switchable switchableFan=new Fan();		// module lon khong phu thuoc vao module nho - solid
	       Switch fanPowerSwitch=new ElectricPowerSwitch(switchableFan);
	       fanPowerSwitch.press();
	       fanPowerSwitch.press();
	}

}
