package Entity;
public class ShipmentInfo{
	
	private String seller;
	private String shipmentID;
	private String origin;
	private String destination;
	private String customer;
	private String type;
	private float weight;
	private int quantity;
	private String dispatchDate;
	private String deliveryDate;
	private String shipmentStatus;
	private float payment;
	private String carrier;
	
	public ShipmentInfo(){}
	public ShipmentInfo(String seller, String shipmentID, String origin, String destination, String customer, String type, 
						float weight, int quantity, String dispatchDate, String deliveryDate, String shipmentStatus, float payment, 
						String carrier){
		this.seller=seller;
		this.shipmentID=shipmentID;
		this.origin=origin;
		this.destination=destination;
		this.customer=customer;
		this.type=type;
		this.weight=weight;
		this.quantity=quantity;
		this.dispatchDate=dispatchDate;
		this.deliveryDate=deliveryDate;
		this.shipmentStatus=shipmentStatus;
		this.payment=payment;
		this.carrier=carrier;}
	
	public void setSeller(String seller) {this.seller= seller;}
	public void setShipmentID(String shipmentID) {this.shipmentID= shipmentID;}
	public void setOrigin(String origin) {this.origin= origin;}
	public void setDestination(String destination) {this.destination= destination;}
	public void setCustomer(String customer) {this.customer= customer;}
	public void setType(String type) {this.type= type;}
	public void setWeight(float weight) {
		if(weight>0.0){this.weight= weight;}
		else{System.out.println("Weight of a product cannot be less than 0.");}}
	public void setQuantity(int quantity) {
		if(quantity>0){this.quantity= quantity;}
		else{System.out.println("Quantity of a product cannot be less than or equal to 0.");}}
	public void setDispatchDate(String dispatchDate) {this.dispatchDate= dispatchDate;}
	public void setDeliveryDate(String deliveryDate) {this.deliveryDate= deliveryDate;}
	public void setShipmentStatus(String shipmentStatus) {this.shipmentStatus= shipmentStatus;}
	public void setPayment(float payment){
		if(payment>= 0){
			System.out.println("Paid.");
			this.payment= payment;}
		else{System.out.println("Invalid input.");}}
	public void setCarrier(String carrier) {this.carrier= carrier;}
	
	public String getSeller(){return seller;}
	public String getShipmentID(){return shipmentID;}
	public String getOrigin(){return origin;}
	public String getDestination(){return destination;}
	public String getCustomer(){return customer;}
	public String getType(){return type;}
	public float getWeight(){return weight;}
	public int getQuantity(){return quantity;}
	public String getDispatchDate(){return dispatchDate;}
	public String getDeliveryDate(){return deliveryDate;}
	public String getShipmentStatus(){return shipmentStatus;}
	public float getPayment(){return payment;}
	public String getCarrier(){return carrier;}
	
	public void showShipmentInfo(){
		System.out.println("----------------------------------------------------");
		System.out.println("Seller Name: "+ seller); 
		System.out.println("Shipment ID: "+ shipmentID); 
		System.out.println("Origin Of Product: "+ origin); 
		System.out.println("Shipment Destination: "+ destination); 
		System.out.println("Customer Name: "+ customer); 
		System.out.println("Type Of Product: "+ type); 
		System.out.println("Weight Of Product: "+ weight+"KG"); 
		System.out.println("Quantity Of Product: "+ quantity); 
		System.out.println("Dispatch Date: "+ dispatchDate); 
		System.out.println("Delivery Date: "+ deliveryDate); 
		System.out.println("Shipment Status: "+ shipmentStatus);
		System.out.println("Payment (in USD): "+ payment);
		System.out.println("Mode Of Carrier: "+ carrier);
		System.out.println("----------------------------------------------------");
	}
	
    public String getShipmentInfoAsString(){
		String S =  "Seller Name\t\t: "+seller+"\n"+
					"Shipment ID\t\t: "+shipmentID+"\n"+
					"Origin Of Product\t: "+ origin +"\n"+
					"Shipment Destination\t: "+ destination+"\n"+
					"Customer Name\t: "+ customer+"\n"+
					"Type Of Product\t: "+ type+"\n"+
					"Weight Of Product\t: "+ weight+" KG"+"\n"+
					"Quantity Of Product\t: "+ quantity +"\n"+
					"Dispatch Date\t\t: "+ dispatchDate+"\n"+
					"Delivery Date\t\t: "+ deliveryDate+"\n"+
					"Shipment Status\t: "+ shipmentStatus+"\n"+
					"Payment (in USD)\t: "+ payment+"\n"+
					"Mode Of Carrier\t: "+ carrier;
		return S;}
}