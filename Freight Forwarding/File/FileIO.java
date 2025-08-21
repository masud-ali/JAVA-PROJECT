package File;
import java.io.*;
import java.util.Scanner;
import Entity.*;
import EntityList.*;

public class FileIO{
	public static boolean checkUser(String userName, String userPassword){
			boolean flag = false;
			try{
				Scanner F = new Scanner(new File("./File/users.txt"));
				while(F.hasNextLine()){
					String line = F.nextLine();
					String data[] = line.split(";");
					if(userName.equals(data[1]) && userPassword.equals(data[2])){
						flag = true;
						break;}}
						
				F.close();}
			catch(Exception ex){
				System.out.println("Cannot Read File");
			}
			return flag;
	}
	
	public static void loadShipmentInfosFromFile(ShipmentInfoList shipmentInfoList){
			try{
				Scanner F = new Scanner(new File("./File/ShipmentInfos.txt"));
				while(F.hasNextLine()){
					String line = F.nextLine();
					String data[] = line.split(";");
					ShipmentInfo S = new ShipmentInfo(data[0],data[1],data[2],
									  data[3],data[4],data[5],Float.parseFloat(data[6]),
									  Integer.parseInt(data[7]),data[8],data[9],data[10],Float.parseFloat(data[11]),data[12]);
					shipmentInfoList.insert(S);
				}
				F.close();
			}
			catch(Exception ex){
				System.out.println("Cannot read file");
			}
	}
	
	public static void writeShipmentInfoInFile(ShipmentInfo S){
		try{
			FileWriter W = new FileWriter(new File("./File/ShipmentInfos.txt"),true);
			String line = S.getSeller()+";"+S.getShipmentID()+";"+S.getOrigin()+";"+S.getDestination()+";"+
						S.getCustomer()+";"+S.getType()+";"+S.getWeight()+";"+
					    S.getQuantity()+";"+S.getDispatchDate()+";"+S.getDeliveryDate()+";"+S.getShipmentStatus()+";"+
						S.getPayment()+";"+S.getCarrier()+"\n";
			W.write(line);
			W.flush();
			W.close();
		}
		catch(Exception ex){
			System.out.println("File not found");
		}
	}
}