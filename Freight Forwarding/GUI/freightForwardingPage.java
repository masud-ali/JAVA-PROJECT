package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entity.*;
import EntityList.*;
import File.*;

public class freightForwardingPage extends JFrame implements ActionListener,KeyListener {
	
    Font font030 = new Font("Cooper Black", Font.BOLD, 30);
	Font font015= new Font("Times New Roman", Font.BOLD, 15);
	Font font020 = new Font("Times New Roman", Font.BOLD, 20);
	
	JTextField sellerTextField, shipmentIDTextField, originTextField, destinationTextField,
	customerTextField, typeTextField, weightTextField, quantityTextField, dispatchDateTextField,
	deliveryDateTextField, shipmentStatusTextField, paymentTextField, carrierTextField, searchTextField, deleteTextField;
	
	JTextArea displayArea;
	
	JButton addButton, updateButton, searchButton, deleteButton, clearButton, showAllButton, logoutButton;
	
	public JFrame previousPage;
	
	ShipmentInfoList shipmentInfoList= new ShipmentInfoList(100);
	
	public freightForwardingPage(){
		super("FREIGHT FORWARDING PAGE GUI");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1400,800); 
		this.setLocation(75,0); 
		this.getContentPane().setBackground(new Color(217,221,220));
		this.setLayout(null);
     
	 	JLabel title = new JLabel("Information Management System For Freight Forwarding Company");
		title.setBounds(130,0,1200,80); 
		title.setFont(font030);
		title.setForeground(Color.BLACK);
		this.add(title);
		
		           //LEFT//
				   
		int top = 70;
		int gap = 35;
		int x=20;
		
		JLabel sellerLabel = new JLabel("Seller Name: ");
		sellerLabel.setBounds(x,top,200,30); 
		sellerLabel.setFont(font015);
		this.add(sellerLabel);
		
		sellerTextField= new JTextField();
		sellerTextField.setBounds(x,top+=gap,200,30); 
		sellerTextField.setFont(font015);
		sellerTextField.addKeyListener(this);
		this.add(sellerTextField);
		
		JLabel shipmentIDLabel = new JLabel("Shipment ID: ");
		shipmentIDLabel.setBounds(x,top+=gap,200,30); 
		shipmentIDLabel.setFont(font015);
		this.add(shipmentIDLabel);
		
		shipmentIDTextField= new JTextField();
		shipmentIDTextField.setBounds(x,top+=gap,200,30); 
		shipmentIDTextField.setFont(font015);
		shipmentIDTextField.addKeyListener(this);
		this.add(shipmentIDTextField);
		
		JLabel originLabel = new JLabel("Origin Of Product: ");
		originLabel.setBounds(x,top+=gap,200,30); 
		originLabel.setFont(font015);
		this.add(originLabel);
		
		originTextField= new JTextField();
		originTextField.setBounds(x,top+=gap,200,30); 
		originTextField.setFont(font015);
		originTextField.addKeyListener(this);
		this.add(originTextField);
		
		JLabel destinationLabel = new JLabel("Shipment Destination: ");
		destinationLabel.setBounds(x,top+=gap,200,40); 
		destinationLabel.setFont(font015);
		this.add(destinationLabel);
		
		destinationTextField= new JTextField();
		destinationTextField.setBounds(x,top+=gap,200,30); 
		destinationTextField.setFont(font015);
		destinationTextField.addKeyListener(this);
		this.add(destinationTextField);
		
		JLabel customerLabel = new JLabel("Customer Name: ");
		customerLabel.setBounds(x,top+=gap,200,30);
		customerLabel.setFont(font015);
		this.add(customerLabel);
		
		customerTextField= new JTextField();
		customerTextField.setBounds(x,top+=gap,200,30); 
		customerTextField.setFont(font015);
		customerTextField.addKeyListener(this);
		this.add(customerTextField);
		
		JLabel typeLabel = new JLabel("Product Type: ");
		typeLabel.setBounds(x,top+=gap,200,30); 
		typeLabel.setFont(font015);
		this.add(typeLabel);
		
		typeTextField= new JTextField();
		typeTextField.setBounds(x,top+=gap,200,30); 
		typeTextField.setFont(font015);
		typeTextField.addKeyListener(this);
		this.add(typeTextField);
		
		JLabel searchLabel = new JLabel("Search By Shipment ID: ");
		searchLabel.setBounds(x,top+=gap+75,200,30); 
		searchLabel.setFont(font015);
		this.add(searchLabel);
		
