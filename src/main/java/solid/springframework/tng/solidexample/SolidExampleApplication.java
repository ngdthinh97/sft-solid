package solid.springframework.tng.solidexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolidExampleApplication.class, args);
		HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
		 
	      ClaimApprovalManager claim1 = new ClaimApprovalManager();
	 
	      claim1.processClaim(healthInsuranceSurveyor);
	 
	      VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
	 
	      ClaimApprovalManager claim2 = new ClaimApprovalManager();
	 
	      claim2.processClaim(vehicleInsuranceSurveyor);
	}

}
