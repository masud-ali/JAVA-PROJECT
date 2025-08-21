import Entity.*;
import EntityList.*;
import GUI.*;

public class Start{
	public static void main(String []args){
		ShipmentInfoList S2 = new ShipmentInfoList(20);
		ShipmentInfoList S3 = new ShipmentInfoList(20);
		ShipmentInfoList S4 = new ShipmentInfoList(20);
		
		S2.insert(new ShipmentInfo("Ismam", "23-53369-3", "Japan", "Bangladesh", "Masud", "Glass", 50.3f, 3, "12/09", "30/09", "In-house", 545, "aerial"));
		S3.insert(new ShipmentInfo("Masud", "23-51676-2", "Russia", "UAE", "Sumaiya", "Car", 550.6f, 7, "11/10", "14/11", "Dispatched", 2000, "railway"));
		S4.insert(new ShipmentInfo("Sumaiya", "23-54378-3", "USA", "Russia", "Masud", "Clothing", 200.3f, 3, "29/09", "30/10", "Delivered", 1200, "aerial"));
 
	    // S2.insert(new ShipmentInfo("31-iphone-231","New York,Usa","car2","chain","21/5/2025"));
		// S2.insert(new ShipmentInfo("srfugw21331","Delli,INdia","car3"," japan","31/12/2023"));
		// S2.insert(new ShipmentInfo("12313112","Collombo,Srilanka","car4","Australia","12/2/21"));
		// S2.insert(new ShipmentInfo("wefwee21","Bangladesh","car5","Norway","43/121/20"));, 

		// S2.getByShipmentID("20-Bmw-s3").setDestination("Sahidpur");
		// S2.removeByShipmentID("12313112");
		
		S2.showAllShipmentInfo();
		S3.showAllShipmentInfo();
		S4.showAllShipmentInfo();
		
		LoginPage loginPage = new LoginPage();
		//freightForwardingPage FFP=new freightForwardingPage();
	}
}