		searchTextField= new JTextField();
		searchTextField.setBounds(x,top+=gap,200,30); 
		searchTextField.setFont(font015);
		searchTextField.addKeyListener(this);
		this.add(searchTextField);
		
		searchButton = new JButton("SEARCH");
		searchButton.setBounds(x,top+=gap,200,30); 
		searchButton.setBackground(new Color(249, 231, 149));
		searchButton.setFont(font015);
		searchButton.addActionListener(this);
		this.add(searchButton);
	
		        //RIGHT//
				
		top = 70;
		gap = 35;
		x=250;
		
		JLabel weightLabel = new JLabel("Weight Of Product: ");
		weightLabel.setBounds(x,top,200,30); 
		weightLabel.setFont(font015);
		this.add(weightLabel);
		
		weightTextField = new JTextField();
		weightTextField.setBounds(x,top+=gap,200,30); 
	    weightTextField.setFont(font015);
		weightTextField.addKeyListener(this);
		this.add(weightTextField);
		
		JLabel quantityLabel = new JLabel("Quantity Of Product: ");
		quantityLabel.setBounds(x,top+=gap,200,30); 
		quantityLabel.setFont(font015);
		this.add(quantityLabel);
		
		quantityTextField = new JTextField();
		quantityTextField.setBounds(x,top+=gap,200,30); 
	    quantityTextField.setFont(font015);
		quantityTextField.addKeyListener(this);
		this.add(quantityTextField);
		
		JLabel dispatchDateLabel = new JLabel("Dispatch Date: ");
		dispatchDateLabel.setBounds(x,top+=gap,200,30); 
		dispatchDateLabel.setFont(font015);
		this.add(dispatchDateLabel);
		
		dispatchDateTextField = new JTextField();
		dispatchDateTextField.setBounds(x,top+=gap,200,30); 
	    dispatchDateTextField.setFont(font015);
		dispatchDateTextField.addKeyListener(this);
		this.add(dispatchDateTextField);
		
		JLabel deliveryDateLabel = new JLabel("Delivery Date: ");
		deliveryDateLabel.setBounds(x,top+=gap,200,30); 
		deliveryDateLabel.setFont(font015);
		this.add(deliveryDateLabel);
		
		deliveryDateTextField = new JTextField();
		deliveryDateTextField.setBounds(x,top+=gap,200,30);
	    deliveryDateTextField.setFont(font015);
		deliveryDateTextField.addKeyListener(this);
		this.add(deliveryDateTextField);
		
		JLabel shipmentStatusLabel = new JLabel("Shipment Status: ");
		shipmentStatusLabel.setBounds(x,top+=gap,200,30); 
		shipmentStatusLabel.setFont(font015);
		this.add(shipmentStatusLabel);
		
		shipmentStatusTextField = new JTextField();
		shipmentStatusTextField.setBounds(x,top+=gap,200,30); 
	    shipmentStatusTextField.setFont(font015);
		shipmentStatusTextField.addKeyListener(this);
		this.add(shipmentStatusTextField);
		
		JLabel paymentLabel = new JLabel("Payment (in USD): ");
		paymentLabel.setBounds(x,top+=gap,200,30); 
		paymentLabel.setFont(font015);
		this.add(paymentLabel);
		
		paymentTextField = new JTextField();
		paymentTextField.setBounds(x,top+=gap,200,30); 
	    paymentTextField.setFont(font015);
		paymentTextField.addKeyListener(this);
		this.add(paymentTextField);
		
		JLabel carrierLabel = new JLabel("Mode Of Carrier: ");
		carrierLabel.setBounds(x-70,top+=gap,200,30); 
		carrierLabel.setFont(font015);
		this.add(carrierLabel);
		
		carrierTextField = new JTextField();
		carrierTextField.setBounds(x-110,top+=gap,200,30); 
	    carrierTextField.setFont(font015);
		carrierTextField.addKeyListener(this);
		this.add(carrierTextField);
		
		JLabel deleteLabel = new JLabel("Delete By Shipment ID: ");
		deleteLabel.setBounds(x,top+=gap+5,200,30); 
		deleteLabel.setFont(font015);
		this.add(deleteLabel);
		
		deleteTextField = new JTextField();
		deleteTextField.setBounds(x,top+=gap,200,30); 
		deleteTextField.setFont(font015);
		deleteTextField.addKeyListener(this);
		this.add(deleteTextField);
				
