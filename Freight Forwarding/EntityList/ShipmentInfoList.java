package EntityList;
import Entity.*;

public class ShipmentInfoList{
	
	private ShipmentInfo Infos[];
	public ShipmentInfoList() {Infos = new ShipmentInfo[10];}
	
	public ShipmentInfoList(int size) {Infos = new ShipmentInfo[size];}
	
	public void insert(ShipmentInfo S){
		
		boolean flag= false;	
		for(int i=0;i<Infos.length;i++){
			if(Infos[i]==null){
				Infos[i] = S;
				flag = true;
				break;}}
				
		if(flag){System.out.println("Successfully Inserted.");}
		else{System.out.println("Insertion Failed.");}}
	
	public ShipmentInfo getByShipmentID(String ShipmentID){
		boolean flag= false;
		ShipmentInfo S= null;
		for(int i=0;i<Infos.length;i++){
			if(Infos[i]!=null){
				if(Infos[i].getShipmentID().equals(ShipmentID)){
					S = Infos[i];
					flag = true;
					break;}}}
		
		if(flag){System.out.println("Shipment information found.");}
		else{System.out.println("Shipment information not found.");}
		return S;}
	
	public void removeByShipmentID(String ShipmentID){
		boolean flag = false;
		for(int i=0;i<Infos.length;i++){
			if(Infos[i]!=null){
				if( Infos[i].getShipmentID().equals(ShipmentID)){
					Infos[i] = null;
					flag = true;
					break;}}}
					
		if(flag){System.out.println("Shipment information is removed.");}
		else{System.out.println("Shipment information not found with this ID.");}}
	
	public void showAllShipmentInfo(){
		for(int i=0;i<Infos.length;i++){
			if(Infos[i]!=null){Infos[i].showShipmentInfo();}}}
	
	public String getAllShipmentInfoAsString(){
		String allShipmentInfo="";
		for(int i=0;i<Infos.length;i++){
			if(Infos[i]!=null){
				allShipmentInfo +="**************************************"+"\n"+
							Infos[i].getShipmentInfoAsString()+"\n"+
							      "**************************************"+"\n";}}
		return allShipmentInfo;
	}
}