		deleteButton = new JButton("DELETE");
		deleteButton.setBounds(x,top+=gap,200,30);
		deleteButton.setBackground(new Color(255, 103, 95));
		deleteButton.setForeground(Color.BLACK);
		deleteButton.setFont(font015);
		deleteButton.addActionListener(this);
		deleteButton.addKeyListener(this);
		this.add(deleteButton);
		
		x=140;
		gap=50;
		
		clearButton = new JButton("CLEAR SCREEN");
		clearButton.setBounds(x,top+=gap,200,50); 
		clearButton.setBackground(new Color(65, 66, 66));
		clearButton.setForeground(Color.WHITE);
		clearButton.setFont(font015);
		clearButton.addActionListener(this);
		clearButton.addKeyListener(this);
		this.add(clearButton);
		
		addButton = new JButton("ADD");
		addButton.setBounds(x+358,top,200,50); 
		addButton.setBackground(new Color(88, 78, 109));
		addButton.setForeground(Color.WHITE);
		addButton.setFont(font015);
		addButton.addActionListener(this);
		addButton.addKeyListener(this);
		this.add(addButton);
		
		top=150;
		updateButton = new JButton("UPDATE");
		updateButton.setBounds(x+610,top+535,200,50); 
		updateButton.setBackground(new Color(83, 104, 120));
		updateButton.setForeground(Color.WHITE);
		updateButton.setFont(font015);
		updateButton.addActionListener(this);
		updateButton.addKeyListener(this);
		this.add(updateButton);
		
		showAllButton = new JButton("SHOW ALL");
		showAllButton.setBounds(x+860,top+535,200,50); 
		showAllButton.setBackground(new Color(100, 71, 74));
		showAllButton.setForeground(Color.WHITE);
		showAllButton.setFont(font015);
		showAllButton.addActionListener(this);
		showAllButton.addKeyListener(this);
		this.add(showAllButton);
		
		logoutButton = new JButton("LOG OUT");
		logoutButton.setBounds(1225,370,125,50); 
		logoutButton.setBackground(new Color(62, 63, 52));
		logoutButton.setForeground(Color.WHITE);
		logoutButton.setFont(font015);
		logoutButton.addActionListener(this);
		logoutButton.addKeyListener(this);
		this.add(logoutButton);
		
		displayArea = new JTextArea();
		displayArea.setFont(font020);
		JScrollPane J = new JScrollPane(displayArea);
		J.setBounds(500,100,700,568);
		this.add(J);
		FileIO.loadShipmentInfosFromFile(shipmentInfoList);
		reloadData();
	    
		this.setVisible(true);}
	
	 public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (addButton.hasFocus()) {addButton.doClick();}
			else if (updateButton.hasFocus()) {updateButton.doClick();} 
			else if (searchButton.hasFocus()) {searchButton.doClick();} 
			else if (deleteButton.hasFocus()) {deleteButton.doClick();} 
			else if (clearButton.hasFocus()) {clearButton.doClick();} 
			else if (showAllButton.hasFocus()) {showAllButton.doClick();} 
			else if (logoutButton.hasFocus()) {logoutButton.doClick();}}
			
		if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (shipmentIDTextField.hasFocus()) {sellerTextField.requestFocus();} 
			else if (originTextField.hasFocus()) {shipmentIDTextField.requestFocus();} 
			else if (destinationTextField.hasFocus()) {originTextField.requestFocus();}
			else if (customerTextField.hasFocus()) {destinationTextField.requestFocus();}
			else if (typeTextField.hasFocus()) {customerTextField.requestFocus();}
			else if (carrierTextField.hasFocus()) {typeTextField.requestFocus();}
			else if (quantityTextField.hasFocus()) {weightTextField.requestFocus();}
			else if (dispatchDateTextField.hasFocus()) {quantityTextField.requestFocus();}
			else if (deliveryDateTextField.hasFocus()) {dispatchDateTextField.requestFocus();}
			else if (shipmentStatusTextField.hasFocus()) {deliveryDateTextField.requestFocus();}
			else if (paymentTextField.hasFocus()) {shipmentStatusTextField.requestFocus();}
			else if (carrierTextField.hasFocus()) {paymentTextField.requestFocus();}
			else if (searchTextField.hasFocus()) {carrierTextField.requestFocus();}
			else if (deleteTextField.hasFocus()) {carrierTextField.requestFocus();}
			else if (searchButton.hasFocus()) {searchTextField.requestFocus();}
			else if (searchButton.hasFocus()) {deleteButton.requestFocus();}
			
			else if (deleteButton.hasFocus()) {deleteTextField.requestFocus();}
			else if (showAllButton.hasFocus()) {logoutButton.requestFocus();}
			else if (clearButton.hasFocus()) {searchButton.requestFocus();}}
			

		if (e.getKeyCode() == KeyEvent.VK_DOWN){
            if (sellerTextField.hasFocus()) {shipmentIDTextField.requestFocus();} 
			else if (shipmentIDTextField.hasFocus()) {originTextField.requestFocus();} 
			else if (originTextField.hasFocus()) {destinationTextField.requestFocus();}
			else if (destinationTextField.hasFocus()) {customerTextField.requestFocus();}
			else if (customerTextField.hasFocus()) {typeTextField.requestFocus();}
			else if (typeTextField.hasFocus()) {carrierTextField.requestFocus();}
			else if (weightTextField.hasFocus()) { quantityTextField.requestFocus(); }
			else if (quantityTextField.hasFocus()) {dispatchDateTextField.requestFocus(); }
			else if (dispatchDateTextField.hasFocus()) {deliveryDateTextField.requestFocus(); }
			else if (deliveryDateTextField.hasFocus()) {shipmentStatusTextField.requestFocus(); }
			else if (shipmentStatusTextField.hasFocus()) {paymentTextField.requestFocus(); }
			else if (paymentTextField.hasFocus()) {carrierTextField.requestFocus(); }
			else if (carrierTextField.hasFocus()) {searchTextField.requestFocus(); }
			else if (searchTextField.hasFocus()) {searchButton.requestFocus();}
			else if (searchButton.hasFocus()) {clearButton.requestFocus();}
			else if (logoutButton.hasFocus()) {showAllButton.requestFocus();}}
			
		if (e.getKeyCode() == KeyEvent.VK_LEFT){   
			if (weightTextField.hasFocus()) {sellerTextField.requestFocus();}
			else if (quantityTextField.hasFocus()) {shipmentIDTextField.requestFocus();}
			else if (dispatchDateTextField.hasFocus()) {originTextField.requestFocus();}
			else if (deliveryDateTextField.hasFocus()) {destinationTextField.requestFocus();}
			else if (shipmentStatusTextField.hasFocus()) {customerTextField.requestFocus();}
			else if (paymentTextField.hasFocus()) {typeTextField.requestFocus();}
			else if (deleteTextField.hasFocus()) {searchTextField.requestFocus();}
			
			else if (deleteButton.hasFocus()) {searchButton.requestFocus();}
			else if (logoutButton.hasFocus()) {showAllButton.requestFocus();}
			else if (showAllButton.hasFocus()) {updateButton.requestFocus();}
			else if (updateButton.hasFocus()) {addButton.requestFocus();}
			else if (addButton.hasFocus()) {clearButton.requestFocus();}}
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (sellerTextField.hasFocus()) {weightTextField.requestFocus();}
			else if (shipmentIDTextField.hasFocus()) {quantityTextField.requestFocus();}
			else if (originTextField.hasFocus()) {dispatchDateTextField.requestFocus();}
			else if (destinationTextField.hasFocus()) {deliveryDateTextField.requestFocus();}
			else if (customerTextField.hasFocus()) {shipmentStatusTextField.requestFocus();}
			else if (typeTextField.hasFocus()) {paymentTextField.requestFocus();}
			else if (searchTextField.hasFocus()) {deleteTextField.requestFocus();}
			else if (searchButton.hasFocus()) {deleteButton.requestFocus();}
			else if (showAllButton.hasFocus()) {logoutButton.requestFocus();}
			else if (updateButton.hasFocus()) {showAllButton.requestFocus();}
			else if (addButton.hasFocus()) {updateButton.requestFocus();}
			else if (clearButton.hasFocus()) {addButton.requestFocus();}}	}	 

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

	public void actionPerformed(ActionEvent e){
		if(addButton == e.getSource())
		{System.out.println("ADD PRESSED");
			if(shipmentInfoList.getByShipmentID(shipmentIDTextField.getText())==null){
					if(!sellerTextField.getText().isEmpty() && 
					!shipmentIDTextField.getText().isEmpty() && 
					!originTextField.getText().isEmpty() && 
					!destinationTextField.getText().isEmpty() && 
					!customerTextField.getText().isEmpty()  && 
					!typeTextField.getText().isEmpty() && 
					!weightTextField.getText().isEmpty()  && 
					!quantityTextField.getText().isEmpty()  && 
					!dispatchDateTextField.getText().isEmpty() &&  
					!deliveryDateTextField.getText().isEmpty() &&  
					!shipmentStatusTextField.getText().isEmpty() && 
					!paymentTextField.getText().isEmpty()  && 
					!carrierTextField.getText().isEmpty()) {
						ShipmentInfo S = new ShipmentInfo(sellerTextField.getText(),
						shipmentIDTextField.getText(), 
						originTextField.getText(),
						destinationTextField.getText(), 
						customerTextField.getText(),
						typeTextField.getText(), 
						Float.parseFloat(weightTextField.getText()),
						Integer.parseInt(quantityTextField.getText()),
						dispatchDateTextField.getText(),  
						deliveryDateTextField.getText(),  
						shipmentStatusTextField.getText(), 
						Float.parseFloat(paymentTextField.getText()), 
						carrierTextField.getText());  									
												
							shipmentInfoList.insert(S);
							FileIO.writeShipmentInfoInFile(S);
							reloadData();}
				else{JOptionPane.showMessageDialog(this,"Please input all information.","Missing Data",JOptionPane.ERROR_MESSAGE);}}
			else{JOptionPane.showMessageDialog(this,"ID already in use, you cannot use this ID.","Error",JOptionPane.ERROR_MESSAGE);}}
	   
	    else if(updateButton == e.getSource()){
			System.out.println("UPDATE PRESSED");
			ShipmentInfo S = shipmentInfoList.getByShipmentID(shipmentIDTextField.getText());
			if (S!= null){
				if (!sellerTextField.getText().isEmpty()) {S.setSeller(sellerTextField.getText());}
				if (!originTextField.getText().isEmpty()) {S.setOrigin(originTextField.getText());}
				if (!destinationTextField.getText().isEmpty()) {S.setDestination(destinationTextField.getText());}
				if (!customerTextField.getText().isEmpty()) {S.setCustomer(customerTextField.getText());}
				if (!typeTextField.getText().isEmpty()) {S.setType(typeTextField.getText());}
				if (!weightTextField.getText().isEmpty()) {S.setWeight(Float.parseFloat(weightTextField.getText()));}
				if (!quantityTextField.getText().isEmpty()) {S.setQuantity(Integer.parseInt(quantityTextField.getText()));}
				if (!dispatchDateTextField.getText().isEmpty()) {S.setDispatchDate(dispatchDateTextField.getText());}
				if (!deliveryDateTextField.getText().isEmpty()) {S.setDeliveryDate(deliveryDateTextField.getText());}
				if (!shipmentStatusTextField.getText().isEmpty()) {S.setShipmentStatus(shipmentStatusTextField.getText());}
				if (!paymentTextField.getText().isEmpty()) {S.setPayment(Float.parseFloat(paymentTextField.getText()));}
				if (!carrierTextField.getText().isEmpty()) {S.setCarrier(carrierTextField.getText());}
				reloadData();
				JOptionPane.showMessageDialog(this, "Shipment information has been updated.");} 
				else {JOptionPane.showMessageDialog(this, "No information found to update.");}}
		
		else if(searchButton == e.getSource()){
			System.out.println("SEARCH PRESSED");	
			ShipmentInfo S = shipmentInfoList.getByShipmentID(searchTextField.getText());
			if(S!= null){displayArea.setText(S.getShipmentInfoAsString());}
			else{JOptionPane.showMessageDialog(this,"Shipment information is not found with this ID");}}
		
		else if(deleteButton == e.getSource()){System.out.println("DELETE BUTTON CLICKED");
			ShipmentInfo S = shipmentInfoList.getByShipmentID(deleteTextField.getText());
			if(S!=null){shipmentInfoList.removeByShipmentID(deleteTextField.getText());
				reloadData();}
			else{JOptionPane.showMessageDialog(this,"No information found with this ID","Error",JOptionPane.WARNING_MESSAGE);}}
			
		else if(showAllButton == e.getSource()){
			System.out.println("SHOWALL BUTTON PRESSED");
			reloadData();}
		
		else if(clearButton == e.getSource()){
			System.out.println("CLEAR BUTTON PRESSED");
			displayArea.setText(" ");
			JOptionPane.showMessageDialog(this, "Shipment information has been cleared.");}
			
		else if (logoutButton==e.getSource()){
			System.out.println("LOGOUT BUTTON PRESSED");
			previousPage.setVisible(true);
			this.dispose();}
	}
	
	public void reloadData(){displayArea.setText(shipmentInfoList.getAllShipmentInfoAsString());}
}